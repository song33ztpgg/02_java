package shoe.test;

import shoe.Shoe;

public class ShoeTest {

	public static void main(String[] args) {

		Shoe sbenu; 
		Shoe adidas; 
		Shoe nike; 
		Shoe samsung; 
	
	}

	
	
}

//package : shoe.test
//class : ShoeTest : Shoe 클래스를 테스트
//--------------------------------------------
//main 메소드에서 
//1. Shoe 타입의 객체를 4개 생성
//   code 는 1, 2, 3, 4 로 일련번호를 부여
//   name, size, price, type 등은 
//   실제로 있는 데이터 인터넷(ABC mart 페이지에서 검색)하여 생성
//   
//2. (1) Shoe 타입을 저장할 수 있는 List<Shoe> shoes 를 add(shoe) 로 추가
//   (2) Set<Shoe> shoesSet 를 선언하여 add(shoe)로 추가
//   (3) Map<Shoe> shoesMap 를 선언하여 put(code, shoe)로 추가
//   
//3. 각 자료구조별 shoes 를 foreach 로 출력
//
//4. 3 번 코드로 등록된 신발의 정보 1개를 출력
//
//5. 3 번 코드로 등록된 신발의 정보에서 재고를 0으로 
//   조정
//   
//6. 재고가 조정된 내용 출력
//
//7. 3 번 코드로 등록된 신발 정보를 삭제
//
//8. 삭제된 신발의 정보가 shoes 에 없는 것을 출력(전체 출력)
