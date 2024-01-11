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

		for (int cont = 1; cont <= 9; cont++) {
			board.showBoard();
			System.out.println("digite as coordenadas");

			int row = sc.nextInt();
			int column = sc.nextInt();
			if (cont % 2 == 0) {
				board.player.setSimbol('O');
			} else {
				board.player.setSimbol('X');
			}
			board.markUp(row, column);

		}

		sc.close();
	}
}
