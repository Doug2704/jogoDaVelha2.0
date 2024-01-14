package main.entities;

import java.util.function.BooleanSupplier;

/***
 * 
 * @author Douglas
 *
 */
public class Board {
	public static char[][] board = new char[3][3];
	public int row, column;

	public Board() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = '_';
			}
		}
	}

	public void showBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print("[" + board[i][j] + "]");
			}
			System.out.println();
		}

	}

	public void markUp(int row, int column, Player player) {
		// player.setSimbol('X');
		board[row - 1][column - 1] = player.getSimbol();

	}

	public boolean isSquareEmpty(int row, int column) {
		if (Board.board[row - 1][column - 1] == '_') {
			return true;

		}
		return false;
	}

	public boolean winRow() {
		for (int i = 0; i < 3; i++) {
			if (board[i][0] != '_' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				return true;

			}
		}
		return false;
	}

	public boolean winColumn() {
		for (int i = 0; i < 3; i++) {
			if (board[0][i] != '_' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
				return true;

			}
		}
		return false;
	}

	public boolean winDiagonalToDown() {
		for (int i = 0; i < 3; i++) {// diagonal descendo \|
			if (board[0][0] != '_' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
				return true;

			} 
		}
		return false;
	}

	public boolean winDiagonalToUp() {
		for (int i = 0; i < 3; i++) {// diagonal subindo /| 
			if (board[2][0] != '_' && board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
				return true; 

			}
		}
		return false;
	}

	public boolean winMatch() {
		if (winRow() || winDiagonalToUp() || winDiagonalToDown()) {
			return true; 
		}
		return false;
	}
}