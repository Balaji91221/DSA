public class bufferfly {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");

            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //2nd half
        //stars
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//output
// *                   *
// * *               * *
// * * *           * * *
// * * * *       * * * *
// * * * * * * * * * * *
// * * * * * * * * * * *
// * * * *       * * * *
// * * *           * * *
// * *               * *
// *                   *