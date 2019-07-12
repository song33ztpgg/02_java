package car;

import java.util.Scanner;

public class HomeWorkTest {

	public static void main(String[] args) {

		HomeWork Test; 
		Test = new HomeWork(); 
		Scanner scan = new Scanner(System.in); 
		int numberSelect = 0;
		
while(numberSelect !=9) {
		System.out.printf("---------------------------------------------\n"); 
		System.out.println("문제");
		System.out.println("1. 이름, 생년 , 출생월을 반환");
		System.out.println("2. 출력 단의 제목 입력"); 
		System.out.println("3. 출력 단의 int 배열을 변수로 입력받아 구구단 제작");
		System.out.println("4. 키(cm), 몸무게(kg)을 bmi 범위 리턴");
		System.out.println("5. 입력된 2값중 작은값 리턴");
		System.out.println("6. 입력된 2값중 큰값 리턴");
		System.out.println("7. 배열을 받아 총 합 리턴");
		System.out.println("8. 베열을 받아 평균 리턴");
		System.out.println("9. +일때만 2개의 합을 계산");
		//System.out.println("10. 모든 결과 일괄 출력");
	
		System.out.println("값을 입력하세요"); 
		numberSelect = scan.nextInt();
		System.out.println("-------------------------------------------");
		switch(numberSelect) {
		case 1 : 
	
		
		Test.birthYearMonth("친동생", 1997, 6); 
		break;
// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		
		case 2 : 
		System.out.println("숫자를 입력하시오"); 
		int stage = scan.nextInt();
		Test.printNineNineTalbe(stage); 
			
		break;
		 
		
// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■		
		case 3: 
		
			/**
			 * 출력할 단의 숫자를 가지고 있는 
			 * int 배열을 매개변수로 입력받아
			 * 입력된 배열의 원소인 각 숫자에 대해 
			 * 구구단을 출력하는 메소드
			 * printNineNineTableFromArray 를 정의하시오
			 * 
			 * @param stages : int[]
			 */
		
		int stages = 0; 
		System.out.println("원하는 구구단을 입력하시오"); 
		stage = scan.nextInt();  
		Test.printNineNineTalbe(stage);
		break;
// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■		
		case 4: 
		/*
		 * [ 4 ]
		 키(cm) ,몸무게(kg)을 매개 변수로 입력받아 BMI지수를 계샇나여 
		 비만도 판정 결과를 리턴하는 메소를 calBmi를 정의하시오 
		  */
		
		System.out.println("키(cm) 와 몸무게(kg)을 입력하시오"); 
		double height = scan.nextDouble(); 
		double weight = scan.nextDouble();  
		String result = Test.CalBmi(height,weight);
		System.out.printf("%s\n\n", result); 
		break;
	
// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■		
		case 5: 
		
			System.out.println("2개의 값을 입력하시오"); 
			int input1 = scan.nextInt();
			int input2 = scan.nextInt(); 
			
			int min = Test.MinTalbe(input1, input2); 
			System.out.printf("최소값은 %d 입니다\n\n",min);
			break;
// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■	
		case 6: 
		
			System.out.println("2개의 값을 입력하시오"); 
			int input3 = scan.nextInt();
			int input4 = scan.nextInt();
			
			int max = Test.MaxTable(input3 , input4);
			System.out.printf("최대값은 %d 입니다\n\n",max);
			break;
// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■		
		case 7: 
		/*
		 * [ 7 ]
		 * 정수가 저장된 int 배열을 매개 변수로 입력받아 
		 * 그 배열의 각 원소의 합을 구하여 리턴하는 메소드 
		 
		 * */ 
			
		System.out.println("배열의 크기를 입력하시오"); 
		int size = scan.nextInt();
			break;
// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■		
		case 8: 
		/*
		 * [ 8 ]
		 * 정수가 저장된 int 배열을 매개변수로 입력받아 
		 * 그 배열의 각 원소의 평균을 구하여 리턴하는 메소드 
		 
		 * */ 
			break;
// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■		
		case 9: 
			/*
		 * [ 9 ]
		 * char  타입의 연산자와 두 개의 정수를 매개 변수로 입력받아 
		 * 입력된 연산자 '+' 일때만 
		 * 두정수의 합을 구하여 출력하는 메소드 
		
		 *  
		 * */
		int k = 1;
		System.out.println("부호를 입력하시오");
		while(k) {
		String code = scan.nextString(); 
		if(code != '+') { 
			System.out.println("다시 입력하세요"); 
		} 
		}
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
	    
		break;	
// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■		
		
		
		}
	}
	}
}
