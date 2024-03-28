
import java.util.Stack;
import java.util.Scanner;
public class celebrity{

    static void celeb(int a[][]){
        Stack<Integer> st = new Stack<>();
        int n=a.length;
        for(int i=0;i<n;i++){
            st.push(i);
            while (st.size() >2) {
                int c=st.pop();
                int d=st.pop();
                if(a[c][d]==1){
                    st.push(d);
                }
                else{
                    st.push(c);
                }
                int pc=st.pop();
                for(int j=0;j<n;j++){
                    if(j!=pc){
                        if(a[j][pc]==0 || a[pc][j]==1){
                            System.out.println("No celebrity");
                            return;
                        }
                    }
                }
                System.out.println("celebrity is "+(pc+1));
            }
        }
        }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        celeb(a);
        
    }
    
}
