package divider.scope;

/**
 * 예외의 전차를 알아볼 수 있는 
 * DivuderScope 클래스 테스트 
 * 
 * */
public class ExceptionScopeTest {

	public static void main(String[] args) {

		//1선언 
		DividerScope divScope; 
		
		
		//2.초기화 
		divScope = new DividerScope();
		
		//3.사용 
		System.out.println(" == Main이 실행");
		
		divScope.level1();
	
		
		System.out.println(" == Main이 종료");
	}

}
