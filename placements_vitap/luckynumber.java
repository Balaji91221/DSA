package placements_vitap;
import java.util.Scanner;

public class luckynumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); 
        s.nextLine(); 

        int sum = 0;
        for (int i = 0; i < n; i++) {
            String S = s.nextLine(); 
            Character ch = S.charAt(i);
            
            if (Character.isLowerCase(ch)) {
                    sum += ch - 'a' + 1;
                } else if (Character.isUpperCase(ch)) {
                    sum += ch - 'A' + 1;
                }
                
            }

            
            while (sum >= 10) {
                int tempSum = 0;
                while (sum > 0) {
                    tempSum += sum % 10;
                    sum /= 10;
                }
                sum = tempSum;
            }

            
            System.out.println(sum);
        }
    }

