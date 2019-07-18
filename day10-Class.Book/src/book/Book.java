package book;

/*
 * 책 한권의 정보를 담는 클래스
 * --------------------------
 * 
 * 일련번호  : sequence  : int 
 * ISBN		 : isbn 	 : String 
 * 제목 	 : title     : String 
 * 저자		 : author    : String 
 * 출판사 	 : company   : String 
 * 페이지 수 : totalPage : int 
 * 가격 	 : price 	 : int  
 * 재고수량  : quantitiy : int 
 * --------------------------
 */

/**
 * 생성자 중복정의 (기본 생성자, 명시 , 매개변수 생성자 중복정의) 
 * 메소드 : 
 * print() 			 : 책의 정보를 출력하는 메소드 
 * buy(int amount)   : 책의 재고를 +amount만큼 늘리는 메소드 
 * sell(int amount)  : amount 만큼 책의 재고를 줄이는 메소드 
 * 
 * 각필드를 설정하는 메소드 (Java Beans) 규격에 의한 
 * 접근자(getter)/수정자(setter) 메소드 
 * 
 *getter 작성시 매소드 이름 규격 
 *=> get으로 시작하고 맴버변수 필드의 첫 글자를 대문자로 조합  
 *	 리턴값이 해당 맴버 변수 필드의 타입과 맞춤
 *
 *예)sequence 필드의 getter 는 다음의 규격을 갖는다 
 *int getSequnce() { return this.requence}
 * 
 * setter 작성시 매소드 이름 규격 
 * =>set으로 시작하고 멤버변수 필드의 첫 글자를 대문자로 조합 
 * 	매개변수를 해당 맴버 변수 필드와 같은 타인봐 변수로 받는다 
 *   리턴값이 없다
 * 예) void setSequence(int sequence) { 
 * 	    this.sequcene = sequence;
 * } 
 * 
 * 만약 멤버 변수 필드가 boolean 타입이라면 getter 이름의 시작은 
 * is로 시작한다
 * 
 * 
 * 
 * */ 

public class Book {

	int sequence;
	String isbn; 	 
	String title;
	String author; 
	String company;
	int totalPage;
	int price;
	int quantitiy;
	
	
	Book() { 
	} 
	
	Book(int sequence) { 
		this();  
		this isbn = isbn; 
	} 
	
	Book(int squence, )
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ //
	//sequence 맴버 변수의 getter
	public int getSequence() { 
		return sequence;
	} 

	//sequence의 setter
	public void setSequence(int sequence) { 
		this.sequence = sequence;
	} 
//===============================================//
	public String getIsbn() { 
		return isbn;
	} 
	
	public void setIsbn(String isbn) { 
		this.isbn = isbn;
	}
//===============================================//
	public String getTitle() { 
		return title;
	} 
	
	public void setTitle(String title) { 
		this.title = title;
	}
//===============================================//
	public String getAuthor() { 
		return author;
	} 
	
	public void setAuthor(String author) { 
		this.author = author;
	}
//===============================================//
	public String getCompany() { 
		return author;
	} 
	
	public void setCompany(String company) { 
		this.company = company;
	}
//===============================================//
	public int getTotalPage() { 
		return totalPage;
	} 
	
	public void setTotalPage(int totalPage) { 
		this.totalPage = totalPage;
	}
//===============================================//
	public int getPrice() { 
		return price;
	} 
	
	public void setPrice(int price) { 
		this.price = price;
	}
//===============================================//
	public int getQuantitiy() { 
		return quantitiy;
	} 
	
	public void setQuantitiy(int quantitiy) { 
		this.quantitiy = quantitiy;
	}

//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ //	
	
	
	
	public void  print() { 
		// 책의 정보를 출력하는 메소드 
		System.out.printf("%d",);
		
		System.out.printf("%s",);
		
		
		
		int sequence;  
		String isbn; 	
		String title;  
		String author; 
		String company;
		int totalPage; 
		int price;     
		int quantitiy; 
	
	} 


	public void buy(int amount) { 
 
	}
	public void sell(int amount) { 
 
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
}
