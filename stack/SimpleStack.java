public class SimpleStack {
    private int[] a;
    private int top;
    private int size;

    public SimpleStack(int size) {
        this.size = size;
        this.a = new int[size];
        this.top = -1;
    }

    public void push(int n) {
        if (top >= size - 1) {
            System.out.println("Stack Overflow");
            return;
        } else {
            a[++top] = n;
            System.out.println("Pushed " + n + " onto the stack");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        } else {
            System.out.println("Popped " + a[top] + " from the stack");
            System.out.println("Top of stack now: " + a[top - 1]);
            top--;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        SimpleStack s = new SimpleStack(5); // Creating a stack with size 3
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop(); // This will print and remove 30
        s.push(40);
        s.push(50);
        s.pop(); // This will print and remove 30
    }
}
