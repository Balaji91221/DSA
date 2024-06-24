import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class sortwithoutextraspace{

    static void sort(Queue<Integer> q){
        int n =q.size();
        Integer arr[] = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i] = q.poll();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            q.add(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        int n = sw.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            q.add(sw.nextInt());
        }
        sort(q);
        
    }
}








//public class sortwithoutextraspace{

//     public static void sortQueue(Queue<Integer> queue) {
//         int n = queue.size();
        
//         for (int i = 0; i < n; i++) {
//             int minIndex = -1;
//             int minValue = Integer.MAX_VALUE;
//             int size = queue.size();

//             for (int j = 0; j < size; j++) {
//                 int current = queue.poll();

//                 if (current < minValue && j < size - i) {
//                     minValue = current;
//                     minIndex = j;
//                 }

//                 queue.add(current);
//             }

//             for (int j = 0; j < size; j++) {
//                 int current = queue.poll();

//                 if (j != minIndex) {
//                     queue.add(current);
//                 }
//             }

//             queue.add(minValue);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.println("Enter the number of elements in the queue:");
//         int n = scanner.nextInt();
        
//         Queue<Integer> queue = new LinkedList<>();
        
//         System.out.println("Enter the elements of the queue:");
//         for (int i = 0; i < n; i++) {
//             queue.add(scanner.nextInt());
//         }
        
//         System.out.println("Original queue: " + queue);
//         sortQueue(queue);
//         System.out.println("Sorted queue: " + queue);

//     }
// }
