import java.util.Scanner;
import java.util.Stack;

public class infixtopostfix {
  
    // Method to determine precedence of operators
    public static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        } else if (op == '^') {
            return 3;
        } else {
            return -1; // Default value if op is not recognized
        }
    }

    public static void infixToPostfix(String str) {
        String postfix = "";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) { // Operand
                postfix += ch;
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    postfix += st.pop();
                }
                st.pop(); // Remove '('
            } else { // Operator
                while (!st.isEmpty() && (precedence(ch) <= precedence(st.peek()))) {
                    postfix += st.pop();
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            postfix += st.pop();
        }
        System.out.println("" + postfix);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        String infixExpression = scanner.nextLine();
        infixToPostfix(infixExpression);
        scanner.close();
    }
}
