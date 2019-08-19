package calc.input;

public class IntInputValue {

	private int x; 
	private int y;  
	
	//생성자
	public IntInputValue() { 
			
	}
		
	public IntInputValue(int x, int y) { 
		this(); 
		this.x = x; 
		this.y = y;
	}  
	

	
	//접근자
	public int getIntX() { 
		return x;
	}
	
	public int getIntY() { 
		return y;
	}
	
}
/*
================calc.input

1.  패키지 : calc.input
    정수형 멤버변수 x, y 두 개를 갖는    
    클래스 IntInputValue 클래스를 자바빈즈 규격의 클래스로 작성

*/