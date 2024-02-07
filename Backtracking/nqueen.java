package Backtracking;
import java.util.Scanner;

public class nqueen {
    static boolean isSafe(int board[][], int row, int col) {
        int N = board.length;
        int i, j;

        for (j = col; j >= 0; j--){
            if (board[row][j] == 1){
                return false;
            }
                
        }
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--){
            if (board[i][j] == 1){
                return false;
            }
        }

        // Check lower diagonal on left side
        for (i = row, j = col; j >= 0 && i < N; i++, j--){
            if (board[i][j] == 1){
                return false;
            }
        }
        return true;
    }

    static boolean solveNQUtil(int board[][], int col) {
        int N = board.length;
        if (col >= N)
            return true;

        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;
                if (solveNQUtil(board, col + 1))
                    return true;
                board[i][col] = 0; // Backtrack
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the chessboard: ");
        int N = scanner.nextInt();

        int board[][] = new int[N][N];
        if (solveNQUtil(board, 0)) {
            System.out.println("Solution:");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++)
                    System.out.print(" " + board[i][j] + " ");
                System.out.println();
            }
        } else
            System.out.println("Solution does not exist");
    }
}



