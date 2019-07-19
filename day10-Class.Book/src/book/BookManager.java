package book;
/**
 * 책장(BookShelf)을 사용하는 북 매니저 클래스 
 * 
 * 서점의 북 매니저 
 * -1.책을 책장에 꼽거나(추가하거나
 * -2.책장에서 찾아달라고 부탁받은 책을 가지고 오거나
 * -3.어떤 책의 수량이나 가격 정보를 수정하거나 
 * -4.더이상 판매 하지 않을 책을 폐기 
 * -5.이 서점에서 파는 책 목록 안내
 *  
 * 전체조건 :매니저는 책장이 어디있는지 무엇인지 알고 있다
 * 
 * 
 **/
public class BookManager {

	//1.맴버변수 선언
	BookShelf bookShelf; 
	
	//2.생성자 선언부 
	//2-1 기본생성자 
	
	BookManager(){
		//책장을 직접 만듬 
		//new - 직접만들겠다
		bookShelf = new BookShelf();
	}  
	
	BookManager(BookShelf bookShelf){
		//책장을 전달받고 우리껄로 만들어 사용할려고 하고 있다 
		//만든것을 사용하겠다.
		this.bookShelf = bookShelf;
	}
	
	//매소드 선언 
	
	//1.매니저는 책 한권을 책장에 가져가서 새로 꼽을수 있다
	
	
	public void  add(Book book) { 
		this.bookShelf.add(book);
	} 
	
	//2매니저는 책장에 가서 더 이상 찰지 않을 폐기할 책을 제거할수 잇다
	public void remove(Book book) { 
		this.bookShelf.remove(book);
	} 
	
	//3.책장에서 찾아달라고 고객이 요청한 책 한개를 가지고 올수 잇다. 
	
	 public Book get(Book book) {
		 return this.bookShelf.get(book);
	 }
	
	 
	 public void set(Book book) { 
		 this.bookShelf.set(book);
	 }
	
	 //판매되고 있는 책 목록을 보여줄수 잇다  
	 
	 public Book[] getAllBooks() { 
		 return bookShelf.getAllBooks();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
