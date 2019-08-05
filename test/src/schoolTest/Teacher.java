package schoolTest;

public class Teacher extends Person {

	private String subject;
	
	public Teacher() { 
		
	}
	
	public Teacher(String subject) { 
		this.subject = subject; 
	}
	
	public Teacher(String id, String name,int age ,String subject) { 
		super(id,name,age); 
		this.subject  = subject;
	} 
	
	public String toString() { 
		String tcStr = String.format(" ,과목 : %s", subject); 
		return  String.format("교사정보 [ %s%s]", super.toString(), tcStr);
	}
	
}
