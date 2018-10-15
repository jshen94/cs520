
public class Board {
	private Field[][] boardState;
	public static final int DIMENSION = 3;
	
	/* Create the board without any symbols */
	public Board() {
		boardState = new Field[DIMENSION][DIMENSION];
		for(int i = 0; i < DIMENSION; i++) {
			for(int j = 0; j < DIMENSION; j++) {
				boardState[i][j] = new Field();
			}
		}
	}
	
	public void setSymbol(boolean player, int x, int y) {
		if(player) {
			boardState[x][y].setValue("X");
		}
		else {
			boardState[x][y].setValue("O");
		}
	}
	
	public String getSymbol(int x, int y) {
		return boardState[x][y].getValue();
	}
	public boolean checkWinner(int x, int y) {
		if (sumHorizontal(y) == 3 || sumVertical(x) == 3) {
	
		}
		return true;
	}
	private int sumHorizontal(int y) {
		return 0;
	}
	private int sumVertical(int x) {
		return 0;

	}
	private int sumDiagonal(int x, int y) {
		return 0;

	}
}






