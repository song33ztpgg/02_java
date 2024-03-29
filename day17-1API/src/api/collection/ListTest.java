package api.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 객체를 요소 (Element)로 저장하는 
 * 컬랙션(Collection(중에서) 
 * 
 * 1. 중복 저장 허용 
 * 2. 순서 상관 있음 
 * 으로 데이터를 저장하는 List 타입을 텟트 
 * 
 * @author 304
 * */
public class ListTest {

	public static void main(String[] args) {

		/*
		 *	ArrayList: List인터페이스 구현 클래스 
		 *	1.배열로 List 인터페이스 구현 
		 *	2.배열의 단점을 개선한 구현 클래스  
		 *	(1) 처음 생성할 때 크기가 고정되는 것 
		 *	(2) 데이터 추가시 동적으로 크키 변경 불가능 한 것 
		 *	(3) 데이터 삭제시 빈 인덱스 처리가 안되는 것 
		 *  3. 데이터 추가시 크기가 자동으로 증가 
		 *   (=> 인덱스가 추가되는 엘리먼트 개수만큼 자동 증가)	
		 *   4.데이터 삭제시 빈 인덱스 자동처리 
		 *   (=> 삭제된 인데스 뒷쪽의 엘리먼트의 인덱스가 
		 *   	 자동으로 삭제된 만큼 당겨서 처리됨) 
		 **/ 
		
		//1.List 인터페이스 변수 선언
		// 변수,화살표로 생각해라 , 연결된 인스턴스가 필요하고 클래스가 그 기능을 만든다 
		// interface List import
		List list; 
		
		//초기화 
		// List 는 인터페이스 타입의 변수이므로 
		// new List() 는 불가능 
		// 따라서 List인터페이스 구현 클래스중 하나의 
		// 인스턴스를 생성하여 연결. 
		list = new ArrayList();
		
		
		//3.사용 
		//3.1 리스트에 아이템 추가 : Collection의 add(object) 메소드 사용 
		System.out.println("1】 list.add(첫번째 엘리) :" +list.add("첫번째 엘리먼트"));
		System.out.println("\t list = " +list);
		
		// auto -boxing
		System.out.println("2】 list.add(2) : " +list.add(2));
		System.out.println("\t list = " +list);
		
		//Double 타입의 테이터 
		System.out.println("3】 list.add(new Double(3.00)) : " +list.add(new Double(3.00))); 
		System.out.println("\t list = " +list);
		
		System.out.println("4】 list.add(new Boolean(true) : " +list.add(new Boolean(true)));
		System.out.println("\t list = " +list);
		
		System.out.println("5】 list.add(new Boolean(true)) : " +list.add(new Boolean(true))); 
		System.out.println("\t list = " +list);
		
		System.out.println("6】 true : " +true);
		System.out.println("\t list = " +list);
		
		Book vegetrian = new Book(1, "9788936433598", "채식주의자", "한강", "창비", 247, 10000, 10); 
		Book book = new Book(1); 
		
		
		
		
		
		
		
		System.out.println("================================");
		//seq 가 같은 Book 객체 추가 시도
		System.out.println("7】 list.add(vegetrian)) : " +list.add(vegetrian));		
		
		System.out.println("\n===중복데이터 추가 시도 ===");
		System.out.println("8】 list.add(book) : " +list.add(book));
		
		//Set 에는 들어가지 않던 동일 데이터 추가
		System.out.println("9】 list.add(첫번째 엘리먼트)) :" +list.add("첫번째 엘리먼트\n")); 
		
		//List출력 : toString() ArrayList클래스에서 재정된것이 작동 
		System.out.println("\n10】 list 직접출력 : ");
		System.out.println("list : " +list); 
		
		System.out.printf("\n11】 list foreach 출력 : \n");
		
		for(Object object : list) {	
			//런타임 예외 상황을 방지하기 위하여 아래와 같은 코드 
			if(object instanceof Book) {
				((Book) object).setTitle("채식주의자"); 
			}
			
			System.out.println(object); 
		}
		
		System.out.printf("list for 출력 : ");
		for(int idx = 0 ; idx < list.size() ; idx++) {
//			System.out.println(idx +" : "+ list.get(idx));
//			System.out.println(list.get(idx)); 
			
			
		}
		
		//인덱스를 직접지정해서 추출 가능 
		//int two = list.get(1); 
		int two1 = (int)list.get(1);
		int two2 = (Integer)list.get(1); 
		
//		int two2 = (Integer)list.get(5); 
//		코드상에 문제가 있으나 문제가 보이지 않고 실행될대 문제가 발생
		
		System.out.println("삭제 전 list의 크기 " +list.size()); 
		
		//1번째 인덱스 엘리먼트를 삭제 
		System.out.println(list.remove(1)); 
		System.out.println("삭제 후 list 크기 :" +list.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
