package api.collection;

import java.util.*;

//import book.Book;


/**
 * 
 * 객체를 요소(Element)로 저장하는 
 * 컬렉션 중에서 
 * 
 * 1.중복 허용 x  
 * 2.순서 상관 없음 
 * Set 타입을 테스트  
 *
 * 
 * */

public class SetTest {

	public static void main(String[] args) {

		//1.Set 선언 
		Set set; // java.util import 필요 
		
		//2.Set 초기화  
		// 인터페이스이므로 직접 new 사용 못함 
		// 대신 구형 클래스인 HashSet()의 생성자로 
		// 인스턴스를 생성한다
		set = new HashSet();
		
		//3.사용 
		//3.1 set의 엘리먼트 추가 
		//	  Set은 모든 object를 다 저장할 수 있다 
		//	  add(object) 메소드 : Collection 인터페이스에서 
		//						   물려방은 추상 메소드가 
		// 							HashSet클래스에서 구현됙 것 사용 
		System.out.println(set.add("1st Item"));
		//동일 테이터 저장시도
		System.out.println(set.add("1st Item"));
		//autoBoxing일어나고 있음
		System.out.println(set.add(2)); 
		//double 타입의 포장객체
		System.out.println(set.add(new Double("3.0")));
		//boolean 타입의 포장객체
		System.out.println(set.add(new Boolean(true))); 

		Book vegetrian = new Book(1, "9788936433598", "채식주의자", "한강", "창비", 247, 10000, 10); 
		System.out.println(set.add(vegetrian)); 
		Book book = new Book(1); 
		//vegitatrian 과seq가 같은 새 객체 book을 넣도록 추가
		//실행결과 false 인 이유 : Book 타입은 seq만 같으면 같은 객체로 판단하도록 
		// equals(), hashcode()를 재정의 했으므로 
		//beghitarian과 같은 seq1을 갖는 book 추가되지 않음 
		
		//(2) set의 내용 출력 
		System.out.println("====set의 내용출력========"); 
		//set클래스는 toString() 재정의 해 두었음 
		System.out.println(set);
		
		System.out.println("====foreach로 내용출력========"); 
		//foreach 에서 : 뒤쪽 자료구조가 올 수 있다. 
		//자료구조 : 배열, 셋 , 리스트 , 맵 
		for(Object obj : set) { 
			System.out.println(obj);
		}
		
		
	}

}
