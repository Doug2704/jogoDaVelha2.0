package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
		testPlayer = new Player(); //não é a mesma instância Player da classe Board

	}

	@Test
	public void testBoard() {
		char[][] expectedBoard = { { '_', '_', '_' }, { '_', '_', '_' }, { '_', '_', '_' } };

		assertArrayEquals(expectedBoard, testBoard.board);
	}

	@Test
	public void testMarkUp() {
		testPlayer.setSimbol('X'); //setando em outra instância != da que está na classe Board

		testBoard.markUp(2, 2, testPlayer);
		char[][] expectedBoard = { { '_', '_', '_' }, { '_', 'X', '_' }, { '_', '_', '_' } };
		assertNotNull(testBoard.board);
		assertArrayEquals(expectedBoard, testBoard.board);
	}

	@Test
	public void testIsBoardFull() {

		assertFalse(testBoard.isSquareSelected());
	}

}
