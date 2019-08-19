package shoe;

public class Shoe {
	//맴버 변수 선언
	//-code     : int    : 신발 제품코드 (1, 2, 3, ... , n) 으로 숫자로 1씩 증가함
	//-name     : String : 신발 제품 명
	//-size     : int    : 신발의 사이즈(한국형 크기 240, 250 등)
	//-price    : int    : 가격
	//-type     : String : 신발의 타입
//	                   (운동화, 샌들, 구두, 슬리퍼, 부츠 중 1개의 String 값을 가질 수 있음)
//	                   (정의 시점에는 적용 불가능 실제 사용하여 Shoe 인스턴스 만들때 이러한 값으로 적용)
	
	private int code; //순차적 증가
	private String name; 
	private int size; 
	private int price; 
	private String type; 
	private int quantity;

	//기본 생성자 
	public Shoe() { 
		
	}  
	
	public Shoe(int code, String name, int size, int price, String type ,int quantity) { 
		this();
		this.code = code;
		this.name = name;  
		this.size = size;  
		this.price = price; 
		this.type = type;
		this.quantity = quantity;
	}

	
	// + 생성자 중복정의 할 수 있는 만큼 모두
	//+ 각 필드의 접근자 / 수정자 메소드
	public void setCode(int code){
		this.code = code;
	}
	
	public int getCode() { 
		return code;
	}
	
	public void setName(String name){
		this.name = name;
	}  
	
	public String getName() { 
		return name;
	}
	
	public void setSize(int size) { 
		this.size = size;
	} 
	
	public int getSize() { 
		return size;
	}
	
	public void setPrice(int price) {
		 this.price = price;
	}  
	
	public int getPrice() { 
		return price;
	}
	
	public void setType(String type) { 
		this.type = type; 
	} 
	
	public String getType() { 
		return type;
	}
	
	public void setQuantity(int quantity) { 
		this.quantity = quantity;
	}
	
	public int getQuantity() { 
		return quantity;
	}

	
	
	//+ code 기준 equals(), hashCode() 재정의
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shoe other = (Shoe) obj;
		if (code != other.code)
			return false;
		return true;
	}
	
	//+ toString() 재정의 

	@Override
	public String toString() {
		return "Shoe [code=" + code + ", name=" + name + ", size=" + size + ", price=" + price + ", type=" + type
				+ ", quantity=" + quantity + "]";
	}
	
	
	
}




