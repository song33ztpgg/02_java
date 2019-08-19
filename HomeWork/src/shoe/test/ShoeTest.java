//package : shoe.test
//class : ShoeTest : Shoe 클래스를 테스트
//--------------------------------------------
package shoe.test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import shoe.Shoe;


public class ShoeTest {

	public static void main(String[] args) {
	
		
	
	//1. Shoe 타입의 객체를 4개 생성
	//   code 는 1, 2, 3, 4 로 일련번호를 부여
	//   name, size, price, type 등은 
	//   실제로 있는 데이터 인터넷(ABC mart 페이지에서 검색)하여 생성
	//	int code, String name, int size, int price, String type ,int quantity
		
		Shoe sbenu = new Shoe(1,"S라인 쿠앤쿠",200,77000,"신발",500); 
		Shoe adidas = new Shoe(2,"아딜렛",250,24000,"슬리퍼",13); 
		Shoe nike = new Shoe(3,"에어 모나크4",270,79000,"운동화" , 32);
		Shoe dotorMarten = new Shoe(4,"아드리안 슬립 온 슈",280,159000,"구두",5); 
	
	//2. (1) Shoe 타입을 저장할 수 있는 List<Shoe> shoesList 를 add(shoe) 로 추가 
		List<Shoe> shoesList = new ArrayList<>();
		shoesList.add(sbenu);
		shoesList.add(adidas);
		shoesList.add(nike);
		shoesList.add(dotorMarten);
		
	// (2) Set<Shoe> shoesSet 를 선언하여 add(shoe)로 추가 
		Set<Shoe> shoesSet = new HashSet<>(); 
		shoesSet.add(sbenu);
		shoesSet.add(adidas);
		shoesSet.add(nike);
		shoesSet.add(dotorMarten);

	// (3) Map<Shoe> shoesMap 를 선언하여 put(code, shoe)로 추가
//		Map<Shoe> shoesMap = new Map<Shoe>();  

		
		//3. 각 자료구조별 shoes 를 foreach 로 출력
		
		for(Shoe shoe : shoesList) { 
			System.out.println(shoe);
		} 
		
		for(Shoe shoe : shoesSet) { 
			System.out.println(shoe);
		}
		
//		for(Shoe shoe : shoesMap) { 
//			System.out.println(shoe);
//		}
		
		
		//4. 3 번 코드로 등록된 신발의 정보 1개를 출력
		
		
		
		//5. 3 번 코드로 등록된 신발의 정보에서 재고를 0으로 조정
		//6. 재고가 조정된 내용 출력
		//7. 3 번 코드로 등록된 신발 정보를 삭제
		//8. 삭제된 신발의 정보가 shoes 에 없는 것을 출력(전체 출력)

		
		

		
	}

	
	
}
