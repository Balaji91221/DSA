package Backtracking;

import java.io.*;
import java.util.*;


public class graphColoring {
    
    static int V=5;
    static LinkedList<Integer> adj[];

    graphColoring(){
        adj = new LinkedList[V];
        for(int i=0;i<V;i++){
            adj[i] = new LinkedList<>();
        }
    }

    static void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
    }

    static void graph(){
        int[] result = new int[V];
        Arrays.fill(result, -1);
        result[0] = 0;
        boolean available[] = new boolean[V];
        Arrays.fill(available, true);
        for(int u=0; u<V; u++){
            Iterator<Integer> it = adj[u].iterator();
            while(it.hasNext()){
                int i = it.next();
                if(result[i] != -1){
                    available[result[i]] = false;
                }
            }
            int color = 0;
            for(color = 0; color < V; color++){
                if(available[color]){
                    break;
                }
            }
            result[u] = color;
            Arrays.fill(available, true);
        }
        for(int u=0; u<V; u++){
            System.out.println("vertex " + u + " color " + result[u]);
        }
    }
    
    public static void main(String[] args) {
        graphColoring g1 = new graphColoring();
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(1, 2);
        g1.addEdge(1, 3);
        g1.addEdge(2, 3);
        g1.addEdge(3, 4);
        System.out.println("Coloring of graph 1");
        g1.graph();
    }
}
