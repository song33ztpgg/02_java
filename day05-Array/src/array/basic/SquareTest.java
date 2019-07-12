package array.basic;

/*
 
 
 정수를 원소로 가지는 배열 numbers 선언후
 
 
 * */

public class SquareTest {

	public static void main(String[] args) {

		int[] numbers = new int[10]; 
		
		for(int num =0; num < 10 ; num ++) { 
			numbers[num] = num + 1; 
		} 
		
		for(int idx2 : numbers) { 
			System.out.printf("-----%d단--------\n",idx2);
			
			for(int idx : numbers) { 
				System.out.printf("%2d X %2d = %2d\n", idx2, idx, idx2 * idx);
				}  
			System.out.println("");
			}
		
		System.out.println("제곱표 출력");
		for(int idx : numbers) { 
			System.out.printf("%2d ^ %2d = %2d\n", idx, idx, idx * idx);
			}
		
		
		
	}

}
