import java.util.*;

public class bfs_dis {
    static void bfs(ArrayList<ArrayList<Integer>> adj, int s,  boolean visited[]) {
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int V : adj.get(u)) {
                if (!visited[V]) {
                    visited[V] = true;
                    q.add(V);
                }
            }
        }
    }

    static void bfsDis(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean visited[] = new boolean[v + 1];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                bfs(adj, i,  visited);
                System.out.println(); // To separate components in the output
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numVertices = scanner.nextInt();
        int numEdges = scanner.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < numEdges; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        System.out.println("BFS traversal of disconnected graph:");
        bfsDis(adj, numVertices);
    }
}


//count connected components in a graph
// import java.util.*;
// public class bfs_dis {
//     static void bfs(ArrayList<ArrayList<Integer>> adj, int s,  boolean visited[]) {
//         Queue<Integer> q = new LinkedList<>();
//         visited[s] = true;
//         q.add(s);
//         while (!q.isEmpty()) {
//             int u = q.poll();
//             System.out.print(u + " ");
//             for (int V : adj.get(u)) {
//                 if (!visited[V]) {
//                     visited[V] = true;
//                     q.add(V);
//                 }
//             }
//         }
//     }


//     static void int bfsDis(ArrayList<ArrayList<Integer>> adj, int v) {
//         boolean visited[] = new boolean[v + 1];
//         int count=0;
//         for (int i = 0; i < v; i++) {
//             if (!visited[i]) {
//                 bfs(adj, i,  visited);
//                 count++;
//                 System.out.println(); // To separate components in the output
//             }
// return count;
//         }
//         System.out.println("Number of connected components: "+count);
//     }
