package book.controller;

import book.dao.ArrayBookShelf;

import book.dao.BookShelf;
import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.view.ListResp;
import book.view.MessageResp;
import book.view.Response;
import book.view.SingleResp;
import book.vo.Book;
import book.vo.Price;

import static book.factory.RespFactory.getResp;
/**
 * 책장(BookShelf)을 사용하는 북 매니저를 나타내는 클래스
 * ------------------------------------------------------
 * 서점의 북 매니저는 
 * 
 * 1. 책을 책장에 꼽거나(추가하거나)
 * 2. 책장에서 찾아달라고 부탁받은 책을 가지고 오거나
 * 3. 어떤 책의 수량이나 가격정보를 수정하거나 
 * 4. 더 이상 판매하지 않을 책을 폐기 하고
 * 5. 이 서점에서 파는 책 목록을 안내
 * 
 * 하는 등에 작업을 진행합니다.
 * --------------------------------------------------------
 * 전제조건 : 북 메니저는 책장이 어디있는지, 무었인지 알고 있어야 한다.
 *   ======================================================
 * 1. 캡슐화 적용 : 맴버변수는 private
 * 					생성자, 메소드 public
 *   ======================================================
 * @author Administrator
 *
 */
public class BookManager {
	// 1. 맴버변수 선언부
	private BookShelf bookShelf;
	// 메니저가 어떤 작엡 후에 어떻게 응답해야 할 지를 나타내는 타입
	private Response response;
	// 2. 생성자 선언부
	// (1) 기본 생성자 명시
	public BookManager(){
		bookShelf = new ArrayBookShelf();
	}
	// (2) 매개변수 생성자 작성
	public BookManager(BookShelf bookShelf){
		this.bookShelf = bookShelf;
	}
	
	// 3. 메소드 선언
	// (1) 매니저는 책 한권을 책장에 가져가서 새로 꼽을 수 있다.
	public void add(Book book) {
		int addCnt;
		String message = null;
		
		try {
			addCnt = this.bookShelf.add(book);
			message = String.format(book.toString() + "%d 건이 추가되었습니다." ,addCnt);
			
		} catch (DuplicateException e) {
			message = e.getMessage();
			// catch 블록을 작성할 때
			// 일반적으로 e.printStackTrace() 를 적는 것이 관꼐이나
			// 보안상의 이유로 프로그램을 출시할 때는
			// 제거하도록 권고받는 코드이다.
			
			
			e.printStackTrace();
			
		}finally {
			response = getResp("massage");
			
			if(response != null)
			response.response(message);
		}
		
	}
	
	// (2) 매니저는 책장에 가서 더 이상 팔지 않을
	// 폐기할 책을 제거할 수 있다. 
	public void remove(Book book) {
		int rmCnt;
		String message = null;
		try {
			rmCnt = this.bookShelf.remove(book);
			message = String.format(book.toString() 
					+ "%d 건이 삭제되었습니다.", rmCnt);
		
		} catch (NotFoundException e) {
			message = e.getMessage();
			e.printStackTrace();
		
		} finally {
			response =getResp("massage");
			
			if(response != null) {
				response =getResp("massage");		
			}
		}
	}
	
	// (3) 매니저는 책장에서 찾아달라고 고객이 요청한
	//     책 한개를 가지고 올 수 있다.
	public void get(Book book) {
		Book findBook;
		try {
			findBook = this.bookShelf.get(book);
			response = getResp("Single");
			
			if(response != null)
				response.response(findBook);
			
		} catch (NotFoundException e) {
			response = getResp("massage");
			
			if(response != null) {
				response.response(e.getMessage());
			}
			
			e.printStackTrace();
		}
	}
	
	// (4) 매니저는 책장에 가서 판매 가격 등 
	//	   책의 정보를 수정할 수 있다.
	public void set(Book book) {
		int setCnt;
		String message = null;
		
		try {
			setCnt = this.bookShelf.set(book);
			message = String.format(book.toString() 
					+ " %d 건을 수정하였습니다.", setCnt);
		
		} catch (NotFoundException e) {
			message = e.getMessage();
			e.printStackTrace();

		}finally {
			response =getResp("massage");
			
			if(response != null)
				response.response(message);
		}
		
	}
	
	// (5) 매니저는 서점에서 판매되고 있는 책의 목록을
	//	   보여줄 수 있다. 조회할 수 있다.
	public void getAllBooks() {
		response = new ListResp();
		
		if (response != null)
			response.response(bookShelf.getAllBooks());
	}
	
	public void getBooksByTitle(String title) {
		response = getResp("list");
		
		if (response != null)
			response.response(bookShelf.getBooksByTitle(title));
	}
	
	public void getBooksByPrice(int min, int max) {
		response = getResp("list");
		
		if (response != null)
			response.response(bookShelf.getBooksByPrice(min, max));
	}
	
	public void getBooksByPrice(Price price) {
		response = getResp("list");
		
		if (response != null)
			response.response(bookShelf.getBooksByPrice(price));
	}
}
