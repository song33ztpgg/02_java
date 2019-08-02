package createPoint;

public class point {

	private int x; 
	private int y;  
	
	
	public point() { 
		
	} 
	
	public point(int x) { 
		this(); 
		this.x = x; 
	}
	
	public point(int x, int y) { 
		this(x); 
		this.y = y; 
	} 
	
	
	public int getX() { 
		return x;
	} 
	
	public void setX(int x) { 
		this.x = x;
	} 
	
	
	public int getY() { 
		return y; 
	} 
	
	public void setY() { 
		this.y = y; 
	} 
	
	
	
	public String toString() { 
		return String.format("[%d] [%d]", x , y);
	}
	
}
