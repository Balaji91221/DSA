//wrapper class for sorting
import java.util.*;
public class DO{
    public static void main(String[] args) {
        Integer[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.print( Arrays.toString(arr));
        }
    
}