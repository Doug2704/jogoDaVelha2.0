package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.entities.Board;
import main.entities.Player;
import main.entities.Win;

public class testWin {
	private Board testBoard;
	private Win testWin;
	private Player testPlayer;

	@Before
	public void setUp() {
		testBoard = new Board();
		testWin = new Win();
		testPlayer = new Player();
		testPlayer.setSimbol('X');
	}

	@Test
	public void testWinRow() {
		assertFalse(testWin.winRow());
		testBoard.markUp(2, 1, testPlayer);
		testBoard.markUp(2, 2, testPlayer);
		testBoard.markUp(2, 3, testPlayer);
		assertTrue(testWin.winRow());
	}

	@Test
	public void testWinColumn() {
		assertFalse(testWin.winColumn());
		testBoard.markUp(1, 2, testPlayer);
		testBoard.markUp(2, 2, testPlayer);
		testBoard.markUp(3, 2, testPlayer);
		assertTrue(testWin.winColumn());
	}

	@Test
	public void testWinDiagonalToDown() {
		assertFalse(testWin.winDiagonalToDown());

		testBoard.markUp(1, 1, testPlayer);
		testBoard.markUp(2, 2, testPlayer);
		testBoard.markUp(3, 3, testPlayer);
		assertTrue(testWin.winDiagonalToDown());

	}

	@Test
	public void testWinDiagonalToUp() {
		assertFalse(testWin.winDiagonalToUp());

		testBoard.markUp(1, 3, testPlayer);
		testBoard.markUp(2, 2, testPlayer);
		testBoard.markUp(3, 1, testPlayer);
		assertTrue(testWin.winDiagonalToUp());

	}

	@Test
	public void testWinMatch() {
		assertFalse(testWin.winMatch());

		testBoard.markUp(1, 3, testPlayer);
		testBoard.markUp(2, 2, testPlayer);
		testBoard.markUp(3, 1, testPlayer);

		assertTrue(testWin.winMatch());
	}

}
