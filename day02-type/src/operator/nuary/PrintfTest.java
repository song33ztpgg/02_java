package operator.nuary;

import java.util.Scanner;

/*
 * 포맷팅 출력을 지원하는 printf() 
 * %d : decimal : 십진수
 * %b : 
 * $f : 
 * $s : 문장들
 * $c : 문자열 1개
 * $x : hexadecimal :16진수 
 * %x :
 * %%
 * 
 *
 * */
public class PrintfTest {

	public static void main(String[] args) {
 
		
		
		
		int i=222; 
		int j=100; 
		System.out.printf("%d + %d = %d\n", i , j , i+j );
		
		System.out.printf("%d + %d = %d\n" ,i ,j ,+( i + j));
		System.out.printf("%d * %d = %d\n" ,i ,j ,+( i * j));
		System.out.printf("%d / %d = %d\n" ,i ,j ,+( i / j));
		System.out.printf("%d %% %d = %d\n" ,i ,j ,+( i % j )); 
	
		
		//스캐너 사용을 위해 import 
		//ctrl + shift + o 하면 해더함수? 가 생긴다.
		int input2 ; 
		int input1 ; 
				
		int Z =10;
		
		System.out.println("값을 입력하시오");
		
		
		
		System.out.printf("입력한값은 %d 입니다" , +Z); 
		
	
		Scanner scan = new Scanner(System.in); 
		
		input1 = scan.nextInt(); 
		input1 = scan.nextInt();

		
		
		
	}

}
