package car;

public class HomeWork {
	


	public void birthYearMonth(String name, int year, int month)  { 
		System.out.printf("1. %s는 %d년 %d월 생일 입니다\n",name , year , month);
	}
	
	// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

	public void printNineNineTalbe(int stage) { 
		System.out.printf("%d단 출력\n\n", stage);
	}
	// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	/*
	 * [ 3 ]
	출력할 단의 숫자를 가지고 있는 int 배열을 매개 변수로 입력받아 
	입력된 배열의 원소인 각 숫자에 대해 
	구구단을 출력하는 메소드 
	printNineNineTalbeFromArray 
	
	stage int
	 */  
	
public void printNineNineTalbeFromArray(int stage) { 
		
		for(int num = 1 ; num < 10 ; num ++) { 
			System.out.printf("%2d x %2d = %2d\n", stage, num , (stage * num));
		}
	}
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	
	
	/**
	 * 키(cm), 몸무게(kg)을 매개변수로 입력받아
	 * BMI 지수를 계산하여 비만도 판정 결과를 리턴하는 메소드
	 * calcBmi 를 정의하시오.
	 * 
	 * 공식 : 몸무게(kg) / 키(m) 의 제곱
	 * 
	 * 15.0미만 			병적인 저체중
	 * 15.0이상 18.5미만 	저체중
	 * 18.5이상 23.0미만	정상
	 * 23.0이상 27.5이하	과체중
	 * 27.5초과 40.0이하	비만
	 * 40.0초과				병적인 비만
	 * 
	 * @param height : double
	 * @param weight : double
	 * @return String 비만도 판정 문자열
	 */
	
	
	public String CalBmi(double height, double weight) { 
		String result; 
		double bmi = 0;
		bmi = weight / (height * height);
		
		if(bmi > 40.0) { 
			result = "병적인 비만";
		} else if (bmi > 27.5) { 
			result = "비만";
		} else if (bmi >= 23.0) { 
			result = "과체중"; 
		} else if (bmi > 18.5) { 
			result = "정상";
		} else if (bmi > 15.0) { 
			result = "저체중"; 
		} else {
			result = "병적인 저체중";
		} 
		return result;
	}
	
	// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	
	public int MinTalbe(int input1, int input2) { 
		int min = 0; 
		if(input1 > input2) { 
			return min = input2;
		} else { 
			return min = input1;
		}
	}
	
	// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	
	public int MaxTable(int input3 , int input4) { 
		int max = 0; 
		if(input3 > input4) { 
			return max = input3;
		} else { 
			return max = input4;
		}
	}
	
	// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	
	/*
	 * [ 7 ]
	 * 정수가 저장된 int 배열을 매개 변수로 입력받아 
	 * 그 배열의 각 원소의 합을 구하여 리턴하는 메소드 
	 * sumOfArray을 정의 하시오  
	 * numbers : int[] 
	 * 
	 * re : int 배열의 각 원소의 합 
	 * */
	
	// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	
	/**
	 * [ 8 ]
	 * 정수가 저장된 int 배열을 매개변수로 입력받아 
	 * 그 배열의 각 원소의 평균을 구하여 리턴하는 메소드 
	 * 
	 *  avgOfArrat를 정의 하시오 
	 *  
	 *  numbers : intp[]  
	 *  
	 *  re: double 배열의 각 원소의 평균 
	 * */ 

	public double avgOfArray(int[] numbers) {
		//1.배열 원소의 총합  
		//(1) 총합 변수 선언,초기화 
		int sum =0; 
		//(2)평균변수 선언
		double avr; 
		//(3)배열의 원소의 합을 구함 
		for(int num : numbers) { 
			sum += num;
		} 
		
		//(2.총합// 원소의 갯수 - > 평균
		avr = (double)sum / numbers.length;
	//	System.out.printf("%d", average);
		return avr;
		
	}
	
	 
	
	
	
	// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	
	/*
	 * [ 9 ]
	 * char  타입의 연산자와 두 개의 정수를 매개 변수로 입력받아 
	 * 입력된 연산자 '+' 일때만 
	 * 두정수의 합을 구하여 출력하는 메소드 
	 * adder 를 정의하시오  
	 * 
	 * 출력형태:  10 + 20 = 30 
	 * 
	 *  op :char 연산자가 전달되는 변수 
	 *  x int 첫 번째 피연산자 
	 *  y iny 두 번째 피 연산다
	 *  
	 * */  
	public int adder(int num3, int num4 ) {
		int result = 0; 
		
		result = num3 + num4;
		return result;
		
	}
	// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ 
	public int test(double a) { 
	return (int)a - 1;
	}

	
}


	

