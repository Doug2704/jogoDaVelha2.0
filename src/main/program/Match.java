package main.program;

import java.util.Scanner;

import main.entities.Board;

public class Match {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board board = new Board();

		for (int cont = 1; cont <= 9; cont++) {
			board.showBoard();
			System.out.println("digite as coordenadas");
			int row = sc.nextInt();
			int column = sc.nextInt();
			board.markUp(row, column);
		}
		
		
		sc.close();
	}
}
