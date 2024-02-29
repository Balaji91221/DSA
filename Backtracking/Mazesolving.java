package Backtracking;
import java.util.Scanner;

 public class Mazesolving {
     static boolean issafe(int a[][],int x,int y,int n){
         return (x>=0&&x<n&&y>=0&&y<n&&a[x][y]==1);
        }
        static boolean solve(int a[][],int x,int y,int sol[][],int n){
            if(x==n-1&&y==n-1){
                sol[x][y]=1;
            return true;
        }
        
        if(issafe(a,x,y,n)==true){
            sol[x][y]=1;
            if(solve(a,x+1,y,sol,n))
            return true;
            if(solve(a,x,y+1,sol,n)) 
            return true;
            sol[x][y]=0;
            return false;
        }
        return false;
    }

    static void printsol(int sol[][],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) System.out.print(" "+sol[i][j]+" ");
            System.out.println();
        }
    }
    static boolean solvemaze(int a[][],int n){
        int sol[][]=new int[n][n];//to store o/P
        if(solve(a,0,0,sol,n)==false){ //to check path is there or not
            System.out.print("solution doesn't exist");
            return false;
        }
        printsol(sol,n);
        return true;
    }
    public static void main(String ar[]){
        Scanner sw = new Scanner(System.in);
        int n = sw.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) a[i][j]=sw.nextInt();
        }
        solvemaze(a,n);
    }
}
// Time Complexity: O(2^(n^2))
// Space Complexity: O(n^2)
// Input:
// 4
// 1 0 0 0
// 1 1 0 1
// 0 1 0 0
// 1 1 1 1