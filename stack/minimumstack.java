import java.util.Scanner;
import java.util.Stack;
public class minimumstack {

    static Stack<Integer> s1 =new Stack<>();
    static Stack<Integer> s2 =new Stack<>();

    static  void push(int n){
        if(s1.isEmpty()){
            s1.push(n);
            s2.push(n);
        }
        else{
            s1.push(n);
            if(s1.peek()<s2.peek()){
                s2.push(n);
            }

        }
    }
    static int getmin(){
        return s2.peek();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            push(sc.nextInt());
            
            
        }
        System.out.println(getmin());
        sc.close();

    }
    
}


// Time Complexity: O(1)
// Space Complexity: O(n)
// Input: Enter the number of elements
// 5
// Enter the elements:
// 18
// 19
// 29
// 15
//20

// Output: 15

// import java.util.Scanner;
// import java.util.Stack;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         Stack<Integer> stack = new Stack<>();

//         System.out.print("Enter the number of integers: ");
//         int n = scanner.nextInt();

//         int min = Integer.MAX_VALUE;
//         System.out.println("Enter " + n + " integers:");
//         for (int i = 0; i < n; i++) {
//             int num = scanner.nextInt();
//             stack.push(num);
//             if (min > stack.peek()) {
//                 min = stack.peek();
//             }
//         }
        

//         System.out.println("Minimum value: " + min);
//     }
// }
// Time Complexity: O(n)
// Space Complexity: O(n)
