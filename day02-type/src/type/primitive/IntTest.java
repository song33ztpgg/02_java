package type.primitive;

import java.util.Scanner;

/*
 * int : 정수형 타입중 가장 기본 / 대표타입 
 * int 타입을 테스트 하는 클래스
 * 
 * 
 * 
 * */


public class IntTest {

	public static void main(String[] args) {

		//여러개 선언가능
		int num1 = 5 , num2 = 28;
		int num3, num4 , num5; 
		
		num3 = num1 * num2; 
		num4 = num2 / num1;
		num5 = 24 % num1;
		
		
		System.out.println("5 * 28 = "+num3);
		System.out.println("28 / 5 = "+num4);
		System.out.println("25 % 5 = "+num5);
		
		
	

		
	}

}
