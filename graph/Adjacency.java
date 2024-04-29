import java.util.*;

public class Adjacency {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print("Vertex " + i + ": ");
            for (int j : adj.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter the number of vertices: ");
        int numVertices = scanner.nextInt();
        System.out.print("Enter the number of edges: ");
        int numEdges = scanner.nextInt();
    
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adj.add(new ArrayList<Integer>());
        }
    
        System.out.println("Enter the edges (format: u v):");
        for (int i = 0; i < numEdges; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            addEdge(adj, u, v);
        }
    
        System.out.println("Adjacency list representation of the graph:");
        printGraph(adj);
    }
}    

//input
// 5 4
// 0 1
// 0 2
// 1 3
// 2 4
//output
// Enter the number of vertices: 5
// Enter the number of edges: 4
// Enter the edges (format: u v):
// 0 1
// 0 2
// 1 3
// 2 4
// Adjacency list representation of the graph:
// Vertex 0: 1 2
// Vertex 1: 0 3
// Vertex 2: 0 4
// Vertex 3: 1
// Vertex 4: 2
// Time Complexity: O(V + E), where V is the number of vertices and E is the number of edges in the graph.
