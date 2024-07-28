import java.util.Scanner;

public class spiralmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;
        while(startRow <= endCol && startCol <= endCol) {
            for(int j=startCol; j<=endCol; j++) {
                System.out.print(arr[startRow][j]+" ");
            }
            
            for(int i=startRow+1; i<=endRow; i++) {
                System.out.print(arr[i][endCol]+" ");
            }

            for(int j=endCol-1; j>=startCol; j--) {
                if(startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][j]+" ");
            }

            for(int i=endRow-1; i>startRow; i--) {
                if(startCol == endCol) {
                    break;
                }
                System.out.print(arr[i][startCol]+" ");
            }

            startCol++; startRow++;
            endCol--; endRow--;
        }

        System.out.println();
    }

    }

