package staticcal.nethod;

/**
 * 산술 연산인 덧셈,뺄셈, 곱셉 나눗셈을 처리하는 각각의 메소드 add subtract , multiply , divide를 정의한다.
 * 
 * 각 메소드 마다, 매개변수를 정수 1개 ,실수 2개를 받도록 매소드 중복정의 기법을 사용하여 총 8개의 매소드를 정의하고 연산결과를
 * 리턴하도록 작성
 * 
 * 각 메소드는 static으로 작성
 */
public class Calculator {

	int num1; 
	int num2;
	double num3; 
	double num4;
	double sum;
	
	public static int add(int num1 ,int num2) {
		
		return num1 + num2;
	}

	public static int subtract(int num1 ,int num2) {

		return  num1 - num2;
	}

	public static int multiplay(int num1 ,int num2) {

		return  num1 * num2;
	}

	public static int divide(int num1 ,int num2) {

		return   num1 / num2;
	}

	
	//////////////////////////////////
	
	
	
	public static double add(double num3, double num4) {

		return num3 + num4;
	}

	public static double subtract(double num3, double num4) {

		return num3 - num4;
	}

	public static double multiplay(double num3, double num4) {

		return num3 * num4;
	}

	public static double divide(double num3, double num4) {

		return num3 / num4;
	}

}
