package control.ifstmt;

import java.util.Scanner;

/*
 * 입력값은구문으로 부호 판별후 
 * */
public class PositiveNegatice {

	public static void main(String[] args) {

		
		int x; 
		String result ;
		
		Scanner scan; 
		scan = new Scanner(System.in); 
	
		System.out.println("값을입력하시오"); 
		x = scan.nextInt(); 
	   
		
		if( x > 0 )	{
			result = "양수";
		} 
		else if( x < 0) {  
			result = "음수"; 
		} 
		else {
			result = "잘못입력함";
		} 
		// 모든 조건을 성립하지 못하고 내려 올수 있기 때문에
		
		System.out.printf("입력한 값은 %d이며 %s \n", x, result);
		
	}

}
