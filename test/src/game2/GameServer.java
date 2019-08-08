package game2;

public class GameServer {

	String name; 
	
	public GameServer() {
		
	}
	
	public GameServer(String name) {
		this(); 
		this.name = name; 
	} 
	
//	private void print() {
//		System.out.printf("%s " , name);
//	}
	
	public String toString() { 
		return String.format("%s" ,name );
				
	}
	
	
	
}
