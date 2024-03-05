import java.util.Scanner;
import java.util.Stack;

public class implementQusingS {
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean enqueue(int x) {
            while (!s1.isEmpty()) { // Transfer elements from s1 to s2
                s2.push(s1.pop());
            }
            s1.push(x); // Push the new element to s1
            while (!s2.isEmpty()) { // Transfer elements from s2 back to s1
                s1.push(s2.pop());
            }
        }
    
        public int dequeue() {
            if (s1.isEmpty()) {
                return -1;
            }
            return s1.pop(); // Remove and return the front element from s1
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        Queue q = new Queue();
        System.out.println("Queue elements are:");
        for (int i = 0; i < len; i++) {
            q.enqueue(scanner.nextInt());
            System.out.println(q.enqueue(i));
        }
       
            System.out.print(q.dequeue() + " ");
        
    
    }
}
