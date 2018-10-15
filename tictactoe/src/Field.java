
public class Field {
	private String value;
	
	
	public Field() {
		value = "";
	}
	
	public String getValue() {
		return value;
	}
	public int computeValue() {
		if(value == "X") {
			return 1;
		}
		if(value == "O") {
			return -1;
		}
		return 0;
	}
	public void setValue(String s) {
		value = s;
	}
	
}

