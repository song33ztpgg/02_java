package api.collection.generic;

import java.util.ArrayList;
import java.util.List;

import book.Book;

/**
 * 컬렉션에 자장할 타입에 제한을 주는 
 * Gereric 이 적용된 Set을 테스트 
 * @author 304
 * */
public class GenericListTest {

	public static void main(String[] args) {
		
		//1.선언 : Integer만 저장할 수 있는 List 선언 
		//		Book만 저장 할수 있도록 
		List<Integer> numbers; 
		List<Book> books;
		
		
		//2.초기화 :Integer만 저장할 수있는 ArrayList로 생성 
		numbers = new ArrayList<>(); //ArrayList 처음 초기화 했을때 
		books = new ArrayList<>(); 
		
		
		//3.사용							  ┌ 엘리먼트
		//3.1 Integer만 저장하는 리스트에 add(E) 
		numbers.add(1);  	//index : 0 , value : 1 -	0 번째자리 값 1 
		numbers.add(3);  	//index : 1 , value : 3
		numbers.add(1,2);	//index : 1 , value : 2  index : 2 , value : 3 
		
		//3.2 book만 저장하는 리스트에 add(E)
	
		books.add(new Book(1, "9788936433598", "채식주의자", "한강", "창비", 247, 10000, 10));
		books.add(new Book(2, "9788932917245", "어린 왕자", "앙투안 드 생택쥐페리 ", "더 스토리", 150, 8820, 5)); 
		books.add(new Book(3, "9791190182645", "제 인생에 답이 없어요", "선바 ", "위즈덤 하우스", 192, 10800, 3)); 
		books.add(new Book(4, "9791196394509", "죽고 싶지만 떡볶이는 먹고 싶어", "백세희", "혼", 208, 12420, 2)); 
		books.add(new Book(5, "9788956055466", "책은 도끼다", "박웅현", "북하우스", 348, 14400, 2));
		books.add(new Book());
		books.add(new Book());
		
		
		
		 for(Integer number : numbers) { 
			 //추출된 값에 * 100을 출력
			 System.out.println(number * 100);
		 }
		 
		 for(Book book : books) { 
			 System.out.println(book);
		 }
		
		
		
	}

}
