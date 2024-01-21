package main.program;

import java.util.Scanner;

import main.entities.Board;
import main.entities.Player;
import main.entities.Win;

/***
 * 
 * @author Douglas Candido
 *
 *
 */
public class Match {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Board board = new Board();
		Win win = new Win();
		Player player1 = new Player();
		Player player2 = new Player();

		player1.setSimbol('X');
		player2.setSimbol('O');
		// System.out.println("Nome do Jogador 01: ");
		// player1.setName(sc.next());
		// System.out.println("Nome do Jogador 02: ");
		// player2.setName(sc.next());
		player1.setName("P1");
		player2.setName("P2");
		System.out.println("Digite as coordenadas separadas por vírgulas (x,x): ");
		int counter = 0;
		while (!win.winMatch() && !board.isBoardFull()) {
			for (counter = 0; counter < 9; counter++) {

				board.showBoard();

				String[] coord = sc.next().split(",");

				try {
					int row = Integer.parseInt(coord[0]);
					int column = Integer.parseInt(coord[1]);

					if (board.isSquareEmpty(row, column)) {
						if (counter % 2 == 0) {
							board.markUp(row, column, player1);
							win.winMatch();
						} else {
							board.markUp(row, column, player2);

						}

					} else {
						System.out.println("Quadrado já selecionado");
						counter--;
					}

					if (win.winMatch()) {
						if (counter % 2 == 0) {
							System.out.println(player1.getName() + " Ganhou");
							break;
						} else {
							System.out.println(player2.getName() + " Ganhou");
							break;
						}
					} else if (board.isBoardFull()) {
						System.out.println("Partida Empatada");
						break;
					} else {

					}

				} catch (Exception e) {
					if (e instanceof ArrayIndexOutOfBoundsException) {
						System.out.println("ERRO: Fora do tabuleiro");
						counter--;
					} else if (e instanceof NumberFormatException) {

						System.out.println("ERRO: Caractere inválido");
						counter--;
					} else {
						System.out.println(e.getMessage());

					}
				}

			}
		}
		board.showBoard();
		sc.close();
	}
}