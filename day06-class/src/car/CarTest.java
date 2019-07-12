package car;

/*
 * Car(자동차) 라는 타입의 실제 객체를 생성하여 
 * 사용하는 클래스
 * */

public class CarTest {
   // 돌려줄게 없다 . 매인 . (문자형 변수를 받는다)
	public static void main(String[] args) { 
		
		
		// Car라는 타입의 객체를 사용하기 위한 참조변수가 필요 함 
		//1. Car 타입의 변수
		Car myCar; //= int age; 와 동일  

		//2. 초기화 
		myCar = new Car(/* 생성자를 생략해서 아무 값도 들어가지 안음*/);
		
		int z = 0;
		int sum = 0;
	
		System.out.println("1. 차별명 붙이기 전");
		myCar.print(); 
		myCar.setNickName("F1");
		 
		 
		
		
		myCar.accelerate(0);
		
//		System.out.printf("2. 60만큼 속도 증가 후 속도 : \n"); 
//		myCar.accelerate(60); 
//		myCar.print();
		
		System.out.printf("3. 620만큼 속도 증가 후 속도 : \n"); 
		myCar.accelerate(20);
		myCar.print();
		
		System.out.printf("4. 정지 후 속도 : \n"); 
		myCar.stop();
		myCar.print();
		
		
	
		
	
	}

}
