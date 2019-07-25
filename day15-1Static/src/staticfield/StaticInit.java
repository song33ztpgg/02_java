package staticfield;
/**
 * static 맴버(변수, 메소드) 와 
 * non-static 맴버(변수, 메소드) 의 
 * 
 * 초기화 시점에 따른 참조를 구성하는 클래스 
 * 
 * 
 * */
public class StaticInit {
	
	//1. 스태틱 변수(맴버변수 보다 위에 선언)
	
	//1.1 스태틱 변수 선언 (클래스 변수 선언)
	//	  - 스태틱 변수는 생성자가 초기화 하는 영역이 아니므로 
	//		선언하면서 필요한 초기값을 바로 할당한다 
	
		static int count = 0;   
		
	//1.2 맴버 변수 선언(인스턴스 변수 선언)
	//	  생성자가 있을때 초기화가 이루어 진다
		int memberCnt;
	
		
	//2. 생성자 생략 -> 기본 생성자 자동 제공 
		
	//3.메소드선언  
	//3.1 접근자 / 수정자 => 맴버 변순에 대해서 제공 
	public int getMemberCnt() { 
		return this.memberCnt; 
		//this 안붙여도 상관없음 
		//맴버변수가 하나이기때문 
	} 
	
	public void setMemberCnt() { 
		this.memberCnt = memberCnt;
	}
	
	
	//3.2 그 외 기타 기능 메소드 
	
	/**
	 * 이클래스의 클래스 변수(static 변수)인 
	 * count와 인스턴스 변수인  memberCnt를 더한 값을 
	 * 리턴하는 메소드
	 * --------------------------------------- 
	 * 1) 이 메소드는 static modifier가 붙지 않았으므로 
	 *    non - static 메소드가 된다 
	 * 2) non- static이 static 참조할 때 객체 없이 참조 
	 * 	  = non- static 메소드인 이 메소드에서 static 필드인 
	 * 		count 값을(참조) 하려 할때 아무런 제약없이 바로 사용가능 
	 * 
	 *3) 이유는 static 필드는 초기화 시점이 앞서기 때문
	 * 
	 * @return count + memberCnt : int
	 * */
	public int addCount() {  
//	유시지 파일
		return this.memberCnt + count;
							 //  └이미 초기화 되었다
	} 
	
	/**
	 * static 필드인 count 변수의 값을 리턴하는 메소드 
	 * static 메소드로 작성
	 * @return count : int 
	 * 
	 * */
	public static int getCount() { 
		// 참조 : static ,참조되는 : static
		return count;
	} 
	
	
	/**
	 * static 필드인 count 변수를 증가시키는 메소드 
	 * */ 
	public static void increaseCount() { 
		count++;
	} 
	
	
	
	/**
	 * static 필드인 count 변수와 
	 * non - static 필드인 memberCnt 변수의 
	 * 값을 모두 출력하는 메소드
	 * */
	public static void print() { 
		//1.count 출력 
		System.out.println(" count :"  +count ); 
		//2.member  
		
		/*
		 * 오류 이유  
		 * static 필드에서 non - ststic 필드를 참조(사용) 
		 * 하려면 바로 사용 할 수 없고 
		 * 그 non - static 필드를 가지고 있는 클래스의 인스턴스를 생선한 후 
		 * 생성한 인스턴스.non-static 필드 이름으로 접근 하는 것만 가능하다
		 * */
		
		// System.out.println(" member : " +memberCnt); 
    	// 										└초기화가 되지 않아서 사용하지 못함		
		StaticInit init = new StaticInit();
		System.out.println(" member : " +init.memberCnt); 

	}
	
	

	
	
		
		
		
		
}
 

