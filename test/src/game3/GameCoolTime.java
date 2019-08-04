package game3;

public class GameCoolTime extends GM {

	private int coolTime; 
	
	public GameCoolTime() { 
		
	} 
	
	public GameCoolTime(int coolTime) { 
		this.coolTime = coolTime;
	}
	
	public GameCoolTime(int power, int coolTime) { 
		super(power); 
		this.coolTime = coolTime;
	} 
	
	public String toString() { 
		System.out.println("test");
		return String.format("%d %d", super.toString(), coolTime);
	}
}
