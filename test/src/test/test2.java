package test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {

	int[][] player = new int[3][9]; 
	Scanner scan = new Scanner(System.in);
	int score = 0; 
	int[] PS = new int[3];
	
	System.out.println("과녁의 점수를 입력하시오"); 
	
	for(int i= 0; i < player.length ; i++) {  
		System.out.printf("%d 선수의 점수를 입력하시오", i +1);
		for(int j = 0; j < player.length ; j++) { 
			player[i][j] = scan.nextInt(); 
			PS[i] += player[i][j];
		}
	}
	
	if(PS[0] > PS[1]) { 
		
		if(PS[0] > PS[2]) { 
			score = PS[0]; 
		}
		else {
			score = PS[2]; 
		} 
					
	} else if(PS[1] > PS[2]) { 
		
		if(PS[1] > PS[2]) { 
			score = PS[1]; 
		}
		else {
			score = PS[2]; 
		}
	}
	
	
	
	System.out.printf("각자 선수의 점수는\n"); 
	
	for(int i = 0; i < PS.length ; i++ ) { 
		System.out.printf("%d선수 점수 = %d\n", i+1 ,PS[i] );
	} 
	System.out.printf("최고의 선수 점수는 %d입니다", score);
	
	
	}

}
