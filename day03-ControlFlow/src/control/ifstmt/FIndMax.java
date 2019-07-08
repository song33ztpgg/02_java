package control.ifstmt;

import java.util.Scanner;

public class FIndMax {

	public static void main(String[] args) {

		
		int x; 
		int y; 
		int max = 0; 
		
		Scanner scan; 
		scan = new Scanner(System.in); 
		System.out.println("값을 입력하시오"); 
		x = scan.nextInt(); 
		y = scan.nextInt(); 
		
			
		if(x < y) 
		{
			max = y;
		}  
		else 
	    if ( x > y ) 
	    { 
	       max = x; 
	    } 
		
		System.out.printf(" %d 와 %d 중 큰 값은 %d 입니다\n" ,x, y ,max); 
		
		
		
	}

}
