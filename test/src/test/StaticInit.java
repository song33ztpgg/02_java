package test;
/**
 * static 맴버(변수, 메소드) 와 
 * non-static 맴버(변수, 메소드) 의 
 * 
 * 초기화 시점에 따른 참조를 구성하는 클래스 
 * 
 * 
 * */
public class StaticInit {
	

	//선언하면서 필요한 초기값을 바로 할당한다 
	
	static int count = 0;   
	int memberCnt;
	
		
	public int getMemberCnt() { 
		return this.memberCnt; 
	} 
	
	public void setMemberCnt() { 
		this.memberCnt = memberCnt;
	}
	
	
	//3.2 그 외 기타 기능 메소드 
	
	/**
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
		return this.memberCnt + count;
	} 
	
	/**
	 * static 필드인 count 변수의 값을 리턴하는 메소드 
	 * */
	public static int getCount() { 
		return count;
	} 
	
	
	public static void increaseCount() { 
		count++;
	} 
	
	
	
	
	public static void print() { 
		System.out.println(" count :"  +count ); 
	  
		StaticInit init = new StaticInit();
		System.out.println(" member : " +init.memberCnt); 

	}
	
	

	
	
		
		
		
		
}
 

