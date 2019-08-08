package book.test;



import book.Book;
import book.BookManager;
import book.BookShelf;
import book.BookStore;

/**
 * 서점에서 할 수 있는 여러 기능들 
 * 책찾기, 책 수정 , 신간추간, 책 폐기 기능 테스트 
 * */

public class BookStoreTest {

	public static void main(String[] args) {
 		// 매니저에게 전달할 책장안에 들어갈 배열
		Book[] books = new Book[0];
		
		//2.배열로 구성되는 책장을 만든다. 
		BookShelf bookShelf = new BookShelf(books); 
		
		//3.배열로 구성괸 책장을 관리할 매니저를 고용 
		BookManager manager = new BookManager(bookShelf); 
		
		//4.서점오픈 
		BookStore kyobo = new BookStore(manager); 
		
		//---------------------------------------------- 
		//1. 서점에 신간이 도착 
		
		System.out.println("========1 : 책이 도착==========================");
	   Book vegetrian = new Book(1, "9788936433598", "채식주의자", "한강", "창비", 247, 10000, 10);
	   Book littlePrins = new Book(2, "9788932917245", "어린 왕자", "앙투안 드 생택쥐페리 ", "더 스토리", 150, 8820, 5);
	   Book noDaap = new Book(3, "9791190182645", "제 인생에 답이 없어요", "선바 ", "위즈덤 하우스", 192, 10800, 3);
	   Book dduk = new Book(4, "9791196394509", "죽고 싶지만 떡볶이는 먹고 싶어", "백세희", "혼", 208, 12420, 2);
	   Book ax = new Book(5, "9788956055466", "책은 도끼다", "박웅현", "북하우스", 348, 14400, 2);
		
		
		//2 서점에 도착한 신간 입고 
	   
	   System.out.println("========2 : 신간입고==========================");
	   kyobo.add(vegetrian);
	   kyobo.add(littlePrins); 
	   kyobo.add(noDaap); 
	   kyobo.add(dduk); 
	   kyobo.add(ax);
		
	   //3.입고된 신간들 모두 확인 
	   System.out.println("========3 : 신간확인==========================");
	   Book[] allBooks = kyobo.getAllBooks();
		for (Book book: allBooks) {
			book.print();
		}
	   
		//4.채식주의자 할인 
		//왜 가격만 수정하면 되는대 전체수정하나 
		// 매니저 클래스에서 매니저에게 전체 정보를 가져오라고 선언하고 있다
		System.out.println("========4 : 채식주의자 할인==========================");
		//4-1) 가격할인된 채식주의자 책 정보를 새로 생성
		Book vegetrian2 = new Book(1, "9788936433598", "채식주의자", "한강", "창비", 247, 10000, 7);
		
		//새로운 책정보가 담긴 책 -> 매니저에게 넘겨짐 -> 책장에서 set 확인 -> 책장에서 자료 수정
		//set = 일부변수가 아닌 전체의 내용을 수정하기 위해서 이 매소드를 사용 
		//4-2)변경된 책 정보를 담은 책 객체를 넘겨서 수정처리
		kyobo.set(vegetrian2);

		System.out.println("========5 : 채식주의자 할인 확인==========================");
		//5.채식주의 가격할인 적용 결과 확인 : get 
		//(1) 해당 책의 시퀀스 번호만 알면 조회가능 
		//   시퀀스 번호만 알면
		Book seqBook = new Book(1); 
		Book findBook = kyobo.get(seqBook); 
		findBook.print(); 
		System.out.println("========6 : 책은 도끼다 삭제==========================");
		//6.책은 도끼다 : 폐기 
		//(6-1)폐기할 책의 시퀀스 번호만 알기만 하면폐기 가능 
		//시퀀스 번호만 들어 있는 Book 객체를 생성 
		
		Book rmBook = new Book(5); 
		kyobo.remove(rmBook); 
		   
		Book[] allBooks1 = kyobo.getAllBooks();
			for (Book book: allBooks1) {
				book.print();
			}
		
		
		
		
		
		
		
		
		
		
	   
	   
	   
	   
	   
	   
	   
	   
	   
		
	}

}
