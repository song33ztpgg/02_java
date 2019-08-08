package game;

public class GameServer {

	private int hp; 
	private int mp; 
	private String name; 
	private double coolTime; 
	
	
	GameServer(){ 
		
	} 
	
	private GameServer(int hp, int mp, String name, double coolTime) { 
		this(); 
		this.hp = hp; 
		this.mp = mp; 
		this.name = name; 
		this.coolTime = coolTime;
	}
	
	public int getHp(){ 
		return hp;
	}
	
	public void setHp(int hp){ 
		this.hp = hp;
	} 
	
	public int getMp(){ 
		return mp;
	}
	
	public void setMp(int mp){ 
		this.mp = mp;
	} 
	
	public String getName(){ 
		return name;
	}
	
	public void setName(String name){ 
		this.name = name;
	} 
	
	public double getCoolTime(){ 
		return coolTime;
	}
	
	public void setCoolTime(double coolTime){ 
		this.coolTime = coolTime;
	}
	
	
	
	
	
	
	public  void print() { 
		System.out.printf("hp:%d / mp:%d / name:%s / coolTime:%.2f\n" ,hp , mp , name , coolTime);
	} 
	
	
	void sell(int persent) { 
	double result;
	result = coolTime * (100 - persent); 
	System.out.println();
	System.out.println(result/100);
	}
	
	
}
