package placements_vitap;

import java.util.Scanner;

public class nonnegative {

    public static String maxIndex(int[] arr, String s) {
        
        for (int i = 0; i < s.length(); i++) {
            int t = s.charAt(i) - '0';
            if (t < arr[t]) {
                s = s.substring(0, i) + arr[t] + s.substring(i + 1);
            } else if (t > arr[t]) {
                break;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        String result = maxIndex(arr, s);
        System.out.println(result);
    }
}
