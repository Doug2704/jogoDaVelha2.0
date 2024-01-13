package main.program;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.Scanner;

import main.entities.Board;
import main.entities.Player;

/***
 * 
 * @author Douglas
 *
 */
public class Match {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board board = new Board();
		Player player1 = new Player();
		Player player2 = new Player();
		Board Board = new Board();

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

			} catch (Exception e) {

				System.out.println("ERRO: " + e + "\n");
				cont = cont - 1;
			}
		}
		sc.close();
	}
}
