package operator.nuary;
/*
 * +,-,*,/,% 이항 산술 연산자 
 * 
 * 산술연산 할때는 타입이 큰쪽의 타입으로 맞추어 연산된다.
 * */
public class Arithmetic {

	public static void main(String[] args) {

		int input1 = 222; 
		int input2 = 100;  
		
		System.out.println("input1 + input2 = "  + (input1 + input2));
		System.out.println("input1 - input2 = "  + (input1 - input2));
		System.out.println("input1 * input2 = "  + (input1 * input2));
		System.out.println("input1 / input2 = "  + (input1 / input2));
		System.out.println("input1 % input2 = "  + (input1 % input2));
		
		
		 
	}

}
 