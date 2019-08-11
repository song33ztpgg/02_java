package book.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import book.exception.DuplicateException;
import book.vo.Book;
import book.vo.Price;

/**
 * Book 여러개가 꼽혀있어 
 * 책 객체 여러개를 한번에 저장하고
 * 관리 할 수 있는 클라스
 * 
 *  ======================================================
 * 1. 캡슐화 적용 : 맴버변수는 private
 * 					생성자, 메소드 public
 *   ======================================================
 * 
 * @author Administrator
 *
 */
public class ArrayBookShelf implements BookShelf{
	
	// 맴버변수
	private Book[] books;
	
	public ArrayBookShelf(){
		books = new Book[0];
	}
	public ArrayBookShelf(Book[] books){
		this.books=books;
	}
	
	// 책장에 책을 추가 : add : void : 매개변수로 Book 1개를 받는다.
	/**
	 * 1. 리턴을 int 타입으로 추가 성공한 건수를 리턴
	 * 
	 * 2. 매개변수로 입력된 book 객체가 
	 * 	  이미 목록에 존재하는지 여부를 
	 * 
	 * 	  isExists(book) 메소드를 사용하여 판단하고
	 * 	  isExists(book) 의 결과가 false 일 때만
	 * 	  현재의 추가로직이 작동하도록 변경
	 * 
	 * @param book 
	 * @return 0 : 이미 같은 seq 번호의 책이 있어서 추가  실패
	 * 		   1 : 새 책 정보 1건이 성공적으로 추가된 경우
	 * @throws DuplicateException 
	 */
	public int add(Book book) throws DuplicateException {
		int addCount  = 0;
		
		// 3. 로직 전개
		// 추가하려는 책이 존재하는지 판단
		if (!isExists(book)) {
		
			// 이미 존재하는 배열 + 1 크기로 복사
			this.books = Arrays.copyOf(books, books.length + 1 );
		
			// 1 늘어난 배열 마지막 자리에 새 book 
			// (매개변수로 넘어온 것) 저장
			this.books[books.length - 1] = book;
		
			addCount++;
		}else {
			throw new DuplicateException("add", book);
		}
		
		// 2. 리턴 값 저장 변수 리턴 구문
		return addCount;
		
	}
//		// 현재 books 보다 길이가 1큰 배열을 새로 만든다.
//		// newBooks
//		if(isExists(book)) {
//		    return 0;
//		} else {
//		
//			Book[] newBooks = new Book[books.length + 1];
//			
//			// books의 모든 책 내용을 새로 생성한 1칸 큰 배열에 
//			// 앞쪽부터 복사
//			for(int i = 0 ; i < books.length ; i++) {
//				newBooks[i] = books[i];
//				
//			}
//			// 매개변수로 넘겨진 book은 마지막 새로 생긴 칸에 저장
//			newBooks[newBooks.length - 1] = book;
//			
//			this.books = newBooks;
//			return 1;
//		}
	
	// 책장에서 책을 제거 : void : remove(Book book)
	/**
	 * 삭제하기 전에 목록에 book객체가 존자하는지 먼저
	 * isExists(book) 으로 판단
	 * 
	 * 결과가 true 일 때만 삭제로직 진행 	1 리턴
	 * 결과가 false 이면 삭제로직 진행 없이 0 리턴
	 * @param book
	 */
	public int remove(Book book) {
		// book 객체의 sequence 가 같으면 같은 책으로 판단해서
		// 삭제
		// 폐기 안하고 남는 책을 유지할 새 배열
		if (isExists(book)) {
			
			Book[] newBooks;
			
			// 1. 폐기할 책이 위치하는 인덱스를 찾기
			int index = findBookIndex(book);
			// 2. 폐기할 책의 인덱스가 -1 보다 크렴
			// 	  폐기할 책이 있다는 의미로 판단하고 삭제로직 진입
			if (index > -1) {
				// 3. 폐기 안할 책을 유지할 새 벼열을 기금 배열 -1 크기로 생성
				newBooks = new Book[books.length -1];
				
				// 4. 폐기할 인덱스가 배열 중간일 때
				if (index < books.length -1) {
					// (1) 삭제할 책 앞쪽의 책정보는 같은 인덱스로 복사
					for(int idx = 0; idx < index; idx++) {
						newBooks[idx] = books[idx];
					}
					// (2) 삭제할 책 뒤쪽의 남는 책 정보는 현재 안덱스 -1 위치로 복사
					for(int idx = 0; idx < newBooks.length; idx++) {
						newBooks[idx] = books[idx + 1];
					}
					
				}else {
					// 5. 폐기할 인덱스가 배열 끝일 때
					//    폐기할 책 인덱스 앞쪽까지만 새 배열에 복사
					for(int idx = 0; idx < books.length -1; idx++) {
						newBooks[idx] = books[idx];
						
					}
					
				}
				// 6. 남는 책이 복사된 새 배열을 
				// 	  this.book 에 새로 저장
				this.books = newBooks;
					
			}  // end outer if
			return 1;
		}else {
			return 0;
		}
	}
	
	// 책 정보 수정
	/**
	 * 수정하기 전에 수정할 book 객체가 
	 * 목록에 이미 존재하는지 여부를 
	 * isExists(book) 수행 결과로 판단해서
	 * 
	 * ture 이면 수정하고 		   1 리턴
	 * false 이면 수정진행하지 않고 0리턴
	 * @param book
	 */
	public int set(Book book) {
		// 수정할 book 이 books 배열 몇번째 인덱스에 있는지 찾는 메소드
		if(isExists(book)) {
			int index = findBookIndex(book);
			if (index > -1) {
				books[index] = book;
			}
			return 1;
		}else {
			return 0;
		}
	}
	
	// 책 한권 얻기 : Book : get(Book book)
	
	public Book get(Book book) {
		// 입력된 book 의 sequence 값과 내부 배열에 저장된 
		// 책들 중 일치하는 sequence 를 가진 책 1권의 정보를 리턴
		return findBook(book);
	}
	
	public List<Book> getAllBooks() {
		// Arrays 클래스 안에 있는 static 메소드 사용하여 
		// Book[] 을 List<Book> 로 변경하여 리턴
		// 왜냐하면 BookShelf 인터페이스 구현으로 
		// 
		return Arrays.asList(this.books);
	}
	
	
	 /**
	  * 매개변수 전달된 책 정보와 일치하는 일련번호를 
	  * 가진 책(책 배열 : books)를 찾아서 배열 안에 들어있는 책을 리턴
	  * @param book
	  * @return
	  */
	private Book findBook(Book book) {
		Book findBook = null;
		for(int idx = 0; idx < books.length; idx++) {
			if (books[idx].equals(book)) {
				// 같은 책 찾았다.
				findBook = books[idx];
				break;
			}
		}
		return findBook;
	}
	/**
	 * 같은 책을 찾는 로직을 
	 * sequence값을 직접 비교해서
	 * book 객체 비교로 변경
	 * @param book
	 * @return
	 */
	private int findBookIndex(Book book) {
		int index = -1;
		for(int idx = 0; idx < books.length; idx++) {
			if (books[idx].equals(book)) {
				// 같은 책 찾았다.
				index = idx;
				break;
			}
		}
		return index;
	}
	// 전체 책 목록을 얻기
	
	
	
	// 접근자 
	public Book[] getBooks() {
		return books;
	}
	// 수정자
	public void setBooks(Book[] book) {
		this.books = book;
	}
	
	/**
	 * 매개변수로 전달된 book(책)이 
	 * 목록(배열) 에 존재하는지 여부를
	 * 검색해서 존재하면 ture
	 * 존재하지 않으며 false
	 * 를 리턴하는 private 메소드
	 * 
	 * @param book
	 * @return ture : 찾는 책이 목록에 존재
	 * 		   false : 찾는 책이 목록에 존재 않암
	 */
	private boolean isExists(Book book) {
		// 리턴 값이 있는 메소드의 경우
		// 리턴 값을 저장할 변수를 선언, 초기화
		boolean result = false;
		for(Book findbook : books) {
			if(findbook.equals(book)) {
//		for(int i = 0 ; i < books.length; i++) {
//			if(books[i].equals(book)) {
				result = true;
				break;
			}	
		}
		return result;

	}
	@Override
	public List<Book> getBooksByTitle(String title) {
		List<Book> books = new ArrayList<>();
		
		for (Book book: this.books) {
			// 매개변수로 입력된 title 이 this.books 배열에 들어있는 각 
			// Book 객체의 제목에 포함(contains() ) 되어 있으면
			if (book.getTitle().contains(title)) {
				books.add(book);
			}
		}
		return books;
	}
	@Override
	public List<Book> getBooksByPrice(int min, int max) {
		List<Book> books = new ArrayList<>();
		
		for (Book book: this.books) {
			// this.books 배열에있는 각 Book 객체의 가격이
			// min보다 크거나 같고, max 보다 작거나 같은 조건을 동시에 만족시키면
			if (book.getPrice() >= min && book.getPrice() <= max) {
				books.add(book);
			}
		}
		
		return books;
	}
	@Override
	public List<Book> getBooksByPrice(Price price) {
		List<Book> books = new ArrayList<>();
		
		for (Book book: this.books) {
			// this.books 배열에있는 각 Book 객체의 가격이
			// price 객체의 min보다 크거나 같고, 
			// price 객체의 max 보다 작거나 같은 조건을 동시에 만족시키면
			if (book.getPrice() >= price.getMin() && book.getPrice() <= price.getMax()) {
				books.add(book);
			}
		}
		
		return books;
	}
}
