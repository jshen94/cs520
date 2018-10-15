

public class Model {
	private int turnCounter;
	private Symbol player;
	private boolean haveWinner;
	private Board board;
	

	public Model() {
		turnCounter = 0;
		haveWinner = false;
		board = new Board();
		
	}
	
}