package calc.result;

public class DoubleResultValue {
	
	private double result; 
	
	public DoubleResultValue(){ 
		
	}
	
	//의미가 없음
//	public DoubleResultValue(double result){ 
//		this();
//		this.result = result;
//	} 
	
	public void print(){ 
		System.out.println(this);
	}

	@Override
	public String toString() {
		return String.format("결과는 = %.2f 입니다", result);
	} 
}
/*
4.  패키지 : calc.result
실수형 멤버변수 result 한 개를 갖는 
클래스 DoubleResultValue 클래스를 자바빈즈 규격의 클래스로 작성
*/