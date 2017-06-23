package ICSE_Projects;

// a prgram from internet of the tic-tac-toe game... not logically accurate and not working
import java.util.*;
public class Proj5 {
    public static void main() {
        Scanner s = new Scanner(System.in);
        char[][] board = new char[3][3];
 
        //fill with _ for blank spots
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }
 
        //count how many moves have been made
        int moves = 0;
 
        //keep track of whose turn it is
        char turn = 'X';
 
        //print the initial board
        System.out.println("Current board: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
 
    //keep playing while less than 9 moves
        while (moves < 9) {
    //YOU DO THIS
    //Ask the user for the row and the column
 
    //check to see that it is a valid move (row/col should be from 0-2,
    //and that value in the array should be '_' for empty)
 
    //If it is valid:
    //place the user's piece (turn) at that spot in the array
    //print the board (copy and paste the loops above that printed the initial board)
 
                //check for a winner
                         int column;
            int row;
            System.out.print("Player X, enter row: ");
            row = Integer.parseInt(s.nextLine());
            System.out.print("Player X, enter column: ");
            column = Integer.parseInt(s.nextLine());
            if (moves == 1 || moves == 3 || moves == 5 || moves == 7 || moves == 9 && 
row == 0 || row == 1 || row == 2 && column == 0 || column == 1 || column == 2){
                 
             }
    if (moves == 2 || moves == 4 || moves == 6 || moves == 8 && 
 row == 0 || row == 1 || row == 2 && column == 0 || column == 1 || column == 2) {
                  
             }
                boolean win = false;
                for (int i = 0; i < 3; i++) {
                    //checks for three in a row
                    if (board[i][0] == board[i][1] &&
                        board[i][1] == board[i][2] &&
                        board[i][0] == turn) win = true;
 
                    //checks for three in a column
                    if (board[0][i] == board[1][i] &&
                        board[1][i] == board[2][i] &&
                        board[0][i] == turn) win = true;
                }
 
                //YOU DO THIS
                //check for three on a diagonal (note that there are two diagonals)
 
                //Prints who won
                if (win) {
                    System.out.println(turn + " wins!");
 
                    //end the game
                    break;
                }
 
                //YOU DO THIS
                //switch whose turn it is
                //if turn is 'X' right now, make it 'O'
                //otherwise, make it 'X'
 
                //One more move has gone by
                moves++;
        }
        //if moves made it to 9, must be a tie
        if (moves == 9) System.out.println("Tie game.");
}}

