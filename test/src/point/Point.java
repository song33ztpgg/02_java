package point;

public class Point {
	int x; 
	int y; 
	
	public Point() { 
		
	} 
	
	public Point(int x, int y) { 
		this(); 
		this.x = x; 
		this.y = y;
	}  
	
	public int setX() { 
		return x;
	} 
	
	public void getX() { 
		this.x = x; 
	}
	

	public int setY() { 
		return y;
	} 
	
	public void getY() { 
		this.y = y; 
	}
	
	public String toString() { 
		return String.format( "좌표 x: %d 좌표y : %d", x, y);
	}
	
	public void sq(Point z) { 
		System.out.println(Math.sqrt(z));
	}
	
}

