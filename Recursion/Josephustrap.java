import java.util.Scanner;
class Josephustrap{
    static int jos(int n,int k){  //5 3
        if(n==1) 
        return 1;
        return (jos(n-1,k)+k-1)%n+1;  //3
    }
    public static void main(String ar[]){
        Scanner sw = new Scanner(System.in);
        int n = sw.nextInt(); //no of prisoners
        int k = sw.nextInt(); //order of execution or punishment
        System.out.print(jos(n,k));
    }
}