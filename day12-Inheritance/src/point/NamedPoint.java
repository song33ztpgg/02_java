package point;
/** 
 * 수학세어 시음리 붙은 점을 나타내는 클래스
 * @author 304
 * */

public class NamedPoint extends Point {
	//1.맴버 변수 
	private String name;
	
	
	//2.생성자 중복정의
	public NamedPoint(int x, int y) { 
		super(x, y);
	} 
	
	public NamedPoint(String name , int x, int y) { 
		this(x, y); 
		this.name = name;
	} 
	
	//3. 접근자, 수정자 
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	} 
	
	//toString() 재정의  
	//부모클레스에서 물려받은 (1,2) 와 같이 좌표를 괄호에 
	//표기하는 문자열 앞쪽에 점의 이름을 덧붙이도록 변경 
	
	@Override 
	public String toString() { 
		return name + super.toString(); 
					 // 부모가 String.format 의 형식을 사용하겠다 
	// 만약 x,y 직접 사용하고 싶다면 
	//String
	//1. protected
	//2.	

	
		
	}
	

}
