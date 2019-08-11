package book.test;

import static book.factory.BookFactory.buildBook;
import static book.factory.DaoFactory.getBookShelf;

import book.controller.BookManager;
import book.dao.BookShelf;
import book.vo.Book;
import book.vo.Price;
/**
 * 서점에서 할 수 있는 여러 기능들
 * 책찾기, 책 수정, 신간추가, 책 폐기 
 * 등의 기능을 테스트 하는 클라스
 * @author Administrator
 *
 */

public class BookStoreTest {
	
	public static void main(String[] args) {
		
		// 1. 메니저에게 전달할 책장 안에 들어갈 배열
//		Book[] books = new Book[0];
//		List<Book> books = new ArrayList<Book>();
//		Set<Book> books = new HashSet<>();
		
		// 2. 배열로 구성되는 책장을 만든다.
//		BookShelf bookShelf = getBookShelf("list");
//		BookShelf bookShelf = getBookShelf("map");
//		BookShelf bookShelf = getBookShelf(books);
//		BookShelf bookShelf = getBookShelf("jdbc");
		BookShelf bookShelf = getBookShelf("mybatis");
		
		// 3. 배열로 구성된 책장을 관리할 매니저를 고용
		BookManager manager = new BookManager(bookShelf);
		
		// 4. 책장을 관리할 매니저와 함께 서점을 오픈
		BookStore kyobo = new BookStore(manager);
		
		// ---------------------------------------------
		// 서점에 신간이 도착
		System.out.println(" 1. ===== 신간 도착 책 생성 ========");
		Book vegetrian = buildBook(1, "9788936433598", "채식주의자", "한강", "창비", 247, 10000, 10);
		Book littlePrins = buildBook(2, "9788932917245", "어린 왕자", "앙투안 드 생택쥐페리 ", "더 스토리", 150, 8820, 5);
		Book noDaap = buildBook(3, "9791190182645", "제 인생에 답이 없어요", "선바 ", "위즈덤 하우스", 192, 10800, 3);
		Book dduk = buildBook(4, "9791196394509", "죽고 싶지만 떡볶이는 먹고 싶어", "백세희", "혼", 208, 12420, 2);
		Book ax = buildBook(5, "9788956055466", "책은 도끼다", "박웅현", "북하우스", 348, 14400, 2);
		
		// 2. 서점에 도착한 신간 입고
		System.out.println(" 2. ===== 신간 입고 ========");
		kyobo.add(vegetrian);
		kyobo.add(littlePrins);
		kyobo.add(noDaap);
		kyobo.add(dduk);
		kyobo.add(ax);
		

		// 중복 데이터 입력 시도
		kyobo.add(ax);
		
		
		// 3. 입고된 신간들 모두 확인
		System.out.println(" 3. ===== 신간 확인 ========");
		kyobo.getAllBooks();
		
		
		
		// 4. 채식주의자 가격 할인 : set
		// (1) 가격 할인된 채식주의자 책 정보를 새로 설정
		System.out.println(" 4. ===== 체식주의자 정보 변경 ========");
		Book vegetrian2 = buildBook(1, "9788936433598", "채식주의", "한강",
				"창비", 247, 10000, 10);
		
		// (2) 변경된 책 정보를 담은 책 객체를 넘겨서 수정 처리
		kyobo.set(vegetrian2);
		
		// 5. 채식주의자 가격 할인 적용 결과 확인 : get
		// (1) 해당 책의 시퀀스 번호만 알면 조회 가능
		// 	   시퀀스 번호만 들어있는 Book 객체를 생성
		System.out.println(" 5. =====  정보 확인 ========");
		Book seqBook = buildBook(1);
		kyobo.get(seqBook);
		
		Book seqBook10 = buildBook(10);
		kyobo.get(seqBook10);
		
		// 6. 이 책은 도끼다 폐기 : remove
		// (1) 폐기할 책의 시퀀스 번호만 알면 폐기 가능
		// 	   시퀀스 번호만 들어있는 Book 객체를 설정
		System.out.println(" 6. ===== 책은 도끼다 삭제 ========");
		Book rmBook = buildBook(5);
		kyobo.remove(rmBook);
		
		Book reBook = buildBook(50);
		kyobo.remove(reBook);
		
		// 7. 폐기 확인을 위해 전체 목록 조회
		System.out.println(" 7. ===== 삭제 후 전체 목록 확인 ========");
		kyobo.getAllBooks();

		// 8. 제목 검색
		System.out.println("\n 8. ===== 제목에 '어' 자가 들어가는 책 목록 확인 =====");
		kyobo.getBooksByTitle("어");
		
		// 9. 가격 검색
		System.out.println("\n 9. ===== 가격이 10000 ~ 11000 사이인 책 목록 확인 =====");
		kyobo.getBooksByPrice(10000, 11000);
		
		// 10. 가격 검색
		System.out.println("\n 10. ===== 가격이 10000 ~ 11000 사이인 책 목록 확인 =====");
		Price price = new Price(10000, 11000);
		kyobo.getBooksByPrice(price);
		
		// 반복 실행을 위하여 마지막에 모두 삭제
		System.out.println("\n 11. ===== 1 ~ 4 번 책들 삭제 =====");
		Book rmBook1 = buildBook(1);
		kyobo.remove(rmBook1);
		Book rmBook2 = buildBook(2);
		kyobo.remove(rmBook2);
		Book rmBook3 = buildBook(3);
		kyobo.remove(rmBook3);
		Book rmBook4 = buildBook(4);
		kyobo.remove(rmBook4);
				
		
	}

	
}