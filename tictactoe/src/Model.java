/*
 * Contains functions to modify the board state and interpret the current state
 */

public class Model {
	private int turnCounter;
	private boolean player; //true is X, false is O
	private boolean gameEnded;
	private boolean hasWinner;
	private Board board;
	

	public Model() {
		player = true;
		turnCounter = 0;
		gameEnded = false;
		hasWinner = false;
		board = new Board();
		
	}
	
	public boolean checkBoard(int x, int y) {
		if(turnCounter >=8 ) {
			gameEnded = true;
		}
		else {
			hasWinner = board.checkWinner(x,y);
			gameEnded = hasWinner;
		}
		
		return gameEnded;
	}
	public void reset() {
		board.clearBoard();
		turnCounter = 0;
		player = true;
		hasWinner = false;
		gameEnded = false;
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
	public boolean getHasWinner() {
		return hasWinner;
	}
	
	public boolean getGameEnded() {
		return gameEnded;
	}
	
	public void setGameEnded(boolean b) {
		gameEnded = b;
	}
	
}