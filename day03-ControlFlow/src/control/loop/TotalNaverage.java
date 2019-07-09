package control.loop;
import java.util.Scanner;

public class TotalNaverage {

	public static void main(String[] args) {
		int total = 0; 
		int score = 0; 
		int count = 0;  
		
		Scanner scan; 
		scan = new Scanner(System.in); 
		
		System.out.println("점수를 입력하시오");
		score = scan.nextInt();
		total += score;
		
		while(score != 0) { 
			System.out.printf("총점은 %.2f 입니다\n",((double)total));
			score = scan.nextInt();
			total += score;
			count++; 
		} 
		
		if (count == 0) { 
			System.out.println("입력된 값이 없습니다");
		} else {  	
			System.out.printf("평균은 %.2f 입니다", (((double)total) / count ));
		}
	}

}
