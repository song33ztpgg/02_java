package test0805;

public class AddExcption extends Exception {

	
	String message  = "0안됨"; 
	
	
	public AddExcption() {
		
	}
	
	public void result() { 
		this.message = message;
	}
	
	public String toString() { 
		return message;
	}
	
}
