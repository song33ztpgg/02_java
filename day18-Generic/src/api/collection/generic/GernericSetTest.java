package api.collection.generic;

import java.util.HashSet;
import java.util.Set;

//import book.Book;

/**
 * 컬렉션에 자장할 타입에 제한을 주는 
 * Gereric 이 적용된 Set을 테스트 
 * @author 304
 * 
 * */

public class GernericSetTest {

	public static void main(String[] args) {

	//1.Interger 만 저장하는 Set 
		// ┌ 저장하려고 하는 이름 타입을 넣는것
	Set<Integer> set;
	Set<Book> books;
	
	//2. 초기화 : Integer만 저장하는 hashSet 으로 
	 set = new HashSet<Integer>(); 
	 
//	 set = new HashSet<>();   - 선언 시점에서 만들었기에 이렇게 생략이 가능하다
//	 set = new <Integer>HashSet();   -오류가 보이지 않는다
	 
	 //3.엘리먼트 추가 
	 //auto-boxing
	 set.add(1); 
	 set.add(20); 
	 set.add(new Integer(300)); 
//	 set.add("사백"); Integer 형식만 넣도록 기능을 설정을 해서 오류가 발생
	 
	 
	 books = new HashSet<Book>();
	 Book vegetrian = new Book(1, "9788936433598", "채식주의자", "한강", "창비", 247, 10000, 10);	
	 Book littlePrins = new Book(2, "9788932917245", "어린 왕자", "앙투안 드 생택쥐페리 ", "더 스토리", 150, 8820, 5);
	 Book noDaap = new Book(3, "9791190182645", "제 인생에 답이 없어요", "선바 ", "위즈덤 하우스", 192, 10800, 3);
	 Book dduk = new Book(4, "9791196394509", "죽고 싶지만 떡볶이는 먹고 싶어", "백세희", "혼", 208, 12420, 2);
	 Book ax = new Book(5, "9788956055466", "책은 도끼다", "박웅현", "북하우스", 348, 14400, 2);
	
	
	 books.add(vegetrian); 
	 books.add(littlePrins); 
	 books.add(noDaap); 
	 books.add(dduk);
	 books.add(ax);
	 
	 //3.사용 
	 //Integer Set에서 데이터 추출 :foreach 
	 for(Integer number : set) { 
		 //추출된 값에 * 100을 출력
		 System.out.println(number * 100);
	 }
	 
	 for(Book book : books) { 
		 System.out.println(book);
	 }
	 
	}

}
