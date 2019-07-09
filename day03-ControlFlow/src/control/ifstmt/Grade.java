package control.ifstmt;

import java.util.Scanner;

/*
 * 다중 선택  if 다음의 기준으로 학점을 계산하는 클래스
 * A : 90 
 * B : 80~ 89
 * C : 60~79 
 * D : 40~59 
 * F : 나머지 
 * */
public class Grade {

	public static void main(String[] args) {

		
		int score; 
		char grade; 
		
		Scanner scan; 
		scan = new Scanner(System.in); 
		
		int z = 0;
		
		while(z < 10 ) { 
			
		
		System.out.printf("점수를 입력하시오(%d) : ",10-z);  
		
		score = scan.nextInt(); 
		
		if(score >= 90 ) { 
			grade = 'A'; 
		} else if(score < 90 && score >= 80) { 
			grade  = 'B';
		} else if(score < 80 && score >= 60) { 
			grade  = 'C';
		} else if(score < 60 && score >= 40) {  
			grade  = 'D';
		} else { 
			grade  = 'F';
		}
			
		System.out.printf("입력하신 점수는 (%d)이며 %c 등급 입니다.\n", score, grade );	
		System.out.printf("------------------------------------------\n\n");

		z++;
		}	
			
	}

}
