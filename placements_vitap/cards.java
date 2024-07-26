package placements_vitap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class cards {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] ch =new char[s.length()];
        for(int i=0;i<s.length();i++){
            ch[i]=s.charAt(i);
        }

        Arrays.sort(ch);
        if(ch[0]!=0){
            ch[0]='1';
        }
        if(ch[1]!=1){
            ch[1]='0';
        }
        System.out.println(ch);
    }
    
}
