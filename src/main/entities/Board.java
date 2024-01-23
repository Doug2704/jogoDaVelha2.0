package main.entities;
/**
 * Classe responsável por gerar e manipular o tabuleiro
 * @author Douglas
 *
 */
public class Board {
	public static char[][] board = new char[3][3];
	public int row, column;
/***
 * tabuleiro vazio
 */
	public Board() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = '_';
			}
		}
	}
/**
 * mostra o tabuleiro atual
 */
	public void showBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print("[" + board[i][j] + "]");
			}
			System.out.println();
		}

	}
/**
 * marca um quadrado no tabuleiro
 * @param row
 * @param column
 * @param player
 */
	public void markUp(int row, int column, Player player) {

		board[row - 1][column - 1] = player.getSimbol();

	}
/**
 * verifica se o quadrado está vazio
 * @param row
 * @param column
 * @return true (se ainda estiver vazio)

 */
	public boolean isSquareEmpty(int row, int column) {
		if (Board.board[row - 1][column - 1] == '_') {
			return true;

		}
		return false;
	}
/***
 * verifica se o tabuleiro foi preechido
 * @return true (se estiver totalmente preenchido. se não tiver nenhum quadrado vazio)
 
 */
	public boolean isBoardFull() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == '_') {
					return false;
				}
			}
		}
		return true;
	}
}