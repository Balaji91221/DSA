import java.util.Scanner;

public class Array {

    static class mystack {
        int top;
        int cap;
        int[] arr;

        mystack(int c) {
            top = -1;
            cap = c;
            arr = new int[cap];
        }

        void push(int data) {
            if (top == cap - 1) {//5-1=4
                System.out.println("Stack overflow");
                return;
            }
            arr[++top] = data;
        }

        int pop() {
            if (top == -1) {
                System.out.println("Stack underflow");
                return -1;
            }
            return arr[top--];
        }

        int size() {
            return top + 1;
        }
        int peek(){
            if(top == -1){
                System.out.println("Stack underflow");
                return -1;
            }
            return arr[top];
        }

        boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        mystack s = new mystack(n);
        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
        }
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        sc.close();
    }
}
