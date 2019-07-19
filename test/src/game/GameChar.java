package game;

public class GameChar {

	int hp; 
	int mp;
	String name; 
	
	GameChar(){ 
		
	} 
	
	GameChar(int hp){ 
		this();
		this.hp = hp;
	}
	
	GameChar(int hp,int mp){ 
		this(hp);
		this.mp = mp;
	} 
	
	GameChar(int hp,int mp,String name){ 
		this(hp,mp);
		this.name = name;
	} 
	
	//
	
	
	public int hp() { 
		return hp;
	} 
	
	public void hp(int hp) { 
		this.hp = hp;
	}
	
	
	public int mp() { 
		return mp;
	}
	
	public void mp(int mp) { 
		this.mp = mp;
	}  
	
	
	public String name() { 
		return name;
	}
	
	public void name(String name) { 
		this.name = name;
	}
	
	
}
