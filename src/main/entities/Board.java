package main.entities;

public class Board {
	public char[][] board = new char[3][3];
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

	public void markUp(int row, int column) {

		board[row - 1][column - 1] = 'X';

	}

	public boolean isBoardFull() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] != '_') {// se encontrar um que seja vazio retorna true
					return true;
				}
			}
		}
		return false;

	}
}