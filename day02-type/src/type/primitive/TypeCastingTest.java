package type.primitive;


/* 
 숫자형 데이터 사이에 형변환 Type Casting 테스트 하는 클래스이다
 프로모션 : 10 -> 10.00    큰 자료형 형 변환, 데이터 무손실
 디모션   : 12.34 -> 12    작은 자료형으로 강제 변환, 데이터 손실 
 */

public class TypeCastingTest {

	public static void main(String[] args) {

		
		double pi = 3.1415926535797; 
		int number = 100; 
		int result; 
	
		// TypeCasting : (타입이름) 피연산값; 
		
		result = number + (int)pi;  //pi는 계산에서만 형식이 바뀌었을뿐 pi값은 변하지 않았다.
		System.out.println("pi = "+pi);   
		System.out.println("resullt = " +result);
		
		System.out.println("===================================");
		
		byte buffer = (byte) result; 
		System.out.println(result); 
		System.out.println(buffer);

	}

}
