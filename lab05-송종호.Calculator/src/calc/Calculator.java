package calc;

//입력 클래스 import
import calc.input.DoubleInputValue;
import calc.input.IntInputValue;
//출력 클래스 import
import calc.result.DoubleResultValue;
import calc.result.IntResultValue;

public class Calculator {
	
	//계산 결과 넣을 변수
	private int intInputValue;  
	private double doubleInputValue;
	
	//add  
	public IntResultValue add(IntInputValue intValue) { 
		// input의 결과에 2가지 값을 계산
		intInputValue = intValue.getIntX() + intValue.getIntY(); 
		// 계산된 결과를  IntResultValue 타입으로 초기화
		IntResultValue  intResultValue =  new IntResultValue(intInputValue);
		return intResultValue;
	}

	public DoubleResultValue add(DoubleInputValue doubleValue) {
		doubleInputValue = doubleValue.getDoubleX() + doubleValue.getDoubleY(); 
		DoubleResultValue doubleResultValue = new DoubleResultValue(doubleInputValue);
		return doubleResultValue; 
	} 
	
	//sub 
	public IntResultValue sub(IntInputValue intValue) {
		intInputValue = intValue.getIntX() - intValue.getIntY();
		IntResultValue  intResultValue =  new IntResultValue(intInputValue);
		return intResultValue;
	}
	
	public DoubleResultValue sub(DoubleInputValue doubleValue) {
		doubleInputValue = doubleValue.getDoubleX() - doubleValue.getDoubleY(); 
		DoubleResultValue doubleResultValue = new DoubleResultValue(doubleInputValue);
		return doubleResultValue; 
	} 
	
	//mult 
	public IntResultValue mult(IntInputValue intValue) {
		intInputValue = intValue.getIntX() * intValue.getIntY();
		IntResultValue  intResultValue =  new IntResultValue(intInputValue);
		return intResultValue;
	}
	
	public DoubleResultValue mult(DoubleInputValue doubleValue) {
		doubleInputValue = doubleValue.getDoubleX() * doubleValue.getDoubleY(); 
		DoubleResultValue doubleResultValue = new DoubleResultValue(doubleInputValue);
		return doubleResultValue; 
	} 
	
	//div
	public IntResultValue div(IntInputValue intValue) {
		intInputValue = intValue.getIntX() / intValue.getIntY();
		IntResultValue  intResultValue =  new IntResultValue(intInputValue);
		return intResultValue;
	} 
	
	public DoubleResultValue div(DoubleInputValue doubleValue) {
		doubleInputValue = doubleValue.getDoubleX() / doubleValue.getDoubleY(); 
		DoubleResultValue doubleResultValue = new DoubleResultValue(doubleInputValue);
		return doubleResultValue; 
	} 

	
	//mod
	public IntResultValue mod(IntInputValue intValue) {
		intInputValue = intValue.getIntX() % intValue.getIntY();
		IntResultValue  intResultValue =  new IntResultValue(intInputValue);
		return intResultValue;
	}	
	
	public DoubleResultValue mod(DoubleInputValue doubleValue) {
		doubleInputValue = doubleValue.getDoubleX() % doubleValue.getDoubleY(); 
		DoubleResultValue doubleResultValue = new DoubleResultValue(doubleInputValue);
		return doubleResultValue; 
	} 
}



/*
5.  패키지 : calc
IntInputValue, DoubleInputValue 를 각각 
입력받아 각 클래스 인스턴스의 멤버변수 값을 사용하여 
사칙연산과 나머지 연산을 수행하는 
add, sub, mult, div, mod(나머지 연산) 메소드가 중복정의된 
클래스 Calculator 를 작성

6.  Calculator 클래스 메소드들의 리턴타입은 
IntInputValue 를 받는 경우는 IntResultValue 로 
DoubleInputValue 를 받는 경우는 DoubleResultValue 타입으로 작성
*/