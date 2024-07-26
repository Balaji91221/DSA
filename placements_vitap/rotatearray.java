package placements_vitap;
import java.util.Scanner;
public class rotatearray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int temp[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i=0;i<n;i++){
            temp[(i+k)%n] = arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }
    }
}