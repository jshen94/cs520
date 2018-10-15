
public class Board {
	private Field[][] boardState;
	private static final int DIMENSION = 3;
	
	/* Create the board without any symbols */
	public Board() {
		boardState = new Field[DIMENSION][DIMENSION];
		for(int i = 0; i < DIMENSION; i++) {
			for(int j = 0; j < DIMENSION; j++) {
				boardState[i][j] = new Field();
			}
		}
		
	}
	
	
}






