

public class Model {
	private int turnCounter;
	private boolean player;
	private boolean haveWinner;
	private Board board;
	

	public Model() {
		turnCounter = 0;
		haveWinner = false;
		board = new Board();
		
	}
	
	public boolean checkBoard(int x, int y) {
		if(turnCounter >=9 ) {
			haveWinner = true;
		}
		else {
			board.checkWinner(x,y);
		}
		
		return haveWinner;
	}
	
	public int getTurnCounter() {
		return turnCounter;
	}
	
	public void incrementTurns() {
		turnCounter++;
	}
	
	public boolean getPlayer() {
		return player;
	}
	
	public void switchPlayer() {
		player = !player;
	}
	
	public void placeSymbol(boolean player, int x, int y) {
		board.setSymbol(player,x,y);
	}
	
	public String getSymbol(boolean player) {
		if(player) {
			return "X";
		}
		else {
			return "O";
		}
	}
	
	public boolean getHaveWinner() {
		return haveWinner;
	}
	
	public void setHaveWinner(boolean b) {
		haveWinner = b;
	}
	
}