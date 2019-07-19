package books;

/**
 * 서점에서 할 수 있는 여러 기능들 
 * 책찾기, 책 수정 , 신간추간, 책 폐기 기능 테스트 
 * */

public class BookStoreTest {

	public static void main(String[] args) {
 
		Book[] books = new Book[0];
		BookShelf bookShelf = new BookShelf(books); 
		BookManager manager = new BookManager(bookShelf);  
		BookStore kyobo = new BookStore(manager); 
	
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■		
	
	   Book vegetrian = new Book(1, "9788936433598", 10000);
	   Book littlePrins = new Book(2, "9788932917245", 8820);
	   Book noDaap = new Book(3, "9791190182645", 10800);
	   Book dduk = new Book(4, "9791196394509", 12420);
	   Book ax = new Book(5, "9788956055466", 14400);
		   
	   kyobo.add(vegetrian);
	   kyobo.add(littlePrins); 
	   kyobo.add(noDaap); 
	   kyobo.add(dduk); 
	   kyobo.add(ax);
		
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	   
	   Book[] allBooks = kyobo.getAllBooks();
		for (Book book: allBooks) {
			book.print();
		}
	   
	   
	   
	   
//		// 매니저에게 전달할 newbook 
//		Book[] books = new Book[0];
//		
//		//2.BookShelf[] 책장을 만든다. 
//		BookShelf bookShelf = new BookShelf(books); 
//		
//		//3.BookShelf[] 관리할 매니저 고용  
//		BookManager manager = new BookManager(bookShelf); 
//		
//		//4.서점오픈 
//		BookStore kyobo = new BookStore(manager); 
	   		
	}

}
