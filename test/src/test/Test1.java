package test;

import java.util.Random;

public class Test1 {

	public static void main(String[] args) {

	
		
		
		int[][] numbers; 
		numbers = new int[5][5]; 
		int count = 1;

		
		int[] salaries; 
		salaries = new int[10];
		
		

			salaries[0]= 10;
			salaries[1]= 55;
			salaries[2]= 86;
			salaries[3]= 23;
			salaries[4]= 98;
			salaries[5]= 34;
			salaries[6]= 50;
			salaries[7]= 100;
			salaries[8]= 120;
			salaries[9]= 130;
		
		
		for(int idx = 0;idx < salaries.length; idx++) { 
			System.out.printf("salaries[%d] = %d\n", idx,salaries[idx]);
		}
		
		
				
		System.out.printf("\n\n\n"); 
		
		System.out.println("배열의 길이 :" + salaries.length);
		
//		System.out.printf("salaries[10] = %d", salaries[10]); 
//		System.out.printf("salaries[10] = %d", salaries[-1]);
		//java.lang.ArrayIndexOutOfBoundsException   - 배열범위를 벋어난 오류
		
		
		//다중배열 
		// ================================================================
		for(int i = 0; i <= 4 ; i++) { 
		
			for(int j=0 ; j <=4; j++) { 
			
				count++;	
				numbers[i][j] = count;
				
				System.out.printf("%2d " , numbers[i][j]); 
				
			} 
			System.out.println();
			
		}
		
		
		
		
}}


