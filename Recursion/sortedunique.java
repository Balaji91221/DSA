import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class sortedunique {
    public List<String> permute(char input[]) {
        Map<Character, Integer> countMap = new TreeMap<>();
        for (char ch : input) {
            countMap.compute(ch, (key, val)-> {
                if (val == null) {
                    return 1;
                } else {
                    return val + 1;
                }
            });
        }
        char str[] = new char[countMap.size()];
        int count[] = new int[countMap.size()];
        int index = 0;
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            str[index] = entry.getKey();
            count[index] = entry.getValue();
            index++;
        }
        List<String> resultList = new ArrayList<>();
        char result[] = new char[input.length];
        permuteUtil(str, count, result, 0, resultList);
        return resultList;
    }

    public void permuteUtil(char str[], int count[], char result[], int level, List<String> resultList) {
        if (level == result.length) {
            resultList.add(new String(result));
            return;
        }
        for(int i = 0; i < str.length; i++) {
            if(count[i] == 0) {
                continue;
            }
            result[level] = str[i];
            count[i]--;
            permuteUtil(str, count, result, level + 1, resultList);
            count[i]++;
        }
    }

    private void printArray(char input[]) {
        for(char ch : input) {
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the input string: ");
        String inputString = scanner.nextLine();

        sortedunique sp = new sortedunique();
        sp.permute(inputString.toCharArray()).forEach(s-> System.out.println(s));
    }
}






// ///
// import java.util.*;

// public class sortedunique {

//     static int factorial(int n) {
//         int f = 1;
//         for (int i = 2; i <= n; i++) {
//             f *= i;
//         }
//         return f;
//     }

//     static void print(char[] temp) {
//         for (int i = 0; i < temp.length; i++) {//temp=1 2 3 
//             System.out.print(temp[i]);
//         }
//         System.out.println();
//     }

//     static int calper(char[] temp, int n) {
//         int f = factorial(n);
//         HashMap<Character, Integer> hm = new HashMap<>();
//         for (int i = 0; i < temp.length; i++) {
//             if (hm.containsKey(temp[i])) {
//                 hm.put(temp[i], hm.get(temp[i]) + 1);
//             } else {
//                 hm.put(temp[i], 1);
//             }
//         }

//         for (Map.Entry<Character, Integer> e : hm.entrySet()) {
//             Integer x = e.getValue();
//             if (x > 1) {
//                 int temp5 = factorial(x);
//                 f = f / temp5;
//             }
//         }

//         return f;
//     }

//     static void nextPermutation(char[] temp) { // explain the method with example
//         // 1 2 3// 1 3 2// 2 1 3// 2 3 1// 3 1 2// 3 2 1
//         int i;// 2
//         for (i = temp.length - 1; i > 0; i--) {// 2
//             if (temp[i] > temp[i - 1]) {// 3>2
//                 break;// i=2
//             }
//         }

//         if (i == 0) { // 0
//             Arrays.sort(temp);// 1 2 3
//             return;// 1 2 3
//         }

//         int min = i; // 2
//         int x = temp[i - 1];// 2

//         for (int j = i + 1; j < temp.length; j++) {// 3
//             if ((temp[j] < temp[min]) && (temp[j] > x)) {// 3<2 && 3>2
//                 min = j;// 3
//             }
//         }

//         char temp_to_swap = temp[i - 1];// 2
//         temp[i - 1] = temp[min];// 3
//         temp[min] = temp_to_swap;// 2

//         Arrays.sort(temp, i, temp.length);// 1 3 2 temp=1 3 2 where i=1 temp.length=3

//         print(temp);// 1 3 2
//     }

//     static void printAllPermutations(String s) {
//         char[] temp = s.toCharArray();
//         Arrays.sort(temp);
//         print(temp);
//         int total = calper(temp, temp.length);
//         for (int i = 1; i < total; i++) {
//             nextPermutation(temp);
//         }
//     }

//     public static void main(String[] args) {
//         String s = "123";
//         printAllPermutations(s);
//     }
// }
