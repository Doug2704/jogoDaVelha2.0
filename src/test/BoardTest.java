package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import main.entities.Board;
import main.entities.Player;

public class BoardTest {
	private Board board;
	private Player player;

	@Before
	public void setUp() {
		board = new Board();
		player = new Player();
	}

	@Test
	public void testBoard() {
		char[][] expectedBoard = { { '_', '_', '_' }, { '_', '_', '_' }, { '_', '_', '_' } };

		assertArrayEquals(expectedBoard, Board.board);
	}

	@Test
	public void testMarkUp() {
		
		board.markUp(2, 2);
		char[][] expectedBoard = { { '_', '_', '_' }, { '_', 'X', '_' }, { '_', '_', '_' } };
		assertNotNull(Board.board);
		assertArrayEquals(expectedBoard, Board.board);
	}

	@Test
	public void testIsBoardFull() {

		assertFalse(board.isSquareSelected());
	}

}
