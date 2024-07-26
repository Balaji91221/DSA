package placements_vitap;
import java.util.Scanner;
public class Nstones41 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        int c=s.nextInt();
        int cap=0;

        for(int i=0;i<n;i++){
            if(arr[i]+cap<=c){
                cap+=arr[i];
            }
            else{
                cap=arr[i];
            }
            
        }

    }
    
}
