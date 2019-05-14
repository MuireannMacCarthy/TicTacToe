
public class TicTacToe {

	private char[][] board = new char[3][3];
	private char currentPlayer;
	private char winner;


	public TicTacToe() {
		initializeBoard();
		currentPlayer = 'x';
		
	}
	
	public void initializeBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
		
	}
	
	public char getCurrentPlayer() {
		return currentPlayer;
	}
	
	public char getWinner() {
		return winner;
	}
	
	public char[][] getBoard() {
		return board;
	}
	
	public void printBoard() {
		int row_no = 0;
		System.out.println("    1   2   3  ");
		System.out.println("  -------------");
		for (int i = 0; i < 3; i++) {
			row_no ++;
			System.out.print(row_no);
			System.out.print(" | ");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " | ");
				}
			System.out.println();
			System.out.println("  -------------");
		}
		
		
	}
	
	public boolean isBoardfull() {
		int spaces = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] != '-') {
					spaces ++;
				}
			}
		}
		
		if (spaces == 9) {
			return false;
		}
		
		else {
			return true;
		}
		
	}
	
	public boolean isWinner() {
		
		if(checkRows() || checkColumns() || checkDiagonals()) {
			if (currentPlayer == 'x'){
				winner = 'o';
				}
			else{
				winner = 'x';
				}
		}
		
		return (checkRows() || checkColumns() || checkDiagonals());
		
	}
	
	private boolean checkRows() {
		
		for ( int i = 0; i < 3; i++) {
			if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
				
				return true;
			}
		}
		
		return false;
		
	}
	
	private boolean checkColumns() {
		
		for (int i = 0; i < 3; i++) {
			if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true)
				{
					return true;
				}
		}
		return false;
	}
		
	
	
	private boolean checkDiagonals() {
		
		return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
		
	}
	
	private boolean checkRowCol(char c1, char c2, char c3) {
		
		return ((c1 != '-') && (c1 == c2) && (c2 == c3));
		
	}
	
	public void changePlayer() {
		
		if (currentPlayer == 'x'){
			currentPlayer = 'o';
			}
		else{
			currentPlayer = 'x';
			}
	}
	
	public boolean placeMark(int row, int col) {
		
		if ((row >= 0) && (row <= 2) && (col < 3) && (col >= 0)) {
			if (board[row][col] == '-')
			{
			board[row][col] = currentPlayer;
			return true;
			}
		}
		
		return false;
	}
	
	
}
