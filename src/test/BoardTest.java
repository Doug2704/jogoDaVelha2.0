package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.entities.Board;
import main.entities.Player;

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

		assertArrayEquals(expectedBoard, Board.board);
	}

	@Test
	public void testMarkUp() {
		testPlayer.setSimbol('X');

		testBoard.markUp(2, 2, testPlayer);
		char[][] expectedBoard = { { '_', '_', '_' }, { '_', 'X', '_' }, { '_', '_', '_' } };
		assertNotNull(Board.board);
		assertArrayEquals(expectedBoard, Board.board);
	}

	@Test
	public void testIsSquareEmpty() {
		Board.board[1][1] = '_';
		assertTrue(testBoard.isSquareEmpty(2, 2));
		Board.board[1][1] = 'X';
		assertFalse(testBoard.isSquareEmpty(2, 2));
	}

}
