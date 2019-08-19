//상속자
package school;


/**
 * 하교시스템에서 교직원의 정보를 저장하는 클래스 
 * dept : String : 소속부서 이름 
 * 
 * 
 * @author 304
 * */
public class Employee extends Person {

	//1. 맴버변수 선언 
	/**직원소속 부서이름*/
	private String dept; 
	
	
	//2,생성자 선언 
	public Employee() {
		
	}
	
	public Employee(String dept) {
		this.dept = dept;
	}
	/**
	 * Person에서 물려받은
	 * */
	public Employee(String id, String name, int age, String dept) { 
		super(id, name ,age); 
		this.dept = dept;
	}
	
	//3 . 메소드 선언
	//1) toStrint () 재정의 
	@Override
	public String toString() { 

		
//		String empStr = (" 부서 : " +dept);
		String empStr = String.format(" , 부서 : %s", dept); 
		return String.format("직원의 정보[%s%s]",super.toString(),empStr); 
 
		
		
	}
	
	
	
	
}
