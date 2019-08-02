package createPoint;

public class PointName extends point {

	String name; 
	
	public 	PointName(int x, int y) {
		super(x,y);
	} 
	
	public 	PointName(String name, int x, int y) {
		this(x,y);	
		this.name = name;
	}  
	
	public String getName() { 
		return name;
	} 
	
	public void setName() { 
		this.name = name;
	} 

	public String toString() { 
		return name + "-- " + super.toString();
	}
	
}
