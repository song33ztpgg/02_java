package game3;

public class GameHP extends GM {

	private double hp; 
	
	public GameHP(){ 
		
	} 
	
	public GameHP(double hp){ 
		this(); 
		this.hp = hp;
	} 
	
	public GameHP(int power , double hp){
		super(power);
		this.hp = hp;
	} 
	
	public String toString() { 
		return String.format("%s %.0f", super.toString(),hp);
	}
	
}
