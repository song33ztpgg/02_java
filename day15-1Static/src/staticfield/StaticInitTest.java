package staticfield;
/**
 * static <--> non-static  
 * 사이 호출 관계를 
 * 서로 다른 클래스에서 테스하는 클래스 
 * */

public class StaticInitTest {

	public static void main(String[] args) {
		// 다른 클래스의 static 필드에 대한 사용 
		// ==> 선언, 초기화 사용의 순서가 필요 없음 
		// 		바로 사용가능 
		//1.선언 2.초기화 3. 사용  (non -static 필드 사용에 관한 순서)
		
		
		// 1.StaticInit 클래스의 static 변수 
		//=> 클래스이름.변수이름()
		System.out.println("StaticInit.count =" + StaticInit.count);
		
		//2. static Init클래스의 static 변수 사용 
		//=> 클래스이름.메소드이름()
		StaticInit.increaseCount(); 
		System.out.println(+StaticInit.count);
	
		//1.선언 초기화  
		StaticInit init = new StaticInit();
		
		//사용 
		init.setMemberCnt(); 
		System.out.println( +init.addCount());
		
		
		
	 
		
	}
}
