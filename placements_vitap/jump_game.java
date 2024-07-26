package placements_vitap;
import java.util.Scanner;

public class jump_game {
    static boolean canJump(int arr[],int n){
        int max=0;
        for(int i=0;i<n;i++){
            if(i>max){
                return false;
            }
            max = Math.max(max, i+arr[i]);
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean result = canJump(arr,n);
        System.out.println(result);

    }

}
