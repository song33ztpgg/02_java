package divider;

import java.util.Scanner;

/**		
 * 
 * 입력값에 따라서 0으로 나누는 상황이 
 * 발생할 가능성이 있는 클래스 Divider 를 테스트 한다.
 * 
 * 
 * */

public class DividerTest {

	public static void main(String[] args) {

		//1.선언 
		Scanner scan; 
		int input; 
		Divider div; 
		
		//2.초기화 
		div = new Divider();
		scan = new Scanner(System.in); 
		
		//입력시 시지하는 출력 
		System.out.println("정수를 입력하시오" );
		input = scan.nextInt(); 
		
		//3.사용 
		int result = 0;
		
		try {
			result = div.divide(input);
			System.out.printf("나눗셈 성공 %d%n", result);
			
		} catch (DivideZeroException e) {
			System.err.printf("나눗셈 실패 :%s%n", e);
			e.printStackTrace();
			
		} catch(Exception e) { 
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
		
		//예외 발생시 마지막 메세지 까지 오지 못한다.
	}

} 

