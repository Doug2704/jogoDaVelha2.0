package test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.entities.Board;

public class BoardTest {
	private Board board;

	@Before
	public void setUp() {
		board = new Board();
	}

	@Test
	public void testBoard() {
		char[][] expectedBoard = { { '_', '_', '_' }, { '_', '_', '_' }, { '_', '_', '_' } };

		assertArrayEquals(expectedBoard, board.board);
	}

	@Test
	public void testMarkUp() {
		board.markUp(2, 2);
		char[][] expectedBoard = { { '_', '_', '_' }, { '_', 'X', '_' }, { '_', '_', '_' } };
		assertArrayEquals(expectedBoard, board.board);
	}

	@Test
	public void testIsBoardFull() {
		assertFalse(board.isBoardFull());
		//falta implementar o teste para validar true, caso esteja com todos os índices preenchidos
	}
}
