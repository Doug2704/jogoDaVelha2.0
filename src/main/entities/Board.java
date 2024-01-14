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

}