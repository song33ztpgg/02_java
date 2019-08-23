package nine.process;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.omg.CORBA.INTERNAL;

public class ProcessNineArrayTest {
	public static void main(String[] args) {
		// 클래스 초기화
		ProcessNineArray processNineArray = new ProcessNineArray();

		System.out.println("입력값 예시");
		System.out.println("1 3 3 3 3 4 7 - 9");
		
		// Scanner 초기화
		// 자바는 단일 문자 받는 값이 없기에 문자열로 값을 받는다.
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine(); 
		System.out.println();
	
		String[] finalValue = input.split(" ");
		
		System.out.println("첫 분류");
		for (int idx = 0; idx < finalValue.length; idx++) { 
			System.out.printf(" ");
			System.out.printf(finalValue[idx]);
		}   
		
		
		
		int count = 0;
		
		int[] temp = new int[finalValue.length-1];
		
		for (int idx = 0; idx < finalValue.length; idx++) {		
			
			String tempString = finalValue[idx + 1];
			
			if (tempString.equals("-")) {	
				
				int fistNumInt = Integer.parseInt(finalValue[idx]); 
				int endNumInt = Integer.parseInt(finalValue[idx + 2]);
				int difference = endNumInt - fistNumInt;
						
				for(; fistNumInt < endNumInt; fistNumInt++) { 
					temp[count] = fistNumInt;
					count++;
					idx++;
				} 
				
				
			} else if (finalValue[idx] != finalValue[idx + 1]) { 
				
				int numInt = Integer.parseInt(finalValue[idx]);
				temp[count] = numInt;
				count++; 
				}
			
		}
	
		
		System.out.println("최종 결과물");		
		for(int idx = 0 ; idx < temp.length; idx++) {
			System.out.println(temp[idx]);
		}
		
	

		
		
		
//		for (Set inputValue : inputValues) {
//			
//		}
		
//		@Override
//		public List<Book> getAllBooks() {
//			// Set<Book> ===> List<Book> 
//			// (1) API 메소드 사용하여 변환
//			List<Book> bookList = 
//					Arrays.asList(books.toArray(new Book[] {}));
//			
////			List<Book> bookList = new ArrayList<>();
////			for (Book book: books) {
////				bookList.add(book);
////			}
			
//			return bookList;
	
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
