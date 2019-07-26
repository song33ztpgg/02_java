package books;

/**
 * 서점에서 할 수 있는 여러 기능들 
 * 책찾기, 책 수정 , 신간추간, 책 폐기 기능 테스트 
 * */

public class BookStoreTest {

	public static void main(String[] args) {
		
		System.out.println("시작");
		Book[] books = new Book[0]; 
		
		BookShelf bookShelf = new BookShelf(books); 
		
		BookManager manager = new BookManager(bookShelf);  
		
		BookStore kyobo = new BookStore(manager); 
		
		System.out.println();
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■		
		System.out.println("4.시작2");
	   //Book vegetrian = new Book(1, "9788936433598", 10000);
		
		Book vegetrian = new Book(1, "9788936433598", 10000);
	    System.out.println(/*"8.내모 만듬"*/);
	  
	   
	   int num = 0;
	    
	   Book littlePrins = new Book(2, "9788932917245", 8820);
//	   Book noDaap = new Book(3, "9791190182645", 10800);

	   System.out.println();
	    System.out.println("9.추가");
	  
	    kyobo.add(vegetrian);

	   System.out.println("추가 끝");
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	   
	   
	   Book[] test = kyobo.getAllBooks(); 
	   
	   for (Book test2 : test) { 
		   test2.print();
	   }
	   
//	   Book[] allBooks = kyobo.getAllBooks();
//	   
//		for (Book book: allBooks) {
//			book.print();
//		}
//	   
//	   
//	   
//	   
//		// 매니저에게 전달할 newbook 
//		Book[] bookss = new Book[0];
//		
//		//2.BookShelf[] 책장을 만든다. 
//		BookShelf bookShelfs = new BookShelf(books); 
//		
//		//3.BookShelf[] 관리할 매니저 고용  
//		BookManager managers = new BookManager(bookShelf); 
//		
//		//4.서점오픈 
//		BookStore kyobos = new BookStore(manager); 
	   		
	}

}
