package shoe.test;

import shoe.Shoe;
import shoes.ShoeShowcase;

public class ShoeTest2 {

	public static void main(String[] args) {
		
		//main 메소드에서 
		//1. Shoe 타입의 객체를 4개 생성
		//   code 는 1, 2, 3, 4 로 일련번호를 부여
		//   name, size, price, type 등은 
		//   실제로 있는 데이터 인터넷(ABC mart 페이지에서 검색)하여 생성
		Shoe sbenu = new Shoe(1,"S라인 쿠앤쿠",240,77000,"신발",500); 
		Shoe adidas = new Shoe(2,"아딜렛",250,24000,"슬리퍼",13); 
		Shoe nike = new Shoe(3,"에어 모나크4",270,79000,"운동화" , 32);
		Shoe dotorMarten = new Shoe(4,"아드리안 슬립 온 슈",280,159000,"구두",5); 

		//2. ShoeShowcase 타입의 변수 showcase 선언
		ShoeShowcase showcase;
		//   (1) ListShoeShowcase 로 ShoeShowcase 인스턴스 생성
		
		showcase = new ListShoeShowcase;
		//   (2) SetShoeShowcase 를 ShoeShowcase 인스턴스 생성
		//   (3) MapShoeShowcase 를 ShoeShowcase 인스턴스 생성

		//3. 각 구현에 관계 없이 ShowShowcase 의 기능 getAllShoes() 를 호출
		
		//4. 3 번 코드로 등록된 신발의 정보 1개를 출력
		
		//5. 3 번 코드로 등록된 신발의 정보에서 재고를 0으로  조정

		//6. 재고가 조정된 내용 출력

		//7. 3 번 코드로 등록된 신발 정보를 삭제

		//8. 삭제된 신발의 정보가 shoes 에 없는 것을 출력(전체 출력==getAllShoes())

	}

}
