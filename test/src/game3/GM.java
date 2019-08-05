package game3;

public abstract class GM {

	private int power;  

	public GM() {
		
	} 
	
	public GM(int power) {  
		this();
		this.power = power;
	} 
	
	public void print() { 
		System.out.println(this);
	}
	
	public String toString() { 
		return String.format("%s", power); 
	} 
}
