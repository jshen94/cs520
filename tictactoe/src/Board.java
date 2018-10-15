
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
		if (sumHorizontal(y) == 3 || sumVertical(x) == 3 || sumDiagonal(x,y) == 3) {
						
			return true;
		}
		return false;
	}
	private int sumHorizontal(int y) {
		int result = 0;
		for(int i = 0; i < 3; i++) {
			result += boardState[i][y].computeValue();
		}
		return Math.abs(result);
	}
	private int sumVertical(int x) {
		int result = 0;
		for(int j = 0; j < 3; j++) {
			result += boardState[x][j].computeValue();
		}
		
		return Math.abs(result);

	}
	private int sumDiagonal(int x, int y) {
		int result = 0;
		if(x == 0) {
			if(y == 0) {
				result += boardState[x][y].computeValue() + boardState[x+1][y+1].computeValue() + boardState[x+2][y+2].computeValue();
			}
			if (y == 2) {
				result += boardState[x][y].computeValue() + boardState[x+1][y-1].computeValue() + boardState[x+2][y-2].computeValue();

			}
		}
		if(x == 1 && y == 1) {
			result += boardState[x][y].computeValue() + boardState[x+1][y+1].computeValue() + boardState[x-1][y-1].computeValue();
		}
		if(x == 2) {
			if(y == 0) {
				result += boardState[x][y].computeValue() + boardState[x-1][y+1].computeValue() + boardState[x-2][y+2].computeValue();
			}
			if(y == 2) {
				result += boardState[x][y].computeValue() + boardState[x-1][y-1].computeValue() + boardState[x-2][y-2].computeValue();
			}
		}
		return result;

	}
}






