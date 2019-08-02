package point;

public class NamePoint extends Point {

	String name; 
	
	public NamePoint() { 
	} 
	
	public NamePoint(int x, int y) { 
		super(x,y); 
	} 
	
	public NamePoint(int x, int y,String name) { 
		this(x, y); 
		this.name = name;
	}  
	
	public String getName(){ 
		return name;
	} 
	
	public void setName(String  name) { 
		this.name = name; 
	}
	
	public String toString() { 
		return name + super.toString();
	}
	
	
	
}
