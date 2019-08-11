package game;

public class GameCCC {

	int hp; 
	String name; 
	
	public GameCCC() {
	}
	
	public GameCCC(String name, int hp) {
		this(); 
		this.name = name; 
		this.hp = hp; 
	} 
	
	public void setName(String name) { 
		this.name  = name; 
	}
	
	public void setHp(int hp) { 
		this.hp  = hp; 
	}
	
	public void print() {
		String.format("이름 : %s   채력 : %d  ", name , hp); 
		System.out.println(name); 
		System.out.println(hp);
	}
	
}
