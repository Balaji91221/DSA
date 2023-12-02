public class powerset {
    static void printPowerSet(String str) {
        int n = str.length();
        int powSize = (int) Math.pow(2, n);

        for (int counter = 0; counter < powSize; counter++) {
            for (int j = 0; j < n; j++) {
                if ((counter & (1 << j)) != 0) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPowerSet(str);
    }
    
}
//description
//https://www.geeksforgeeks.org/power-set/
//https://www.geeksforgeeks.org/power-set-lexicographic-order/

// powerset
// Difficulty Level : Medium
// Last Updated : 08 Apr, 2021
// Given a string S find all possible substrings of the string in lexicographically-sorted order.
// Example 1:
// Input : str = "abc"
// Output: a ab abc ac b bc câ€‹
// Explanation : There are 7 substrings that
// can be formed from abc.