package main.program;

import java.util.Scanner;

import main.entities.Board;
import main.entities.Player;
import main.entities.Win;

/***
 * 
 * @author Douglas
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

		for (int cont = 0; cont <= 9; cont++) {
			System.out.println("Digite as coordenadas separadas por vírgulas (x,x): ");
			board.showBoard();
			String[] coord = sc.next().split(",");

			try {
				int row = Integer.parseInt(coord[0]);
				int column = Integer.parseInt(coord[1]);

				if (board.isSquareEmpty(row, column)) {
					if (cont % 2 == 0) {

						board.markUp(row, column, player1);
					} else {

						board.markUp(row, column, player2);
					}

				} else {
					System.out.println("Quadrado já selecionado");
					cont = cont - 1;
				}
				if (win.winMatch()) {
					System.out.println(player1.getSimbol() + " Ganhou");
					cont = 10;
				}

			} catch (Exception e) {

				System.out.println("ERRO: " + e + "\n");
				cont = cont - 1;
			}
		}
		sc.close();
	}
}
