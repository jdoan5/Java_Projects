package Guess_games;
import java.util.Scanner;
import java.util.Random;

public class guess_games_2 {
    private static char[][] board = new char[3][3]; // the game board
    private static char currentPlayer = 'X'; // the current player (X or O)
    
    public static void main(String[] args) {
        initBoard(); // initialize the game board
        printBoard(); // print the game board
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // get the row and column from the current player
            System.out.print("Player " + currentPlayer + ", enter row (1-3): ");
            int row = scanner.nextInt() - 1;
            System.out.print("Player " + currentPlayer + ", enter column (1-3): ");
            int col = scanner.nextInt() - 1;
            
            // check if the move is valid
            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
                System.out.println("Invalid move, try again.");
                continue;
            }
            
            // make the move and print the board
            board[row][col] = currentPlayer;
            printBoard();
            
            // check if the current player has won
            if (hasWon()) {
                System.out.println("Player " + currentPlayer + " has won!");
                break;
            }
            
            // check if the game is a tie
            if (isTie()) {
                System.out.println("The game is a tie!");
                break;
            }
            
            // switch to the other player
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
        
        scanner.close();
    }
    
    // initialize the game board
    private static void initBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }
    
    // print the game board
    private static void printBoard() {
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // check if the current player has won
    private static boolean hasWon() {
        // check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }
        
        // check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == currentPlayer && board[1][j] == currentPlayer && board[2][j] == currentPlayer) {
                return true;
            }
        }
        
        // check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
    }
}
