package type.primitive;

import java.util.Scanner;

/*
 * long : int 보다 큰 정수를 저장하는 타입 
 *  	  숫자뒤에 l,L 을 넣을수 있다 
 *  	  L 붙이는 이유 long 타입인것을 알려주기 위해서
 * */

public class LongTestJava {

	public static void main(String[] args) {

		long millSecond; 
		millSecond = 1000;
		System.out.println("milli Second=" +millSecond);
		
		millSecond = 2000L;
		System.out.println("milli Second=" +millSecond);
		
		millSecond = 3000l;
		System.out.println("milli Second=" +millSecond);
		

		
		
		
		
////////////////////////////////////////////////////////////
//		int i = 2;
//		switch(i) 
//		{ 
//		case 1: System.out.println("1"); break; 
//		case 2: System.out.println("2"); break;		
//		case 3: System.out.println("3"); break; 
//		default : System.out.println("0"); break;
//		}
		
		
		Scanner A = new Scanner(System.in); 
		System.out.println("입력하시오");
		String B;
		B = A.nextLine();  
		System.out.println(B);
		
		
		//		System.out.println(+A);
	}

}
