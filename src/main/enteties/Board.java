package main.enteties;

public class Board {
	char[][] board = new char[3][3];
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

	public void marcar(int row, int column) {

		board[row][column] = 'X';

	}

}