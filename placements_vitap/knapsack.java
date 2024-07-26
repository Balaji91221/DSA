package placements_vitap;

import java.util.Scanner;

public class knapsack {
    static int max(int a, int b){
        return (a > b) ? a : b;
    }
    

    static int knap(int[] wt, int[] val, int w, int n, int[][] dp){
        if(n < 0 || w == 0){
            return 0;
        }
        if(dp[n][w] != -1){
            return dp[n][w];
        }
        if(wt[n]>w){
            return dp[n][w] = knap(wt, val, w, n-1, dp);
        }
        else{
            return dp[n][w] = Math.max(val[n] + knap(wt, val, w-wt[n], n-1, dp), knap(wt, val, w, n-1, dp));
        
        }
    }
    static int knapsack(int[]wt,int[] val,int w,int n){
        int dp[][] = new int[n+1][w+1];
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < w+1; j++){
                dp[i][j] = -1;
            }
        }
        return knap(wt, val, w, n, dp);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int w = s.nextInt();
        int[] wt = new int[n];
        int[] val = new int[n];
        for(int i = 0; i < n; i++){
            wt[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++){
            val[i] = s.nextInt();
        }
        System.out.println(knapsack(wt, val, w, n-1));
    }
}