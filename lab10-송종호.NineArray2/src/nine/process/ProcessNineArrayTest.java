package nine.process;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProcessNineArrayTest {
	public static void main(String[] args) {
		// 클래스 초기화
		ProcessNineArray processNineArray = new ProcessNineArray();

		System.out.println("입력값 예시");
		System.out.println("1 3 3 3 3 5 6 - 7 - 9");
		
		// Scanner 초기화
		// 자바는 단일 문자 받는 값이 없기에 문자열로 값을 받는다.
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
//		// 입력값을 정리하여 담는 배열
//		// set은 동일 값을 받지 않기 때문에 중복된 값을 모두 제거 한다.
		Set<Integer> inputValues = new HashSet<Integer>();
	
		
		System.out.println(input.charAt(2));
		
		for (int x = 0; x < input.length(); x++) {
			
//			inputValues.add((int) input.charAt(x)); 
		}  
		
//		for (Set inputValue : inputValues) {
//			
//		}
	
//		inputValues
		
		
//		int[] numbers = new int[input.length()];
//		=Integer.parseInt();
		//이유알기
//		for(int number : numbers) {
//			numbers[number] = input.charAt(number);
//			System.out.println(numbers[number]);
//		} 
		
//		for(int idx = 0; idx < numbers.length; idx++ ) {
//			numbers[idx] = input.charAt(idx);
//			System.out.println(numbers[idx]);
//		}
		
		
		
		
//		processNineArray.test2(3);
//		processNineArray.test2(2);


		// 가로 세로 대각선중 하나의 값을 입력을 받음
		System.out.println("가로 , 세로 , 대각선 중 하나를 입력하시오");
		String calcuInput = scan.nextLine();

		// 입력된 값을 Calculation 에 보내기
		processNineArray.Calculation(calcuInput);

	}

}
