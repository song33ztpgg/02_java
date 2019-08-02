package point;

public class PointTest {

	public static void main(String[] args) {
		Point a = new Point(); 
		Point b = new Point(); 
		Point c; 
		
		c = new NamePoint(0 , 1,"a ");
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		a.sq(b);;
	}

}
