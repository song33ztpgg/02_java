package calc.result;

public class IntResultValue {
	
	private int result; 
	
	public IntResultValue(){ 
		
	}
	
	public IntResultValue(int result){ 
		this();
		this.result = result;
	} 
	
	public void print(){ 
		System.out.println(this);
	}

	@Override
	public String toString() {
		return String.format("결과는 = %d 입니다", result);
	} 
	
	
}
/*
3.  패키지 : calc.result
정수형 멤버변수 result 한 개를 갖는 
클래스 IntResultValue 클래스를 자바빈즈 규격의 클래스로 작성

*/