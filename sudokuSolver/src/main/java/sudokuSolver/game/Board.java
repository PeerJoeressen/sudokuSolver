package sudokuSolver.game;

public class Board {
	private byte[][] board;//row, col
	private boolean isSolved;

	public Board(byte[][] board) {
		this.board = board;
		this.isSolved = BoardUtils.isSolved(this);
	}

	public Board() {
		this.board = BoardUtils.generateRandomBoard();
	}
	
	public byte[][] getBoard(){
		return this.board;
	}
	
	public void setNumber(int col,int row, byte number) {
		this.board[row][col]=number;
	}

	public void drawBoard() {
		System.out.println("Sudoku Board:");
		for (int i = 0; i < 9; i++) {
			if ((i % 3) == 0) {
				System.out.print("-----------\n");

			}
			for (int o = 0; o < 9; o++) {
				if ((o % 3) == 0) {
					System.out.print("|");
				}
				System.out.print(board[i][o]);
			}
			System.out.print("|");
			System.out.print("\n");
		}
		System.out.println("-----------");
	}

}
