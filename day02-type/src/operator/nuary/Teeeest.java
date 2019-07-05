package operator.nuary;

import java.util.Scanner;

public class Teeeest {

	public static void main(String[] args) {
	
		int i ; 
		
		Scanner scan1; 
		
		scan1 = new Scanner(System.in); 
		
		i = scan1.nextInt(); 
		
		 

		System.out.printf("입력하신 값은 %d 입니다\n" , i);
		
		for(int z=0; z<(i+1);++z) 
		{ 
			System.out.printf(" %d" ,z);
		}
	}

}
