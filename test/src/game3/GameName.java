package game3;

public class GameName extends GM {

	private String name; 
	
	GameName() { 
		
	} 
	
	GameName(String name) { 
		this.name = name;
	}
	
	GameName(int power,String name) { 
		super(power);
		this.name = name;
	} 
	
	public String toString() { 
		return String.format("%s %s", super.toString(), name);
	}
	
	
} 

