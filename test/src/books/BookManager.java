package books;
/**
 * 책장(BookShelf)을 사용하는 북 매니저 클래스 
 * 전체조건 :매니저는 책장이 어디있는지 무엇인지 알고 있다
 **/

public class BookManager {
	
	BookShelf bookShelf; 
	
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■	
 	
	BookManager(){
	    bookShelf = new BookShelf(); 
	}  
	
	BookManager(BookShelf bookShelf){
		this.bookShelf = bookShelf;
		
	}
	
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■	 

	public void  add(Book book) { 
		this.bookShelf.add(book);
		System.out.println("10.매니저 add"); ///★★★★★★★★★★★★★★★★★★★★★★★★★★
	} 
	
	public void remove(Book book) { 
		this.bookShelf.remove(book);
	} 
	
	 public Book get(Book book) {
		 return this.bookShelf.get(book);
	 }
	
	 public void set(Book book) { 
		 this.bookShelf.set(book);
	 }
	
	 public Book[] getAllBooks() { 
		 return bookShelf.getAllBooks();
	 }	
}
