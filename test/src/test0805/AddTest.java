package test0805;

import java.util.Scanner;

public class AddTest {

	public static void main(String[] args) throws AddExcption {

		int num = 0; 
		Add test1 = new Add();
		AddExcption test2 = new AddExcption();
		
		
		System.out.println("숫자를 입력하시오"); 
		Scanner scan = new Scanner(System.in); 
		int a = scan.nextInt();
		
		
		
		test1.result(num);
		
	}

}
