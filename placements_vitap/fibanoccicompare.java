package placements_vitap;
import java.util.*;

public class fibanoccicompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        int series[] = new int[n];
        series[0] = 2; // The first number in the series
        if (n > 1) {
            series[1] = 1; // The second number in the series
        }
        
        for(int i = 2; i < n; i++){
            series[i] = series[i-1] + series[i-2];
        }
        
        int count = 0;
        for(int i = 0; i < n; i++){
            if(series[i] != arr[i]){
                count++;
            }
        }
        
        System.out.println(count);
    }
}
