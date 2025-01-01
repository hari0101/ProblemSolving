package day4_practicalwork;

import java.util.Arrays;

public class NxNQueensProblem {
	
	public static void main(String[] args) {
		int N = 4;
		char[][] queens = new char[N][N];
		
		//Inserting characters for NxN matrix.
		for(int i = 0; i < N; i++) {
			Arrays.fill(queens[i], 'x');		
		}
		
		nQueensProblem(queens, 0, N);
	}
	
	static void nQueensProblem(char[][] queen, int row, int n) {
		//print if the recursion reached.
		if(row == n) {
			printChessBoard(queen);
		}
		else
		{
			for(int col = 0; col < n; col ++) {
				//Check the queen is placed correctly.
				if(isQueenSafe(queen, row, col, n)) {
					queen[row][col] = 'Q';
					//recursion called for different rows so the first time queen is placed correctly.
					nQueensProblem(queen, row+1, n);
					//Undo the changes done in the recursion.
					queen[row][col] = 'x';
				}
			}
		}
	}
	
	//Checking the queen is placed correctly in multiple combinations
	static boolean isQueenSafe(char[][] board, int row, int col, int n) {
		//Column check.
		for(int i = 0; i < n; i++) {
			if(board[i][col] == 'Q') {
				return false;
			}
		}
		
		//Row check
		for(int i = 0; i < n; i++) {
			if(board[row][i] == 'Q') {
				return false;
			}
		}
		
		//Check queen is present in RIGHT-to-LEFT diagonal
		for(int r=row, c=col ; r>=0 && c>=0 ; r--, c--) {
			if(board[r][c] == 'Q') {
				return false;
			}
		}
		
		//Check queen is present in LEFT-to-RIGHT diagonal
		for(int r=row, c=col; r>=0 && c<n ;r--,c++)
			if(board[r][c] =='Q')
				return false;
		
		return true;
	}
	
	//Printing the possible N queen places
	static void printChessBoard(char[][] chess) {
		
		for(char r = 0; r < chess.length; r++) {
			for(char c = 0; c < chess[r].length; c++) {
				System.out.print(chess[r][c] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
	}
}
