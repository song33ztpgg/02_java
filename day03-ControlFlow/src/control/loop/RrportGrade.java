package control.loop;


/*
 * case는 범위를 지정할수 없다. 
 *  case:  case2:    aaaaaaa   break; 
 *  만들면 2개의 경우가 하나 실행 시킬수가 있다ㅓ\.
 * 
 * */

import java.util.Scanner;

public class RrportGrade {

	public static void main(String[] args) {

		int score; 
		int grade; 
		
		Scanner scan; 
		scan = new Scanner(System.in); 
		
		int z = 0;
		while(z < 10 ) {
		System.out.println("성적을 입력하시오"); 
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
		
		
		switch(grade) { 
		case 'A' : System.out.printf("점수는 %d 이고 학점은 A입니다", score);
				    break; 
		case 'B' : System.out.printf("점수는 %d 이고 학점은 B입니다", score);
		   			break; 
		case 'C' : System.out.printf("점수는 %d 이고 학점은 C입니다", score);
					break; 
		case 'D' : System.out.printf("점수는 %d 이고 학점은 D입니다", score);
		            break;  
		 default : System.out.printf("점수는 %d 이고 학점은 F입니다", score);
		 			break;
		}
	
		
	
		} 
	} 
}

