package shool;

/**
 * 시스템에 저장될 학생 , 선생, 직원의 정보중 
 * 공통적인 내용을 추출한 상위클래스 
 * 일반적인 사람의 정보를 저장한다.
 * --------------------------------------- 
 * id : String 
 * name : String 
 * age : int
 * */

public abstract class Person {
	  
	private String id; 
	private String name; 
	private int age; 
	
	
	//2.생성자 선언 
	//2.1 기본 생성자 : 생성자를 완전히 생략하면 자동으로 
	//					기본 생성자 선언이 들어가짐 
	//					생성자를 하나라도 선언하면 자동 생성되지 않음 
	Person(){
	
	} 
	
	
	//2.2 매개받는 변수를 받는 생성자  중복정의
	//    매개변수를 받는 생성자가 선언이 된 
	//	  상태에세 기본 생성자 선언을 누락하는 경우 
	//	  기본 생성자는 자동으로 만들어지지 않음 주의
	
	/** 
	 * id 필드만 초기화
	 * */
	public Person(String id){
		this(); 
		this.id = id;
	}  
	
	/** 
	 * id , name 필드만 초기화
	 * */
	public Person(String id, String name){
		this(id); 
		this.name = name;
	}   
	
	/** 
	 * 전체 필드를 초기화 하는 생성자
	 * */
	public Person(String id, String name, int age){
		this(id,name); 
		this.age = age;
	} 
	
	
	
	//3.메소드 선언부  
	
	//toString() 재정의 
	/**
	 * toString() 메소드 :  
	 * ---------------------------------------------------
	 * 1.print 계열의 메소드에서 객체 참조변수를 출력할때 
	 *   자동으로 작동하는 메소드
	 * 2.Object 클래스에서 상속받은 메소드 
	 * 3.객체를 대표하는 문자열을 리턴한다. 
	 *  => 걱 필드를 모두 출력하는 문자열
	 * */
	@Override
	public String toString(){ 
		return String.format("아이디 : %s , 이름 : %s  , 나이 : %d",id,name,age);
	}
	
	//print() 
	/**
	 * 현재의 객체를 출력하는 메소드
	 * this => id,name,age 정보가 출력 
	 *      => 이유 : print 계열의 메소드에서 객체 참조변수를 
	 *      		  출력할때 자동으로 작도하는 메소드 
	 * */
	public void print() { 
		System.out.println(this); 
		// System.out.println(this.toString());
	} 
	  
	
	
	
//	public String setId(){ 
//		return id;
//	}
//	
//	public void getId(){ 
//		this.id  = id;
//	}
//	
//	public String setName(){ 
//		return name;
//	}
//	
//	public void getName(){ 
//		this.name  = name;
//	}
//	
//	public int setAge(){
//		return age;
//	}
//	
//	public void getAge(){ 
//		this.age  = age;
//	}
	
	
	
}
