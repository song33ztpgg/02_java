package schoolTest;

public abstract class Person {
	  
	private String id; 
	private String name; 
	private int age; 
	
	Person(){
	
	} 
	
	
	//2.2 매개받는 변수를 받는 생성자  중복정의
	//    매개변수를 받는 생성자가 선언이 된 
	//	  상태에세 기본 생성자 선언을 누락하는 경우 
	//	  기본 생성자는 자동으로 만들어지지 않음 주의
	
	public Person(String id){
		this(); 
		this.id = id;
	}  
	
	public Person(String id, String name){
		this(id); 
		this.name = name;
	}   
	
	public Person(String id, String name, int age){
		this(id,name); 
		this.age = age;
	} 
	
	public String toString(){ 
		return String.format("아이디 : %s , 이름 : %s  , 나이 : %d",id,name,age);
	}
	
	public void print() { 
		System.out.println(this); 
		// System.out.println(this.toString());
	}  
}
	  
	
	
