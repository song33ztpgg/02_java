package schoolTest;


public class Student extends Person {

	private String major; 
	
	public Student( ) { 
		
	} 
	
	public Student(String major) { 
		this.major = major;
	}
	
	public Student(String id, String name,int age ,String major) { 
		super(id,name,age); 
		this.major = major;
	} 
	
	public String toString() { 
		String stdStr = String .format(" , 전공 : %s" , major); 
		return String.format("학생정보[ %s%s]", super.toString(), stdStr);
	}
	
	
}
