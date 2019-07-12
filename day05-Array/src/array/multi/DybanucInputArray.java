package array.multi;

import java.util.Scanner;

/*
 * 정수를 저장하는 동적 2차 배열을 number 생성 
 * numbers 의 사이즈 : 4 
 * */
public class DybanucInputArray {

	public static void main(String[] args) {

		int[][] numbers2d; 
		int input = 0; 
		int value = 0;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("2차 배열의 크기를 입력하시오"); 
		input = scan.nextInt();
		
		numbers2d = new int[input][];
		
		
		for(int idx= 0; idx < numbers2d.length; idx++) {  
			System.out.printf("인덱스[%d] 1차 배열 크기 입력 : %n",idx); 
			numbers2d[idx] = new int [scan.nextInt()];  
			// 5 3 2 7
			
			for(int ind = 0; ind < numbers2d[idx].length;ind++) { 
				numbers2d[idx][ind] = (value +=10); 
			} }
			 
		for(int[] array : numbers2d) { 
			for(int num : array) { 
				System.out.printf("%d\t", num);
			}
		System.out.println();	
		} 
} 
}

