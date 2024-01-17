import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Csort {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(2);
        l.add(32);

        // Use Collections.sort for sorting a List
        Collections.sort(l);
        System.out.println("Ascending order: " + l);

        // Use Collections.sort with Collections.reverseOrder() for descending order
        Collections.sort(l, Collections.reverseOrder());
        System.out.println("Descending order: " + l);
    }
}
