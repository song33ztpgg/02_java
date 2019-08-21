package loop;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {

		//클래스 선언
		Factorial factorial = new Factorial(); 
	
		//scanner선언
		Scanner scan = new Scanner(System.in);  
		
		//입력 받을 변수 선언 
		int input = 0;
		
		System.out.println("값을 하나 입력하시오"); 
		input = scan.nextInt(); 
		
		//첫번째 계산식
		System.out.println("첫번째 계산식"); 
		
		
		System.out.println(factorial.calculator(input)); 
		System.out.println();
		
		//두번째 계산식
		System.out.println("두번째 계산식");
		System.out.println(factorial.calculator2(input));

		
		 
	}

}
