package game2;

public class GameChar extends GameServer{
	
	int hp; 
	int mp; 
	
	public GameChar(String name) { 
		super();
	} 
	
	public GameChar(int hp , int mp,String name) { 
		super(name); 
		this.hp = hp; 
		this.mp = mp;
	} 
	
	public String toString() { 
		return String.format("hp : %d  / mp : %d", hp , mp) + super.toString(); 
//		String.format("%d %d", hp , mp);
	}
	
}
