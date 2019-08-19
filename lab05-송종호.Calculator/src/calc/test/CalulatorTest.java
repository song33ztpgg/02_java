package calc.test;

import calc.Calculator;
import calc.input.DoubleInputValue;
import calc.input.IntInputValue;

//import java.util.Scanner;
//
//import calc.Calculator;
//import calc.input.DoubleInputValue;


public class CalulatorTest {

	public static void main(String[] args) {
		//Calculator 초기화 
		Calculator calulator = new Calculator(); 
		//Scanner 초기화
		Scanner scan = new Scanner(System.in); 
		
		
		//2가지 값을 입력받음
		System.out.println("정수 값을 입력하시오");
		int intFirstInput = scan.nextInt(); 
		int intSecondInput  = scan.nextInt();
		
		//입력값 IntInputValue 타입으로 저장
		IntInputValue intAllValue = new IntInputValue(intFirstInput,intSecondInput); 

		//결과 출력
		System.out.printf("더하기 ");
		System.out.println(calulator.add(intAllValue));
		System.out.printf("빼기 ");
		System.out.println(calulator.sub(intAllValue));
		System.out.printf("곱하기 ");
		System.out.println(calulator.mult(intAllValue)); 
		System.out.printf("나누기 ");
		System.out.println(calulator.div(intAllValue)); 
		System.out.printf("나머지 ");
		System.out.println(calulator.mod(intAllValue));
		
		//2가지 실수값 받음
		System.out.println();
		System.out.println("실수 값을 입력하시오");
		double doubleFirstInput = scan.nextDouble(); 
		double doubleSecondInput  = scan.nextDouble();
		
		//입력값 DoubleInputValue 타입으로 저장
		DoubleInputValue DoubleAllValue = new DoubleInputValue(doubleFirstInput,doubleSecondInput); 
		
		//결과 출력
		System.out.printf("더하기 ");
		System.out.println(calulator.add(DoubleAllValue));
		System.out.printf("빼기 ");
		System.out.println(calulator.sub(DoubleAllValue));
		System.out.printf("곱하기 ");
		System.out.println(calulator.mult(DoubleAllValue)); 
		System.out.printf("나누기 ");
		System.out.println(calulator.div(DoubleAllValue)); 
		System.out.printf("나머지 ");
		System.out.println(calulator.mod(DoubleAllValue));
		
	}

}
