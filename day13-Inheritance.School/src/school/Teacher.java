package school;


/**
 * 학교 시스템에서 
 * 과목을 가르치는 선생의 정보를 저장하는 클래스 
 * 사람의 공통정보를 담는 클래스 Person을 상속한다
 * 
 * */

public class Teacher extends Person {

	//1. 맴버 변수 
	private String subject;
	
	//2. 생성자 
	public Teacher() { 
		
	}
	
	// 매개변수 받는 생성자 
	public Teacher(String subject) { 
		this.subject = subject; 
	}
	
	/**
	 * Person 에서 물려받은 필드를 
	 * 부모 클래스의 생성자를 빌려서 초기화 하고  
	 * Teaher 의 필드인 subject 는 직접 초기화
	 * */
	public Teacher(String id, String name,int age ,String subject) { 
		super(id,name,age); 
		this.subject  = subject;
	} 
	
	
	//3.매소드 선언 
	//(1) toString() 재정의 
	
	@Override 
	public String toString() { 
		
		String tcStr = String.format(" ,과목 : %s", subject); 
		return  String.format("교사정보 [%s%s]", super.toString(), tcStr);
	}
	
}
