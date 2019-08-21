package loopFeedBack;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {

		//클래스 선언
		Factorial factorial = new Factorial(); 
		//Scanner 선언 
		Scanner scan = new Scanner(System.in);
		
		//값을 입력받음
		System.out.println("자연수의 값을 입력하시오");
		int input = scan.nextInt();

		//값출력
		System.out.printf("%d! = ",input);
		System.out.println(factorial.factorial(input)); 
	}

}
