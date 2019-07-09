package test;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		int z=0; 		// 반복하기 위한 변수
		int x; 
		String result;  //결과를 넣기
		int mod = 0;    // 나머지 변수 
			
		Scanner scan; 
		scan = new Scanner(System.in); 
				
		while(z < 10)  { 
	
		System.out.printf("값을 입력하시오( 남은 횟수 %d)\n",(10 -z)); 
		x = scan.nextInt(); 
		if(z == 0) { 
			System.out.println("0은 측정할수 없습니다"); 
			
		}
				
		if((x % 2) == 0 ) { 
			result = "입니다";
		} else { 
		   result = "아닙니다";
		} 
				
				
				
				
		System.out.printf("입력값 %d은(는) 2의 배수%s\n", x, result);
		System.out.printf("나머지가 %d입니다\n", (x % 2)); 
		System.out.println("------------------------------\n\n");
				
		z++; 


	}

} 
}
