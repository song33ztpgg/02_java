package clothing;

public class Hat {

	//맴버 변수
	private String hatId; 
	private String type;
	private String material;
	private double size; 
	private String color; 
	private double price; 
	private int quantity ; 
	private char gender; 
	
	//생성자
	public Hat() { 
		
	}
	
	public Hat(String hatId) { 
		this();
		this.hatId = hatId;
	} 
	
	public Hat(String hatId, String type) { 
		this(hatId); 
		this.type = type;
	}
	
	public Hat(String hatId, String type, String material) { 
		this(hatId, type); 
		this.material = material;
	}
	public Hat(String hatId , String type, String material, double size) { 
		this(hatId, type, material); 
		this.size = size;
	}
	public Hat(String hatId, String type, String material, double size, String color) { 
		this(hatId, type, material, size); 
		this.color = color;
	}
	public Hat(String hatId, String type, String material, double size, String color, double price) { 
		this(hatId, type, material, size, color); 
		this.price = price;
	}
	public Hat(String hatId, String type, String material, double size, String color, double price ,int quantity) { 
		this(hatId, type, material, size, color, price); 
		this.quantity = quantity;
	}
	
	public Hat(String hatId, String type, String material, double size, String color, double price ,int quantity, char gender) { 
		this(hatId, type, material, size, color, price, quantity); 
		this.gender = gender;
	}
	
	/**
	 1. public double discount(int amount) :      
	 amount 만큼 할인한 가격을 리턴.
     원래 가격보다 큰 값 할인은 불가능하도록 설정.
    할인가가 원래 제품가격보다 크면 "제품 가격보다 크게 할인할 수 없습니다." 내용 출력
	 * @param amount
	 * @return
	 */
	public double discount(int amount) { 
		double result = 0; 
		
		if(price < amount) { 
			System.out.println("제품 가격보다 크게 할인할 수 없습니다");
		} else { 
			result = price - amount;
		}
		
		return result;
	}
	
//	//2. public void dye(String color) : 모자 색상을 입력된 color 로 염색하여 색상을 변경
//	public void dye(String color) { 
//		this.color  = color;
//	}

//	 다른방법으로 해결
	public void dye(String color) { 
		setColor(color);
	}
	

	
	
	
	//  3. public int sell(int amount) : amount 만큼 판매(재고를 줄임). 원래 수량보다 많이 판매 불가
	public int sell(int amount) { 
		
		int outPutQuantity = 0; 
		
		if(amount > quantity) { 
			System.out.println("판매가 불가합니다");
		} else { 
			outPutQuantity =  quantity - amount;
		}
		
		return outPutQuantity;
	}
	
	//  4. public int buy(int amount) : amount 만큼 구매(재고를 늘림)
	public int buy(int amount) { 
		quantity += amount;
		return quantity; 
	}
	
	 //  5. 각 필드에 대한 접근자/수정자 정의
	public void setHatId(String hatId) { 
		this.hatId = hatId;  
	}
	
	public void setType(String type) { 
		this.type = type;
	}
	
	public void setMaterial(String material ) { 
		this.material = material;
	}
	
	public void setSize(double size) { 
		this.size = size;
	}
	
	public void setColor(String color) { 
		this.color = color;
	}
	 
	public void setPrice(double price ) { 
		this.price = price;
	}
	
	public void setQuantitym(int quantity) { 
		this.quantity = quantity; 
	}
	
	public void setGender(char gender) { 
		this.gender = gender;
	}
	
////////////////
	public String getHatId() { 
		return hatId;  
	}
	
	public String getType() { 
		return type;
	}
	
	public String getMaterial() { 
		return material;
	}
	
	public double getSize() { 
		return size;
	}
	
	public String getColor() { 
		return color;
	}
	 
	public double getPrice() { 
		return price;
	}
	
	public int getQuantitym() { 
		return quantity; 
	}
	
	public char getGender() { 
		return gender;
	}


	

	 //  6. hatId  기준으로 equals(), hashCode() 재정의
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hatId == null) ? 0 : hatId.hashCode());
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
		Hat other = (Hat) obj;
		if (hatId == null) {
			if (other.hatId != null)
				return false;
		} else if (!hatId.equals(other.hatId))
			return false;
		return true;
	}


	
	 //  7. toString() 재정의
	@Override
	public String toString() {
		return "Hat [hatId=" + hatId + ", type=" + type + ", material=" + material + ", size=" + size + ", color="
				+ color + ", price=" + price + ", quantity=" + quantity + ", gender=" + gender + "]";
	}
	
}
