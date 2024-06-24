package Array;
import java.util.*;

public class twosum {

    static void two(int arr[] ,int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("The two elements are "+arr[i]+" and "+arr[j]);
                }
            }
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        two(arr, n);
        
    }
}
