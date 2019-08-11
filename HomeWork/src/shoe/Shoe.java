package shoe;

public class Shoe {
	//맴버 변수 선언
	private  int code; //순차적 증가
	private String name; 
	private int size; 
	private int price; 
	private String type; 
	private int quantity;

	//기본 생성자 
	public Shoe() { 
		
	} 
	
	//생성자 
	public void setCode(int code){
		this.code = code;
	}
	
	public void setName(String name){
		this.name = name;
	}  
	
	public void setSize(int size) { 
		this.size = size;
	} 
	
	public void setPrice(int price) {
		 this.price = price;
	} 
	
	public void setType(String type) { 
		this.type = type; 
	} 
	
	public void setQuantity(int quantity) { 
		this.quantity = quantity;
	}
	
	
	
}


//-----------------------------------------------
//
//+ 기본생성자 / + 생성자 중복정의 할 수 있는 만큼 모두
//----------------------------------------------
//+ 각 필드의 접근자 / 수정자 메소드
//+ code 기준 equals(), hashCode() 재정의
//+ toString() 재정의
//
