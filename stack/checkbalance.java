import java.util.Scanner;
import java.util.Stack;

public class checkbalance {

    static boolean matching(char a, char b) {
        return ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'));
    }

    static boolean checkb(String s) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(' || current == '{' || current == '[') {
                st.push(current);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else if (matching(st.top(), current)==false) {
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (checkb(s)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
        sc.close();
    }
}
