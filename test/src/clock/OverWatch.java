package clock;

public abstract class OverWatch implements Billzard {

	String name; 
	int hp; 
	
	public OverWatch() {
	}
	
	public OverWatch(String name, int hp) { 
		this(); 
		this.name = name; 
		this.hp = hp;
	}  
	
	public String getName(){ 
		return name;
	} 
	
	public void setName(String name) { 
		this.name = name;
	} 
	
	public int getHp(){ 
		return hp;
	} 
	
	public void sethp(int hp) { 
		this.hp = hp;
	}
	
	
	public double downHP(int num){ 
		return hp-num;
	} 
	
	public void print() { 
		System.out.printf("채력 : %d , 이름 : %s", hp,name);
	}
	
	
}
