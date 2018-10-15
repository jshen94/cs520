
public class Field {
	private Symbol player;
	
	
	public Field() {
		player = Symbol.NONE;
	}
	
	public Symbol getPlayer() {
		return player;
	}
	
	public void setPlayer(Symbol s) {
		player = s;
	}
	
	
	public static enum Symbol {
		X, O, NONE
	}
	
		
}

