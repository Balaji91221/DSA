 package Array;

import java.util.Scanner;

public class missingelement {
    static int miss(int[] arr,int n){
        int total=n*(n+1) /2;
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum=sum+arr[i];
        }
        return total-sum;
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        miss(arr,n);
    }
}