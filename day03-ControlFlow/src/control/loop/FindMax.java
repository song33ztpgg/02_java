package control.loop;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {

	
	int input; 
	int max;  
	Scanner scan = new Scanner(System.in); 
	
	max = 0;
	do { 
		
		System.out.println("양수를 입력(끝내려면 0입력)"); 
		input = scan.nextInt(); 
		if(input > max) { 
			max = input;
		}
	}while(input > 0);
	
	System.out.printf("최대값은 %d",max);
	}

}
