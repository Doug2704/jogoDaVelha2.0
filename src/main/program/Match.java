package main.program;

import java.util.Scanner;

import main.entities.Board;
import main.entities.Player;

public class Match {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board board = new Board();
		Player player1 = new Player();
		Player player2 = new Player();

		for (int cont = 0; cont <= 9; cont++) {
			board.showBoard();
			System.out.println("digite as coordenadas");

			int row = sc.nextInt();
			int column = sc.nextInt();
			if (cont % 2 == 0) {
				player1.setSimbol('X');
				board.markUp(row, column, player1);
			} else {
				player2.setSimbol('O');
				board.markUp(row, column, player2);
			}
			

		}

		sc.close();
	}
}
