package books;


public class Book{
	
	int sequence;
	String isbn;
	int price;
	
	
	Book() {
		System.out.println("Book 부분");
	}
	
	Book(int sequence) {
		this(); 
		this.sequence = sequence;
	}
	
	Book(int sequence, String isbn){ 
		this(sequence); 
		this.isbn = isbn;
	}
	
	Book(int sequence, String isbn,int price){ 
		this(sequence,isbn); 
		this.price = price;
		
	}

//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■//

	public int getSequence() {
		return sequence; 
		
	}
	
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	
	}


	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■//
//	
//	public int getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
////	

	
	public void print() {
		String message = "책 정보[일련번호:%d, ISBN:%s, 가격:%d]%n";
		
		System.out.printf(message, sequence, isbn, price);
		
	}	
}