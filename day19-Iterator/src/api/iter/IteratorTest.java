package api.iter;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 컬랙션에서 각 데이터 요소(Element)를 
 * 순회 검색할 수 있는 타입으로 변경하는  
 * Iterator 인터페이스 테스트 클래스 
 * 
 * foreach 제공전에는 
 * 컬렉션의 데이터 요소를 추출 및 검색하기 위해서 
 * 사용되던 인터페이스이나 현재는 
 * 많이 사용되지는 않는다 
 * 
 * @author 304
 * 
 * */

public class IteratorTest {

	public static void main(String[] args) {

		//1.Set, Iterator변수 선언 
		Set<Integer> set; 
		Iterator<Integer> iter;  
		
		//2.Set 초기화 : HashSet으로 생성 
		set = new HashSet<>(); 
		
		//iterator 인터페이스 객체를 얻어내려면 
		//  new Iterator()는 불가능 
		// 대신 COllection 인터페이스에는 
		// Iterator 타입의 인스턴스를 리턴하는 
		// iterator() 메소드가 제공됨  
		
		
		//Collection 참조 변수에 iterator() 메소드를 
		// 적용하여 Iterator 타입을 얻어냄 
		
		 
		
		//set 이 초기화만 되어서 엘리먼트 추가 안된 상황 
		printSet(set);
		
		for(int idx = 0 ; idx < 10; idx ++) {
			set.add(idx);
		}
		printSet(set);
		
//		int[] a = new int[3]; 
//		
//		while() { 
//			System.out.println();
//		}
		
		
		
		
	}
		
		/**
		 * method refactoring 을 통해 추출한 메소드 
		 * 반복 알고리즘 
		 * 반복로직처리
		 * */
	
		private static void printSet(Set<Integer> set) {
		Iterator<Integer> iter;
		iter = set.iterator();
		while(iter.hasNext()) { 
			int number = iter.next(); 
			System.out.println("number " + number);
		}
	}

}
