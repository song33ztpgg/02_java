package book;

import book.Book;

public class BookShelf {

	// 멤버변수
		private Book[] books;
		
		public BookShelf() {
			books = new Book[0];
		}
		
		public BookShelf(Book[] books) {
			this.books = books;
		}
		
		// 책장에 책을 추가 : add : void : 매개변수로 Book 1개를 받는다.
		
		
		/**
		 * 리턴은 int 타입으로 추가 성공한 건수를 리턴 
		 * 매개변수로 입력된 book 객체가 이미 목록에 존재하는지 
		 * 
		 *  여부를 isExists(book) 메소드를 사용하여 판단하고 
		 *  isExists(book) 결과가 false 일때만 
		 *  현재의 추가로직이 작동하도록 변경
		 * 
		 * 0 : 이미 같은 seq번호 책이있어서 추가 실패 
		 * 1:  새책 정보 1건이 성족적으로 추가된 경우
		 * */
		public void add(Book book) {
			// 현재 books 보다 길이가 1큰 배열을 새로 만든다.
			// newBooks
			Book[] newBooks = new Book[books.length + 1];
			
			// books 의 모든 책 내용을 새로 생성한 1칸 큰 배열에
			// 앞쪽부터 복사
			for (int idx = 0; idx < books.length; idx++) {
				newBooks[idx] = books[idx];
			}
			
			// 매개변수로 넘겨진 book 은 마지막 새로 생긴 칸에 저장
			newBooks[newBooks.length - 1] = book;
			
			// 이 클래스의 books 멤버변수에 새로만든 newBooks 저장
			this.books = newBooks;
		}
		
		
		
		/**
		 * 삭제하기 전에 목록에 book 객체가 존재하는지 먼져 isExis판단 
		 * 
		 * 결과가 true 1 false 0
		 * */
		public void remove(Book book) {
					// book 객체의 sequence 가 같으면 같은 책으로 판단해서
					// 삭제
					// 폐기 안하고 남는 책을 유지할 새 배열
					Book[] newBooks;
					
					
					int index = findBookIndex(book);
					//폐기할 책이 위치하는 인덱스를 찾기
					if(index > -1) {
						newBooks = new Book[books.length -1]; 
						
						if(index < books.length -1) { 
							//패기할 책이 중간일때 
							// 패기 이전 위치 책
							for(int idx = 0 ; idx < index ;idx++) { 
								newBooks[idx] = books[idx];
							}
		
							for(int idx = 0 ; idx < newBooks.length ;idx++) { 
								newBooks[idx] = books[idx +1];
							}
							
							
						} else { 
							// 5. 폐기할 인덱스가 배열 끝일 때
							for(int idx = 0; idx < books.length; idx ++) 
							newBooks[idx] = books[idx];
						}
						
						// 6. 남는 책이 복사된 새 배열을
						//    this.book 에 새로 저장
						this.books = newBooks;
					}
				}
		
		
		
		
		
		///////////////////////////////////////////////////////		
		///////////////////////////////////////////////////////
		
		
		
		/**
		 * 수정하기 전에 수정할 book 객체가 
		 * 목록에 이미 존재하는지 여부를 isExists(book) 수행결과로 판단해서 
		 * true이면 수정하고 1리턴 
		 * false 이면 수정안하고 0
		 * 
		 * */
		
		// 책 정보 수정 : void : set(Book book)
		public void set(Book book) {
			// 수정할 book 이 books 배열 
			// 몇번째 인덱스에 있는지 찾는다.
			int index = findBookIndex(book);
			if (index > -1) {
				books[index] = book;
			}
		}
		
		/**
		 * 수정하기 전에 수정할 book 객체가 
		 * 목록에 이미 존재하는지 여부를 isExists(book) 수행결과로 판단해서 
		 * true이면 수정하고 1리턴 
		 * false 이면 수정안하고 0
		 * */
		// 책 한권 얻기 : Book : get(Book book)
		public Book get(Book book) {
			// 입력된 book의 sequence 값과
			// 내부 배열에 저장된 책들중 일치하는 sequence 를 가진
			// 책 1권의 정보를 리턴
			return findBook(book);
		}
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
		
		/**
		 * 책을 찾아달라고 할 때 책의 위치를 변환을 해준것
		 * 책의 정보를 준것이 X 
		 * 
		 * 같은 책을 찾는 로직을
		 
		 
		 
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
		

		// 전체 책 목록을 얻기
		public Book[] getAllBooksTest(Book book) { 
			
//			for(int idx = 0; idx < books.length ; idx++) { 
//				System.out.printf("%d %d");
//			}
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
		
		//------------------------------------------ 
		
		/**
		 * 매개변수로 전달된 book(책)이 
		 * 목록(배열)에 존재하는지 여부를 
		 * 검색해서 존재하면 true 존재하지 않으면 false를 
		 * 리턴하는 private 메소드
		 * 
		 * return true : 찾는 책이 목록에 존재 	o
		 * 		  false : 찾는 책이 목록에 존재  x  
		 * */
		private boolean isExisits(Book book) { 
			
		}
		
		
		
		
}
