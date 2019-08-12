package book;
/**
 * 책을 판매하는 서럼을 
 * 정의하는 클래스 
 * 
 * 서점에서 도서 판매를 위해서 최소 1명의 매니저는 있어야 한다 
 * 
 * 
 * 
 * */
public class BookStore {

	//1.맴버 변수 :북 매니저 
	private BookManager manager; 
	
	//2.생성자 
	
	public BookStore(){ 
		manager = new BookManager();
	} 
	
	public BookStore(BookManager manager){ 
		this.manager = manager;
	} 
	
	//3.매소드 선언 
	//3-1. 서점에 신가이 들어왔을때 
	//매니저에게 신간 정리(책장에 꼽는것 등을 부탁 
	
	public void add(Book book) { 
		manager.add(book);
	} 
	
	//3-2 서점에서 폐기할 도서가 생겼을때 매니저에게 폐기 부탁 
	public void remove(Book book) { 
		manager.remove(book);
	}

	//3-3. 서점에서 판매 도서의 가격등 변동이 있을 때 
	// 매니저에게 부탁해서 가격태그 등 책 정보 수정을 함 
	public void set(Book book) { 
		manager.set(book);
	}
	
	//3-4.서점에 온 고객이 책을 찾을때 매니저에게 찾아달라고 부탁함
	public void get(Book book) { 
		 manager.get(book);
	} 
	
	//3-5.우리 서점에 판매하는 모든 책 목록을 조회 
	public void getAllBooks() { 
		 manager.getAllBooks();
	}
	
	
	
	
	
	
	
	
	
	
}
