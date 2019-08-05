package divider.scope;
/**
 * level1() -> level2() -> level3()  
 * 의 순서대로 호출이 일어나는 클래스 
 * 
 * level3() 메소드 안에 0으로 나누는 상황이 발생 
 * 할 수 있는 연산을 수행 
 * 
 * level3() 에서 발생한 예외가 메소드 호출의 역순으로  
 * 전파되는 것을 확인 
 * 
 * */

public class DividerScope {
	public void level3(int input) throws DivideZeroException { 
		//1.선언
		//나눗셈을 수행할 divder 객체 참조 변수 선언 
		Divider div;
		
		//2.초기화
		div = new Divider(); 
		
		//3.사용 
		System.out.println("-----LV3 시작");
		
		div.divide(input);
		
		System.out.println("-----LV3 종료");
	} 
	
	
	public void level2() throws DivideZeroException { 
		System.out.println("-----LV2  시작");
		//0으로 나누는  상황이 발생하도록 
		level3(0);
		
		
		System.out.println("-----LV2  종료");
	} 
	
	public void level1() { 
		
		System.out.println("-----LV1  시작");

		
		try {
			level2();
		} catch (DivideZeroException e) {
			System.out.println("문제발생  " +e);
			e.printStackTrace();
		}
		
		System.out.println("-----LV1  종료");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
