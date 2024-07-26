package placements_vitap;

import java.util.Scanner;

public class coom {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        int[] count1=new int[26];
        int[] count2=new int[26];

        for(char ch:str1.toCharArray()){
            count1[ch-'a']++;
        }
        for(char ch:str2.toCharArray()){
            count2[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            int minCount=Math.min(count1[i],count2[i]);
            for(int j=0;j<minCount;j++){
                System.out.print((char)('a'+i));
            }

        }
    }
}
