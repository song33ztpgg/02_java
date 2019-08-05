package game3;

public class GameCoolTime extends GM {

	private int coolTime; 
	
	 GameCoolTime() { 
		
	} 
	
	 GameCoolTime(int coolTime) { 
		this();
		this.coolTime = coolTime;
	}
	
	public GameCoolTime(int power, int coolTime) { 
		super(power); 
		this.coolTime = coolTime;
	} 
	
	public String toString() { 
		System.out.println("coolTime");
		return String.format("%s %d", super.toString(), coolTime); 
	} 
	

}
