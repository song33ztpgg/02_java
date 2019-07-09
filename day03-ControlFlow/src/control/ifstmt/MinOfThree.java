package control.ifstmt;

import java.util.Scanner;

public class MinOfThree {

	public static void main(String[] args) {

	 int num1; 
	 int num2; 
	 int num3; 
	 int max; 
	 
	 Scanner scan; 
	 scan = new Scanner(System.in); 
	int z = 0;
	 
	 while(z < 10) {
	 
	 System.out.println("세정수를 입력하시오"); 
	 
	 num1 = scan.nextInt();
	 num2 = scan.nextInt();
	 num3 = scan.nextInt();
	
	 if(num1 < num2) { 
		 if(num2 < num3) { 
			max = num3;
		 } else { 
			max = num2;
		 } 
	 } else {  
		 if(num1 < num3) { 
			 max = num3; 
		 } else { 
			 max = num1;
		 }
	 }
	 
	 System.out.printf("입력한 값중 가장 큰 값은 %d입니다\n", max);
	 System.out.printf("------------------------------------\n\n");
	 
	 }
	
	
	
	}

}
