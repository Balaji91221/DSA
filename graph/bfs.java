import java.util.*;
public class bfs {
    static void bfs(ArrayList<ArrayList<Integer>> adj,int s,int v){
        boolean visited[] =new boolean[v+1];
        Queue<Integer> q=new LinkedList<>();
        visited[s]=true;
        q.add(s);
        while(!q.isEmpty()){
            int u=q.poll();
            System.out.print(u+" ");
            for( int V : adj.get(u)){
                if(visited[V]==false){
                    visited[V]=true;
                    q.add(V);
                }
            }
        }

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
        System.out.println("Enter the starting vertex for BFS:");
        int s = scanner.nextInt();
        System.out.println("BFS traversal:");
        bfs(adj, s, numVertices);
    }
    
}
