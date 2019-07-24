package product;

import point.Point;

public class ProductTest {

	public static void main(String[] args) {
		
		// 1. 선언 : 제품을 사용하기 위한 객체 참조 변수
		Product mouse; 
		Product airFrier;
		
		// 2. 초기화
		mouse = new Product("P001", "MS-아크 터치 마우스", 51330, 10);
		
		// 객체생성은 기본 생성자로 진행
		airFrier = new Product();
		
		//각 필드는 . (도트연산자로) 접급해서 저장
//		airFrier.pcode = "p002"; 
//		airFrier.pcode = "[필립스] 에어프라이어";
//		airFrier.price = 329000; 
//		airFrier.quantity = 5; 

		//Product의 각 필드에 access modifier
		airFrier.setPcode("P002"); 
		airFrier.setPname("[필립스] 에어프라이어");
		airFrier.setPrice(329000); 
		airFrier.setQuantity(5);
		
		System.out.println(airFrier.getPcode());
		System.out.println(airFrier.getPname());
		System.out.println(airFrier.getPrice()); 
		System.out.println(airFrier.getQuantity());
		
		// 3. 사용
		// (1) 제품 상태 출력 
		mouse.print();
		airFrier.print();
		System.out.printf("================================%n");
		
		// (2) 20% 할인가는 어떻게 되나?
		int dcPrice = mouse.discount(0.2); 
		System.out.printf("할인 : ");
		System.out.printf("제품 가격 : %d,  20%% 할인가 : %d%n", 51330, dcPrice);
		// (3) 2개 판매(sell)
		System.out.printf("2개판매 : ");
		mouse.sell(2);
		
		// (4) 상태 출력
		System.out.printf("현재 상태 : ");
		mouse.print();
		
		// (5) 10개 입고(buy)
		System.out.printf("입고 : ");
		mouse.buy(10);
		
		// (6) 상태 출력
		System.out.printf("현재상태 : ");
		mouse.print();
		
		System.out.println("==============================");
		System.out.println(mouse);
		System.out.println("==============================");		 
		
		//다른 패키지(point)에 있는 Point 클래스를 사용 : import 
		Point point = new Point(); 
		point.setX(1000); 
		point.setY(1000); 
		
		System.out.println(point);
		
		

	}

}