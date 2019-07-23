package product;
/**
 * 전자제품을 판매하는 매장에서 
 * 관리하는 대상인  "제품"을 정의하는 클래스 
 * ---------------------------------------- 
 * 제품번혼 : pcode    : String : <= "P001" 
 * 제품 명  : pname    : String : <== 
 *  가  격  : price    : int  
 * 재고수량 : quantity : int
 * 
 *  각 필드 , 생성자 ,메소드에 설명을 주석으로 달아 놓을것
 * @author 304
 * */
public class Product {
	// 1. 매개 변수 선언 
	String pcode; 
	String pname; 
	int price; 
	int quantity;
	
	
	
	
	//2. 매개변수 받는 생성자 
	public Product() { 
		
	}
	
	public Product(String pcode) { 
		this(); 
		this.pcode = pcode;
	}
	
	public Product(String pcode, String pname) { 
		this(pcode); 
		this.pname = pname;
	}
	
	public Product(String pcode, String pname, int price) { 
		this(pcode, pname); 
		this.price = price;
	}
	
	public Product(String pcode, String pname, int price, int quantity) { 
		this(pcode, pname, price); 
		this.quantity = quantity;
	}
	
	//3.메소드  
	
	//제품의 상태를 출력
	public void print() {
		 
	} 
	
	//toString() : String 
	public String toString() {
		return String.format("제품 코드 : %5s , 제품이름 : %5s , 가격 : %5d 제고 : %2d",)
 
	}

	//입력된 값만큼  % 할인
	public int discount(double percentage) { 
	
	} 
	
	//출고되어 재고수량(quantity)이 amount 만큼 줄어들도록 반영
	public void sell() {
		
	} 
	
	
	//
	public void buy(int amount) {
		
	}
