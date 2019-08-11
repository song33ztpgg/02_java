package api.object.product.test;

import java.awt.Point;

import api.object.product.Product;

public class ProductTest {

	public static void main(String[] args) {
		
		// 1. 선언 : 제품을 사용하기 위한 객체 참조 변수
		Product[] products = new Product[3];
		Product msMouse; 
		Product ltMouse; 
		Product airFrier;
		
		// 2. 초기화
		ltMouse = new Product("P001", "MS-아크 터치 마우스", 51330, 36);
		msMouse = new Product("P003", "로지텍 코리아 G302", 34900, 12);
		// 객체생성은 기본 생성자로 진행
		airFrier = new Product();
		
		
		

		//Product의 각 필드에 access modifier
		airFrier.setPcode("P002"); 
		airFrier.setPname("[필립스] 에어프라이어");
		airFrier.setPrice(329000); 
		airFrier.setQuantity(5);
		products[0] = msMouse;
		products[1] = airFrier; 
		products[2] = ltMouse; 
		
		System.out.println("초기상태"); 
		for(Product product : products) { 
			product.print();
		} 
		
	
		
		//3.1 ms 마우스의 가격을 변경 
		Product msMouse2 = new Product ("P003", "로지텍 코리아 G302", 40000, 12); 
		
		//제품들이 들어있는 배열 roducts 에서 msMouse2의 
		// pcode 와같은 제품 번호를 갖는 인덱스의 원소를 msMouse2로 변경 
		
		for(int idx = 0; idx < products.length ; idx++) { 
			
			if(products[idx].getPcode() == msMouse2.getPcode()) { 
				products[idx] = msMouse2;
				
			}
		}
		
			
		// 3. 사용
		// (1) 제품 상태 출력 
		System.out.printf("================================%n");
		
		airFrier.print();
		
		
		// (2) 20% 할인가는 어떻게 되나?
		int dcPrice = ltMouse.discount(0.2); 
		System.out.printf("할인 : ");
		System.out.printf("제품 가격 : %d,  20%% 할인가 : %d%n", 51330, dcPrice);
		// (3) 2개 판매(sell)
		System.out.printf("2개판매 : ");
		msMouse.sell(2);
		
//		// (4) 상태 출력
//		System.out.printf("현재 상태 : ");
//		msMouse.print();
		
		// (5) 10개 입고(buy)
		System.out.printf("입고 : ");
		msMouse.buy(10);
		
		// (6) 상태 출력
		System.out.printf("현재상태 : ");
		msMouse.print();
		
		
		
		
//		
//		//다른 패키지(point)에 있는 Point 클래스를 사용 : import 
//		Point point = new Point(); 
////		point.setX(1000); 
////		point.setY(1000); 
//		
//		System.out.println(point);
//		
		

	}

}


//package api.object.product.test;
//
//import java.awt.Point;
//
//import api.object.product.Product;
//
//public class ProductTest {
//
//	public static void main(String[] args) {
//		
//		// 1. 선언 : 제품을 사용하기 위한 객체 참조 변수
//		Product[] products = new Product[3];
//		Product msMouse; 
//		Product ltMouse; 
//		Product airFrier;
//		
//		// 2. 초기화
//		ltMouse = new Product("P001", "/MS-아크 터치 마우스/", 51330, 36);
//		msMouse = new Product("P003", "/로지텍 코리아 G302/", 34900, 12);
//		// 객체생성은 기본 생성자로 진행
//		airFrier = new Product();
//		
//		//Product의 각 필드에 access modifier
//		airFrier.setPcode("P002"); 
//		airFrier.setPname("/[필립스]에어프라이어/");
//		airFrier.setPrice(329000); 
//		airFrier.setQuantity(5);
//		
//		products[0] = msMouse;
//		products[1] = airFrier; 
//		products[2] = ltMouse; 
//		
//		System.out.println("초기상태"); 
//		
//		for(Product product : products) { 
//			product.print();
//		} 
//		
//	
//		
//		//3.1 ms 마우스의 가격을 변경 
//		Product msMouse2 = new Product ("P003", "★로지텍 코리아 G302", 40000, 12); 
//		
//		//제품들이 들어있는 배열 roducts 에서 msMouse2의 
//		// pcode 와같은 제품 번호를 갖는 인덱스의 원소를 msMouse2로 변경 
//		int x = 0;
//		
//		for(int idx = 0; idx < products.length ; idx++) { 
//			
//			if(products[idx].getPcode() == msMouse2.getPcode()) { 
//				System.out.println(products[idx].getPcode());
//				System.out.println(msMouse2.getPcode());
//				
//				products[idx] = msMouse2;
//				products[idx].print();
//				x = idx;
//			}
//			
//		}
//		
//		products[x].print();
//			
//		// 3. 사용
//		// (1) 제품 상태 출력 
//		System.out.printf("================================%n");
//		
//		System.out.printf("msMouse ");
//		msMouse.print(); 
//		
//		System.out.printf("msMouse ");
//		msMouse.print();
//		products[0].print();
//		
//		System.out.printf("airFri  ");
//		airFrier.print(); 
//		System.out.printf("itmouse ");
//		ltMouse.print(); 
//		
//		
//		
//		
//		// (2) 20% 할인가는 어떻게 되나?
//		int dcPrice = ltMouse.discount(0.2); 
//		System.out.printf("할인 : ");
//		System.out.printf("제품 가격 : %d,  20%% 할인가 : %d%n", 51330, dcPrice);
//		// (3) 2개 판매(sell)
//		System.out.printf("2개판매 : ");
////		mouse.sell(2);
//		
//		// (4) 상태 출력
//		System.out.printf("현재 상태 : ");
////		mouse.print();
//		
//		// (5) 10개 입고(buy)
//		System.out.printf("입고 : ");
////		mouse.buy(10);
//		
//		// (6) 상태 출력
//		System.out.printf("현재상태 : ");
////		mouse.print();
//		
//		
//		
//		
////		
////		//다른 패키지(point)에 있는 Point 클래스를 사용 : import 
////		Point point = new Point(); 
//////		point.setX(1000); 
//////		point.setY(1000); 
////		
////		System.out.println(point);
////		
//		
//
//	}
//
//}
