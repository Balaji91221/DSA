import java.util.Scanner;
class Main{
    static int jos(int n,int k){  //5 3
        if(n==1)  //if only one prisoner is there then no one will be saved so answer is 0.
        return 0;
        return (jos(n-1,k)+k)%n;  //3
    }
    public static void main(String ar[]){
        Scanner sw = new Scanner(System.in);
        int n = sw.nextInt(); //no of prisoners
        int k = sw.nextInt(); //order of execution or punishment
        System.out.print(jos(n,k)+1);
    }
}