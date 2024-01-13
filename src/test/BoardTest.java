package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.entities.Board;
import main.entities.Player;

/***
 * 
 * @author Douglas
 *
 */
public class BoardTest {
	private Board testBoard;
	private Player testPlayer;

	@Before
	public void setUp() {
		testBoard = new Board();
		testPlayer = new Player();
		testPlayer.setSimbol('X');
	}

	@Test
	public void testBoard() {
		char[][] expectedBoard = { { '_', '_', '_' }, { '_', '_', '_' }, { '_', '_', '_' } };

		assertArrayEquals(expectedBoard, testBoard.board);
	}

	@Test
	public void testMarkUp() {
		testPlayer.setSimbol('X');

		testBoard.markUp(2, 2, testPlayer);
		char[][] expectedBoard = { { '_', '_', '_' }, { '_', 'X', '_' }, { '_', '_', '_' } };
		assertNotNull(testBoard.board);
		assertArrayEquals(expectedBoard, testBoard.board);
	}

	@Test
	public void testIsSquareEmpty() {
		testBoard.board[1][1] = '_';
		assertTrue(testBoard.isSquareEmpty(2, 2));
		testBoard.board[1][1] = 'X';
		assertFalse(testBoard.isSquareEmpty(2, 2));
	}

	@Test
	public void testWinRow() {
		assertFalse(testBoard.winRow());
		testBoard.markUp(2, 1, testPlayer);
		testBoard.markUp(2, 2, testPlayer);
		testBoard.markUp(2, 3, testPlayer);
		assertTrue(testBoard.winRow());
	}

	@Test
	public void testWinColumn() {
		assertFalse(testBoard.winColumn());
		testBoard.markUp(1, 2, testPlayer);
		testBoard.markUp(2, 2, testPlayer);
		testBoard.markUp(3, 2, testPlayer);
		assertTrue(testBoard.winColumn());
	}

	@Test
	public void testWinDiagonalToDown() {
		assertFalse(testBoard.winDiagonalToDown());

		testBoard.markUp(1, 1, testPlayer);
		testBoard.markUp(2, 2, testPlayer);
		testBoard.markUp(3, 3, testPlayer);
		assertTrue(testBoard.winDiagonalToDown());

	}

	@Test
	public void testWinDiagonalToUp() {
		assertFalse(testBoard.winDiagonalToUp());

		testBoard.markUp(1, 1, testPlayer);
		testBoard.markUp(2, 2, testPlayer);
		testBoard.markUp(3, 1, testPlayer);
		assertTrue(testBoard.winDiagonalToUp());

	}

	@Test
	public void testWinMatch() {
		assertFalse(testBoard.winMatch());

		testWinRow();
		assertTrue(testBoard.winMatch());

		testWinColumn();
		assertTrue(testBoard.winMatch());

		testWinDiagonalToDown();
		assertTrue(testBoard.winMatch());

		testWinDiagonalToUp();
		assertTrue(testBoard.winMatch());
	}
}
