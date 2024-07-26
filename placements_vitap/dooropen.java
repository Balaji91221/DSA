package placements_vitap;

import java.util.Scanner;

public class dooropen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }

        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
                for(int j=i;j<n;j++){
                    arr[j]=arr[i];
                }


            }
            System.out.println(count);
        }
    }
}
