package Array;
import java.util.*;
public  class Largestelement {

    static int lar(int[] arr,int n){
        int max=arr[0];
         n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        
        System.out.println(lar(arr, n));
        
    }
    
}
