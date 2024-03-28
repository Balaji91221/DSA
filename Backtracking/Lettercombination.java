package Backtracking;

import java.util.Scanner;

public class Lettercombination {
    static String[] keypad = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static void com(String s,String res){
        if(s.length()==0){
            StringBuilder reversedString = new StringBuilder(res).reverse();
            System.out.println(reversedString);
            return;
        }
        String key=keypad[s.charAt(0)-'0'];
        for(int i=0;i<key.length();i++){
            com(s.substring(1),res+key.charAt(i));
        }


    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String s = sc.next();
        StringBuilder reversedString = new StringBuilder(s).reverse();
        s=reversedString.toString();
        com(s," ");


        
    }
}



//problem statement : Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
// Example : 23
// output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
// Example : 2
// output: ["a", "b", "c"]
// Expected time complexity is O(4^n) where n is the length of the input string
// Expected space complexity is O(4^n) where n is the length of the input string