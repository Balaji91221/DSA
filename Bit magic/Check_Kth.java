public class Check_Kth {
    public static void main(String[] args){
        int n = 5;
        int k = 2;

        if ((n & (1 << (k-1))) != 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
//Check Kth bit is set or not-studyfever
//step by step explanation
//1. 5 = 101
//2. 1 << (k-1) = 1 << (2-1) = 1 << 1 = 10
//3. 101 & 10 = 10 != 0
//4. print yes



//method 2
// public class Check_Kth {
//     public static void main(String[] args){
//         int n = 5;
//         int k = 2;
//         if (((n >> (k-1)) & 1) == 1)
//             System.out.println("Yes");
//         else
//             System.out.println("No");
//     }
// }
