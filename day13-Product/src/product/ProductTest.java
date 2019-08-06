package product;

public class ProductTest {

	public static void main(String[] args) {
		
		// 1. 선언 : 제품을 사용하기 위한 객체 참조 변수
		Product product;
		
		// 2. 초기화
		product = new Product("P001", "MS-아크 터치 마우스", 51330, 10);
		
		// 3. 사용
		// (1) 제품 상태 출력 
		System.out.printf("현재상태 : "); 
		
		product.print();
		
		// (2) 20% 할인가는 어떻게 되나?
		int dcPrice = product.discount(0.2); 
		System.out.printf("할인 : ");
		System.out.printf("제품가격 : %d,  20%% 할인가 : %d%n", 51330, dcPrice);
		
		// (3) 2개 판매(sell)
		System.out.printf("2개판매 : ");
		product.sell(2);
		
		// (4) 상태 출력
		System.out.printf("현재상태 : ");
		product.print();
		
		// (5) 10개 입고(buy)
		System.out.printf("입고 : ");
		product.buy(10);
		
		// (6) 상태 출력
		
		System.out.println("==============================");
		System.out.printf("현재상태 : ");
		System.out.println(product);
		System.out.println("==============================");		 

	}

}