package type.primitive;

/*
 * char : 문자 1개를 저장하는 타입 
 * 문자를 유니코드 표기법으로 저장하고 출력하여 테스트 하는 클래스
 * */

public class CharUnicodeTest {

	public static void main(String[] args) {

		
		
		
		// \ :유니코드를 의미
		
		char han = '\ud55c';  
		char gul = '\uae00';
		
		System.out.println("han = " + han);
		System.out.println("gul = " + gul);
		System.out.println("han gul= " + han + gul); 
		
		System.out.println("======================================"); 
		
		System.out.println(han);                // han
		System.out.println(gul);				// gul
		System.out.println(han + gul); 			//
		System.out.println(han + "" + gul);     // (han + "") = 문자화
		
		
		
		
	}

}
