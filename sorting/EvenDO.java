import java.util.Arrays;
import java.util.Comparator;
class mycp implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return a%2 - b%2;
    }
}

public class EvenDO {
    public static void main(String[] args) {
        Integer[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
        Arrays.sort(arr, new mycp());
        System.out.print( Arrays.toString(arr));
        }
    
}