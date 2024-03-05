import java.util.Scanner;
import java.util.Stack;

public class longestvaildparenthesis{

    public static void longestvp(String s) {
        int n = s.length();
        int max = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') st.push(i);
            else {
                st.pop();
                if (st.isEmpty()) st.push(i);
                else max = Math.max(max, i - st.peek());
            }
        }
        System.out.println("Length of longest valid parentheses substring: " + max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        longestvp(s);
        scanner.close();
    }
}



// import java.util.Scanner;
// import java.util.Stack;

// public class longestvaildparenthesis{

//     public static void longestvp(String s) {
//         int n = s.length();
//         int max = 0;
//         Stack<Integer> st = new Stack<>();
//         st.push(-1);
//         for (int i = 0; i < n; i++) {
//             System.out.println("Processing character at index " + i + ": " + s.charAt(i));
//             if (s.charAt(i) == '(') {
//                 st.push(i);
//                 System.out.println("Pushed index " + i + " onto the stack");
//             } else {
//                 st.pop();
//                 if (st.isEmpty()) {
//                     st.push(i);
//                     System.out.println("Stack became empty, pushed index " + i + " onto the stack");
//                 } else {
//                     int length = i - st.peek();
//                     max = Math.max(max, length);
//                     System.out.println("Popped index " + st.peek() + " from the stack");
//                     System.out.println("Current length of valid substring: " + length);
//                     System.out.println("Current max length: " + max);
//                 }
//             }
//         }
//         System.out.println("Length of longest valid parentheses substring: " + max);
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String s = scanner.nextLine();
//         longestvp(s);
//         scanner.close();
//     }
// }

