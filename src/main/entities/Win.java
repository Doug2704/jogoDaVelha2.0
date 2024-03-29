package main.entities;

/***
 * Classe responsável por verificar os acertos
 * 
 * @author Douglas
 *
 */
public class Win {

	public boolean winRow() {
		for (int i = 0; i < 3; i++) {
			if (Board.board[i][0] != '_' && Board.board[i][0] == Board.board[i][1]
					&& Board.board[i][1] == Board.board[i][2]) {
				return true;

			}
		}
		return false;
	}

	public boolean winColumn() {
		for (int i = 0; i < 3; i++) {
			if (Board.board[0][i] != '_' && Board.board[0][i] == Board.board[1][i]
					&& Board.board[1][i] == Board.board[2][i]) {
				return true;

			}
		}
		return false;

	}

	public boolean winDiagonalToDown() {
		for (int i = 0; i < 3; i++) {// diagonal descendo \|
			if (Board.board[0][0] != '_' && Board.board[0][0] == Board.board[1][1]
					&& Board.board[1][1] == Board.board[2][2]) {
				return true;

			}
		}
		return false;
	}

	public boolean winDiagonalToUp() {
		for (int i = 0; i < 3; i++) {
			if (Board.board[2][0] != '_' && Board.board[2][0] == Board.board[1][1]
					&& Board.board[1][1] == Board.board[0][2]) {
				return true;

			}
		}
		return false;
	}

	/**
	 * Verifica se um player ganhou uma linha, coluna ou diagonal. Se sim, a partida
	 * está ganha pelo player atual
	 * 
	 * @return false (se nenhum dos 3 foi atendido)
	 *
	 */
	public boolean winMatch() {
		if (winRow() || winColumn() || winDiagonalToUp() || winDiagonalToDown()) {
			return true;
		}
		return false;
	}

}
