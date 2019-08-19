package calc.input;

public class DoubleInputValue {
	//맴버 변수
	private double x; 
	private double y; 
	
	//생성자
	public DoubleInputValue() { 
		
	}
	
	public DoubleInputValue(double x, double y) { 
		this(); 
		this.x = x; 
		this.y = y;
	} 
	
	//접근자
	public double getDoubleX() { 
		return x;
	}
	
	public double getDoubleY() { 
		return y;
	}
	
	
}


/*
================calc.input


2.  패키지 : calc.input
    실수형 멤버변수 x, y 두 개를 갖는 
    클래스 DoubleInputValue 클래스를 자바빈즈 규격의 클래스로 작성  
*/