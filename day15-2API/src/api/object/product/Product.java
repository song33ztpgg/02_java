package api.object.product;
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
	private String pcode;  //변경되지 않는 값으로 설정
	private String pname; 
	private int price; 
	private int quantity;
	
	
	
	
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
		System.out.printf("제품 코드 : %5s , 제품이름 : %5s , 가격 : %5d 제고 : %2d%n",pcode,pname, price, quantity);
	} 
	
	//toString() : String 
	public String toString() {
		return String.format("제품 코드 : %5s , 제품이름 : %5s , 가격 : %5d 제고 : %2d",pcode,pname, price, quantity);
	}

	//입력된 값만큼  % 할인
	public int discount(double percentage) { 
		double total = (double)price * (1.0 - percentage);
		return (int)total;
	} 
	
	//출고되어 재고수량(quantity)이 amount 만큼 줄어들도록 반영
	public void sell(int amount) {
		
		
		if(amount  > quantity) { 
			System.out.println("판매수량이 재고보다 큽니다");
		}
		
		if(quantity < 1 ) { 
			System.out.println("제고가 없습니다");
		}  
		
		quantity = quantity - amount;
		System.out.printf("판매되었습니다. 재고 : %d %n",quantity);
		
	
	} 
	
	
	/*
	 * 캡슐화를 적용하여 멤버변수 필드의 가시성이 private으로 
	 * 조정이 되면 다른 모든 클래스에서 접급이 불가능해진다.
	 * 
	 * 따라서 숨겨진 필드에 접근할 수 있는 전용 메소드 싸ㅇ을 
	 * 정의해야 한다 - > 접근자/ 수정자 메소드 
	 * -------------------------------------------------------- 
	 * 접근자 메소드 : getter 
	 * 1.get으로 시작 
	 * 2.get뒤에 이름은 접근하려는 멤버변수 이름의 
	 * 	 첫 글자만 대문자로 하는 낙타표기법 적용 
	 * 3.메소드 매개변수는 없어야 한다. 
	 * 4.매소드 리턴타입은 접근하려는 멤버변수의 타입과 맞춘다 
	 * 5.멤버변수 타입이 boolean 인 경우 
	 * 	 get 이 아니라 is로 시작하도록 작성 
	 * 6.get~~(), is~~~() 형태로 정의 
	 * 
	 * 수정자 메소드 :setter 
	 * 
	 *1.set으로 시작 
	 *2.set뒤에 오는 이름은 수정하려는 멤버변수 이름의 
	 *	첫 글자만 대문자로 하는 낙타표기법 적용 
	 *3. 메소드 매개변수는 수정하려는 멤버변수 타입과 맞추고 
	 *	 보통 수정하려는 멤버변수 이름과 같게 설정 
	 *4. 리턴타입은 void  
	 *5. 보통 안쪽의 로직은 
	 *	this.멤버변수  = 매개변수; 로 작성
	 * 
	 * */
	//수정자 메소드 선언 
	public void setPcode(String pcode) { 
		this.pcode = pcode;
	}
	
	public void setPname(String pname) { 
		this.pname = pname;
	}
	
	public void setPrice(int price) { 
		this.price = price;
	}
 
	public void setQuantity(int quantity) { 
		this.quantity = quantity;
	}
	
	public String getPcode() { 
		return pcode;
	}
	
	public String getPname() { 
		return pname;
	}
	
	public int getPrice() { 
		return price;
	}
	
	public int getQuantity() { 
		return quantity;
	}
	
	
	
	public void buy(int amount) {
		quantity += amount; 
		System.out.printf("%d 추가하였습니다 . 재고 : %d%n",amount , quantity);
	}
//////////////////////////////////////////////////////////////////////////////////
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pcode == null) ? 0 : pcode.hashCode());
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
		Product other = (Product) obj;
		if (pcode == null) {
			if (other.pcode != null)
				return false;
		} else if (!pcode.equals(other.pcode))
			return false;
		return true;
	} 
//////////////////////////////////////////////////////////////////////////////
	
	
	
	
//	//equals() : 객체 내용비교 메소드 작성 
//	//=> pcode 가 같으면 동일 객체로 판단 
//	@Override 
//	public boolean equals(Object object) { 
//		//1. 동일 비교 연산 결과 저장할 변수 선언 
//		//2. 기본 false 로 초기화 
//		boolean isEqual = false;  
//		//3. 사용  
//		//3.1 매개변수로 넘겨진 object가 Product 
//		if(object instanceof Product) { 
//			// 3.2 비교대상인 this 객체와 
//			//		매개변수의 object 의 pcode 필드 값을 비교 
//			Product product = (Product)object; 
//			
//			if( this.pcode.equals(product.pcode)) { 
//				isEqual = true;
//			}	
//		}
//		return isEqual;
//	}
//	
//	@Override
//	public int hashCode() { 
//		/*
//		 * hash 알고리즘
//		 * -입력이 돌일하만 출력도 동일함을 보장하는 수학 알고리즘 
//		 * - 출력이 다르면 입력이 다르다는 결론 보장 
//		 * 1.비교하려는 필드가 참조형이면 그 클래스가 
//		 *   재정의해둔 hashCode()를 호출해서 비교 
//		 * 
//		 * 2. 비교하려는 필드가 기본형이면 
//		 *   기본형 데이터를 참조형으로 변경하는 포장 클래스
//		 *   객체로 변환후에 hashCode()fmf wjrdyd 
//		 *   
//		 * 3. 비교하려는 필드가 1개 이상이면 1,2,를 각 필드의 타입에 
//		 * 	  맞추어 적용하고 모든 필드의 결과를 XOR(^) 연산을 통과시켜 
//		 * 	  그 결과를 리턴한다
//		 *  
//		 * */ 
//		return this.pcode.hashCode(); 
//		//pcdoe 만 보기로 해서 가능 
//		
//		//만약 모든필드(이름, 가격, 재고)가 동일해야 할때  
//		//return pcode.hashCode()^pname.hashCode()^new Integer(price).hashCode()^new Integer(quantity).hashCode();	
//		
//	}
	
	
	
	
	
	
}
