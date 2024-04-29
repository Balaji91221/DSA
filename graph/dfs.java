import java.util.*;

public class dfs {

    static void dfsrec(ArrayList<ArrayList<Integer>> adj, int s, boolean visited[]) {
        visited[s] = true;
        System.out.print(s + " ");
        for (int V : adj.get(s)) {
            if (!visited[V]) {
                dfsrec(adj, V, visited); // Corrected parameter
            }
        }
    }

    static void dfs(ArrayList<ArrayList<Integer>> adj, int v, int s) {
        boolean visited[] = new boolean[v + 1];
        dfsrec(adj, s, visited);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numVertices = scanner.nextInt();
        int numEdges = scanner.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adj.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < numEdges; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        System.out.println("Enter the starting vertex for DFS:");
        int s = scanner.nextInt();
        System.out.println("DFS traversal:");
        dfs(adj, numVertices, s);

        scanner.close(); 
    }
}

//input
// 5 4
// 0 1
// 0 2
// 1 3
// 2 4
//output
// Enter the starting vertex for DFS:
// 0
// DFS traversal:
// 0 1 3 2 4
// Time Complexity: O(V + E), where V is the number of vertices and E is the number of edges in the graph.