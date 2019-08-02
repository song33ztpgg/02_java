package point;
/**
 * x,y 좌표를 정수로 가지는 
 * 수학의 한 점을 나타내는 클래스 
 * */
public class Point /*extends Object*/ { 
	
	//1. 맴버변수 
	private int x; 
	private int y;
	
	//2. 생성자
    //기본 생성자 명시 하지 않음 = > 기본 생성자 없음
	
	public Point(int x,int y) { 
		this.x = x; 
		this.y = y;
	}
	
	//3. 메소드 0
	//접근자,수정자 
	
	public int getX() { 
		return x; 
	}
	
	public void setX() { 
		this.x = x; 
	}
	
	public int getY() { 
		return y; 
	}
	
	public void setY() { 
		this.y = y; 
	}
	
	/**
	 * 자바의 최상위 클래스 object 로 부터 물려 반은 메소드 
	 * 이 객체를 대표하는 문자열  
	 * 
	 * 맴버변수 필드를 조합하는 문자열을 리턴 
	 * print 계열의 메소드에서 자동으로 작동
	 * */
	
	@Override // anotation 이 메소드가 재정의되고 있음을 확인
	public String toString() {
		// return "(" + x + "," + y + ")"; 
		//point.Point@15db9742
 
		
		return String.format("(%d,%d)",x,y);
	}

	public double distanceFrom(Point q) { 
//		System.out.println();
		return Math.sqrt( Math.pow(q.getX() - x, 2) + Math.pow(q.getY() - y, 2) );
		
	}
}
