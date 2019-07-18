package book;
/**
 * Book 여러개가 꼽혀있어 
 * 책 객체 여러개를 한번에 저장하고 관리 할 수 있는 클래스 
 * */
public class BookShelf {
	//맴버변수 
	Book[] books; 
	
	BookShelf(){ 
		books = new Book[0];
	} 
	
	BookShelf(Book[] books){ 
		this.books = books;
	}
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■//	
	//책장에 책을 추가  (add , void , 변수 Book)
	public void add(Book book) { 
		//현재 books보다 길이가 1큰 배열을 새로 만든다 
		Book[] newBooks = new Book[books.length + 1]; 
		
		// books의 모든 책 내용을 새로 생성한 1칸 큰 배열에 
		//앞쪽부터 복사  
		for(int idx = 0 ; idx < books.length ; idx++) { 
			newBooks[idx] = books[idx]; 
		} 
		
		//매개변수로 넘겨진 book은 마지막 새로 생긴 칸에 저장 
		newBooks[newBooks.length -1] = book;
		
		//이 클래스의 books맴버 변수에 새로 만든 newBooks저장
		this.books = newBooks;
	}
	
	//책장에서 책을 제거 
	public void remove(Book book) { 

		//패기할 책이 위치하는 인데스를 찾기 
		
		//페기랗 책의 인덱스가 -1보다 크면 패기할 책이 있다는 의미로 판단하고 삭제로직 진입
		
		//패기 안할 책의 유지할 새 배열을 -1 크기로 생성
		
		//패기할 인뎃그가 배열 중간일때 
		//1 삭제할 책 앞쪽의 책정보는 같은 인덱스로 복사 
		//2.삭제할 책 뒤쪽의 남는 책 정보는 현제 인덱스 -1 위치로 복사
		
		//패기할 인덱스가 배열 끝일때 그냥 패기할 책 인덱스 앞쪽꺼자먼 샤 배열에 복사 
		
		//남는 책이 볻사된 새 배열을 this.book에 저장
		
	}
	
	
	
	//책 한권 얻기 Book : get(Book book) 
	public Book get(Book book) { 
		//입력된 book의 sequence 값과 
		
		//내부 배열에 저장된 책들중 일치하는 sequence를 가진 
		
		//책 1권의 정보를 리턴
	}
	
	private Book findbook(Book book) {
		
		Book findBook = null;
		
		for(int idx = 0 ; idx < books.length ; idx++) {
			if(books[idx].getSequence() == book.getSequence()){ 
				findBook = books[idx]; 
				break;
			}
		}
		return findBook; 
	}
	
	
	
	private Book findbook(Book book) {
		
		Book findBook = null;
		
		for(int idx = 0 ; idx < books.length ; idx++) {
			if(books[idx].getSequence() == book.getSequence()){ 
				findBook = books[idx]; 
				break;
			}
		}
		return findBook; 
	}
	
	//전체 책 목록을 얻기 
	
	//책 정보 수정 
	public void set(Book book) { 
		//수정할 book이 books 배열 몇번째 인덱스에 있는지 찾는
		
		int index = findBookIndex(book); 
		
		if(index > -1) { 
			books[index] = book;
		}
	}
	
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■//	
	//접근자 
	public Book[] getBooks() { 
		return books;
	}  
	//수정자
	public void setBooks(Book[] books) { 
		this.books = books;
	}
	
	
	
	
	//수정자

}
