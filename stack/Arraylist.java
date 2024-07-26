import java.util.Scanner;
import java.util.ArrayList;

public class Arraylist {

    static class mystack {
        ArrayList<Integer> arr = new ArrayList<>();

        void push(int data) {
            arr.add(data);
        }

        int pop() {
            if (arr.isEmpty()) {
                System.out.println("Stack underflow");
                return -1;
            }
            int res = arr.remove(arr.size() - 1);
            return res;
        }

        int size() {
            return arr.size();
        }

        int peek() {
            if (arr.isEmpty()) {
                System.out.println("Stack underflow");
                return -1;
            }
            return arr.get(arr.size() - 1);
        }

        boolean isEmpty() {
            return arr.isEmpty();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        mystack s = new mystack();
        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
        }
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        sc.close();
    }
}
