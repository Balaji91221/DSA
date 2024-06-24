package Dynamicprogramming;
import java.util.Arrays;

public class tsp {

    static int V = 4; // Number of vertices

    // Function to find the minimum weight Hamiltonian Cycle
    static int tsp1(int graph[][], int mask, int pos, int dp[][]) {
        // If all vertices have been visited
        if (mask == (1 << V) - 1) {
            return graph[pos][0];
        }
        
        // If this subproblem is already solved
        if (dp[mask][pos] != -1) {
            return dp[mask][pos];
        }

        int ans = Integer.MAX_VALUE;
        // Try to go to every other vertex not already visited
        for (int i = 0; i < V; i++) {
            if ((mask & (1 << i)) == 0) { // If ith vertex is not visited
                int newAns = graph[pos][i] + tsp1(graph, mask | (1 << i), i, dp);
                ans = Math.min(ans, newAns);
            }
        }
        return dp[mask][pos] = ans;
    }

    // Main function to solve TSP
    static int solveTSP(int graph[][]) {
        // DP array to store solutions to subproblems
        int dp[][] = new int[1 << V][V];
        for (int i = 0; i < (1 << V); i++) {
            Arrays.fill(dp[i], -1);
        }
        return tsp1(graph, 1, 0, dp);
    }

    public static void main(String[] args) {
        int graph[][] = { { 0, 10, 15, 20 }, 
                          { 10, 0, 35, 25 }, 
                          { 15, 35, 0, 30 }, 
                          { 20, 25, 30, 0 } };
        System.out.println("Minimum cost of the Travelling Salesman Tour is: " + solveTSP(graph));
    }
}
