package school;

public class GameManager {

	int hp; 
	String name; 
	
	
	
	public GameManager() {
	
	}
	
	public GameManager(String name, int hp) {
		this(); 
		this.name = name; 
		this.hp = hp; 
	} 
// 접근자
	public int getHp() { 
		return hp;
	} 
	
	public void setHp(int hp) { 
		this.hp = hp;
	} 
	
	public void setName(String name) { 
		this.name = name;
	} 
	
	public String toString() { 
		return String.format("이름 %s  / 채력 : %d " , name , hp);
	}
	
	
	
	
	
//사용매소드 
	
	public void resultDefence() { 
		
	}
	
	public void resultDamage() { 
		
	}
	
	
	public void print() { 
		
	}
	
	
	
}
