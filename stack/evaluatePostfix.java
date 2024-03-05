import java.util.Scanner;
import java.util.Stack;
public class evaluatePostfix
{
    public static int evaluate(String s) {
        Stack<Integer> st =new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                st.push(ch-'0');
            }
            else{
                int val1 = st.pop();
                int val2 = st.pop();
                switch(ch){
                    case '+':
                    st.push(val2+val1);
                    break;
                    case '-':
                    st.push(val2-val1);
                    break;
                    case '*':
                    st.push(val2*val1);
                    break;
                    case '/':
                    st.push(val2/val1);
                    break;
                }
            }
        }
        return st.pop();

    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a postfix expression: ");
        String s = scanner.nextLine();
        System.out.println("Result: " + evaluate(s));
        scanner.close();
    }
}