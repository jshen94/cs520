

public class Model {
	private int turnCounter;
	private boolean player; //true is X, false is O
	private boolean gameEnded;
	private Board board;
	

	public Model() {
		player = true;
		turnCounter = 0;
		gameEnded = false;
		board = new Board();
		
	}
	
	public boolean checkBoard(int x, int y) {
		if(turnCounter >=9 ) {
			gameEnded = true;
		}
		else {
			gameEnded = board.checkWinner(x,y);
		}
		
		return gameEnded;
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
	
	public boolean getGameEnded() {
		return gameEnded;
	}
	
	public void setGameEnded(boolean b) {
		gameEnded = b;
	}
	
}