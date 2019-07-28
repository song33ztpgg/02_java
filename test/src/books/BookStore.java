package books;
/**
 * 책을 판매하는 서럼을 정의하는 클래스 
 * 서점에서 도서 판매를 위해서 최소 1명의 매니저는 있어야 한다 
 * */

public class BookStore {
	
	BookManager manager; 
	 	 
	
	BookStore(){ 
		manager = new BookManager();
	} 
	
	BookStore(BookManager manager){ 
		this.manager = manager;
	}
	
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■	 	
	
	public void add(Book book) { 
		System.out.printf("스토어 북 내용 = ");
		manager.add(book); 
		
		System.out.printf("스토어 북 내용 = ");
		System.out.println(book);///★★★★★★★★★★★★★★★★★★★★★★★★★★
	} 
	
	public void remove(Book book) { 
		manager.remove(book);
	}

	public void set(Book book) { 
		manager.set(book);
	}
	
	public Book get(Book book) { 
		return manager.get(book);
	} 
	
	public Book[] getAllBooks() { 
		return manager.getAllBooks();
	}
}
