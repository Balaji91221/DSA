package placements_vitap;
import java.util.Scanner;
public class missedalphated {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        boolean[] present = new boolean[26];
        for(char ch : s.toCharArray()){
          if(Character.isLetter(ch))
            present[ch-'a'] = true;
        }
        
        for(int i=0 ; i<26 ; i++){
            if(!present[i]){
              System.out.print((char)(i+'a'));
            }
        }
      }
    
}
