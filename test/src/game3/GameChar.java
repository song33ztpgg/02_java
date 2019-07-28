package game3;

public class GameChar {

	int hp; 
	int cooldown; 
	String name; 
	
	public GameChar() { 
		
	} 
	
	public GameChar(int hp, int cooldown, String name) { 
		this(); 
		this.hp = hp; 
		this.cooldown = cooldown; 
		this.name = name;
	} 
	
	public void print(GameChar game) { 
		//System.out.printf("이름 : %5s //채력 = %3d // 쿨타임 = %2d ", name, hp , cooldown); 
		System.out.println("dd");
	}

	
	
}
