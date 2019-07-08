package control.ifstmt;

import java.util.Scanner;

/*
 
두정수중 작은 값을 가려내는 클래스 
두정수는 Scanner 로 입력받는다

c언어
{
   ~~~              
}  


자바 { 
   ~~~~~
}

 * */
public class FindMin {

	public static void main(String[] args) {

		int x; 
		int y; 
		int min = 0; 
		
		Scanner scan; 
		
		scan = new Scanner(System.in); 
		System.out.println("값을 입력하시오 X");
		x = scan.nextInt( );
		
		System.out.println("값을 입력하시오 y");
		y = scan.nextInt( ); 
		
		if(x < y) 
			min =x; 
		
		if (x > y) 
			min =y;
		
		
		System.out.printf("입력한값은 x =%d, y=%d 중 작은 값은 %d입니다" , x, y, min);
		//min 이 두값 모두 성립 안될수 있기때문에 min 초기화를 해야 한다
		
		
		
		
	}

}
