package Backtracking;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    static ArrayList<String> l = new ArrayList<String>();

    static String[] swap(String s[], int i, int j) {
        String temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        return s;
    }

    static void permute(String s[], int l, int r) {
        if (l == r) {
            print(s);
            return;
        } else {
            for (int i = l; i <= r; i++) {
                s = swap(s, l, i);
                permute(s, l + 1, r);
                s = swap(s, l, i);
            }
        }
    }

    static void print(String s[]) {
        String p = "";
        for (String c : s) {
            p += c;
        }
        l.add(p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        String str = sc.next();
        String s[] = str.split("");
        permute(s, 0, s.length - 1);
        Collections.sort(l);
        for (String permutation : l) {
            System.out.println(permutation + " ");
        }
    }
}
