package staticcal.nethod;


//이름
import static staticcal.nethod.Calculator.subtract; 

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator cal = new Calculator(); 
		
		System.out.println(cal.add(1, 2));
		System.out.println(cal.add(3.0, 4.0)); 
		
		System.out.println(Calculator.subtract(10, 3));

		/*
		 * 자바에서는 클래스의 
		 * static 필드들(변수, 메소드)에 대해서 
		 * sratic import지원 
		 * static import 구문을 클래스 선언 위쪽에 작선한 경우 
		 * 메소드 이름 만으로 호출 할 수 있다.
		 * */
		
	
		int sum = cal.add(10,20); 
		
		System.out.println(sum);
	
	}

}
