package placements_vitap;

import java.util.Arrays;
import java.util.Scanner;

public class Atheif43 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]<arr[i+1]){
                sum+=arr[i];

            }else{
                sum+=arr[i];
                int max=0;
                max=Math.max(sum, max);
                sum=0;

            }
            if(sum+arr[i]>sum){
                sum+=arr[i];
            }
            else{
                sum+=arr[i];
            }
            
        }
        System.out.println(sum);
    }
    
}
