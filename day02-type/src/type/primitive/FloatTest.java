package type.primitive;

/*
 * float , double : 실수형(소수점 표현가능) 데이터를 표현, 저장할 수 있는 타입
 * 
 * */

public class FloatTest {

	public static void main(String[] args) {
		
	float pi1; 
	double pi2; 
	
	pi1 = 3.14f; 
	pi2 = 3.14;
	
	System.out.println(pi1);
	System.out.println(pi2);
	
	
	System.out.println("=========================================");
	
	pi1 = 3.141592653589793238462643383279502884197169f; 
	pi2 = 3.141592653589793238462643383279502884197169;
	
	System.out.println(pi1); 	//3.1415927
	System.out.println(pi2);  	//3.141592653589793 


	}

}
