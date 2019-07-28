package game2;

public class GameChar {

	int hp; 
	int mp; 
	String name;
	
	public GameChar() { 
		
	} 
	
	public GameChar(int hp,int mp, String name) { 
		this(); 
		this.hp = hp; 
		this.mp = mp; 
		this.name = name;
	} 
	
	public void hp() { 
		
	} 
	
	public int hp(int hp){
		return hp;
	} 
	
	public void mp() { 
		
	} 
	
	public int mp(int mp){
		return mp;
	}
	
	public void name() { 
		
	} 
	
	public String name(String name){
		return name;
	}
	
	
	public void allChater() {
		System.out.printf("%s %d   %d  \n",name, hp ,mp ); 
	}
	
	
	public void print(GameChar game) { 
		System.out.printf("%d   %d   %s\n",hp ,mp ,name); 
	}
	
	
}
