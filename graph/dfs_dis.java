import java.util.*;
public class dfs_dis {
    static void dfs(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[]){
        visited[s]=true;
        System.out.print(s+" ");
        for(int V:adj.get(s)){
            if(visited[V]==false){
                dfs(adj,V,visited);
            }
        }
    }
    static  int dfsDis(ArrayList<ArrayList<Integer>> adj,int v){
        boolean visited[]=new boolean[v];
        int count=0;
        for(int i=0;i<v;i++){
            if(visited[i]==false){
                dfs(adj,i,visited);
                count++;
                System.out.println();
            }
        }
        return count;
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
        System.out.println("DFS traversal of disconnected graph:");
        int count=dfsDis(adj, numVertices);
        System.out.println("Number of connected components: "+count);

    }
    
}

//input
// 7 6
// 0 1
// 0 2
// 1 3
// 4 5
// 4 6
// 5 6
//output
// DFS traversal of disconnected graph:
// 0 1 3
// 2
// 4 5 6
// Number of connected components: 3
