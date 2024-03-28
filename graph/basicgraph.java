import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class basicgraph {

    static class graph{
        LinkedList<Integer> adj[];
        graph(int v){
            adj  = new LinkedList[v];
            for(int i=0;i<v;i++){
                adj[i] = new LinkedList<Integer>();
            }
        }

        void Insertedge(int s,int d){
            adj[s].add(d);
            adj[d].add(s);
        }
        void dfs(int s){
            boolean visited[] = new boolean[adj.length];
            Stack<Integer> st = new Stack<Integer>();
            st.push(s);
            visited[s] = true;
            while(!st.isEmpty()){
                int n = st.pop();
                System.out.println(n + " ");
                for(int i=0;i<adj[n].size();i++){
                    int v = adj[n].get(i);
                    if(visited[v]!=true){
                        st.push(v);
                        visited[v] = true;
                    }
                }
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices and edges");
        int v = sc.nextInt();
        int e = sc.nextInt();
        System.out.println("Enter the number of paths");
        graph g = new graph(v);
        for(int i=0;i<e;i++){
            int s = sc.nextInt();
            int d = sc.nextInt();
            System.out.println(s+"->"+d);
            g.Insertedge(s, d);
        }
        System.out.println("Enter the source vertex");
        int s = sc.nextInt();
        g.dfs(s);
        sc.close();

        
    }
}
