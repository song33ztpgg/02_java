package books;

import books.Book;

public class BookShelf {

	// 멤버변수
		Book[] books;
		
		BookShelf() {
			books = new Book[0];  
		}
		
		BookShelf(Book[] books) {
			this.books = books; 
		}
		
// ■■■■■책장에 책 추가■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■//

		public void add(Book book) {
			
			System.out.println("9. BookShelf add 실행"); 
			
			Book[] newBooks = new Book[books.length + 1];
			for (int idx = 0; idx < books.length; idx++) {
				newBooks[idx] = books[idx];
				}
			newBooks[newBooks.length - 1] = book;
			this.books = newBooks; 
			
			System.out.println("10. bookshelf 종료");
		}
		
		

//		public void add(Book 넘겨저온내용들) {
//			
//			Book[] 새로운배열 = new Book[books.length + 1];
//			
//			for (int idx = 0; idx < books.length; idx++) {
//				새로운배열[idx] = books[idx];
//				}
//			
//			새로운배열[새로운배열.length - 1] = 넘겨저온내용들;
//			this.books = 새로운배열; 
//			
//		}
		
// ■■■■■■■■책장에서 책을 제거 : void■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■//
	
		public void remove(Book book) {
	
		// 폐기 안하고 남는 책을 유지할 새 배열
			
		Book[] newBooks;					
		int index = findBookIndex(book);		
		if(index > -1) {
			newBooks = new Book[books.length -1]; 		
			if(index < books.length -1) { 
				for(int idx = 0 ; idx < index ;idx++) { 
					newBooks[idx] = books[idx];}
				for(int idx = 0 ; idx < newBooks.length ;idx++) { 
					newBooks[idx] = books[idx +1];}
			} else { 
				for(int idx = 0; idx < books.length; idx ++) 
				newBooks[idx] = books[idx];
			} 
			this.books = newBooks;
			}
		}
		

// ■■■■■■책정보 수정 (void)■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■//		
				
		
		public void set(Book book) {
			// 수정할 book 이 books 배열 
			// 몇번째 인덱스에 있는지 찾는다.
			int index = findBookIndex(book);
			if (index > -1) {
				books[index] = book;
			}
		}

// ■■■■■■책한권 정보 (get)■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■//		

		public Book get(Book book) {
			// 입력된 book의 sequence 값과
			// 내부 배열에 저장된 책들중 일치하는 sequence 를 가진
			// 책 1권의 정보를 리턴
			return findBook(book);
		}

// ■■■■■■ (get)■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■//
		
		/**
		 * 매개변수 전달된 책 정보와 
		 * 일치하는 일련번호를 가진 책(책 배열 : books에 있는 )을 찾아서 배열에 
		 * 안에 들어 있는 책을 리턴 
		 * 
		 * book(매개변수) = findbook(리턴) 
		 * 찾고싶은책   =  그 정보를 가지고 있는채 
		 * */
		private Book findBook(Book book) {
			Book findBook = null;
			for (int idx = 0; idx < books.length; idx++) {
				if (books[idx].getSequence() == book.getSequence()) {
					// 같은 책 찾았다.
					findBook = books[idx];
					break;
				}
			}
			return findBook;
		}
// ■■■■■■ (get)■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■//
		
		/**
		 * 책을 찾아달라고 할 때 책의 위치를 변환을 해준것
		 * 책의 정보를 준것이 X
		 * */
		
		private int findBookIndex(Book book) {
			int index = -1;
			for (int idx = 0; idx < books.length; idx++) {
				if (books[idx].getSequence() == book.getSequence()) {
					// 같은 책 찾았다.
					index = idx;
					break;
				}
			}
			return index;
		}
		
// ■■■■■■전체 목록 얻기 Book[]■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■//

		public Book[] getAllBooksTest(Book book) { 
			return this.books;
		}
		
		public Book[] getAllBooks() { 
			return this.books;
		}
		
		// 접근자
		public Book[] getBooks() {
			return books;
		}
		
		// 수정자
		public void setBooks(Book[] books) {
			this.books = books;
		}
		
}
