import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class TicTacToeTest {

	@Test
	public void testIsBoardfull() {
		TicTacToe junit = new TicTacToe();
		junit.placeMark(1, 1);
		junit.placeMark(1, 2);
		junit.placeMark(2, 1);
		junit.placeMark(1, 3);
		junit.placeMark(3, 1);
		assertTrue(junit.isBoardfull());;
	}

	@Test
	public void testIsWinner() {
		TicTacToe junit = new TicTacToe();
		junit.placeMark(1, 1);
		junit.placeMark(1, 2);
		junit.placeMark(2, 1);
		junit.placeMark(1, 3);
		junit.placeMark(3, 1);
		assertTrue(junit.isWinner());
	}

	@Test
	public void testPlaceMark() {
		TicTacToe junit = new TicTacToe();
		int row = 1;
		int col = 1;
		assertTrue(junit.placeMark(row, col));
	}
}
