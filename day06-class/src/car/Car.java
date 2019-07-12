package car;

/*
 * car(자동차) 라는 타입을 정의(선언)하는 클래스 
 * 
 * car(자동차)는 자바가 기본 제공하는 타입이 아니다 
 * 기본제공(Scanner , String ) 
 * 
 * 클래스 디자인을 할 때는 추상화 작옵아 필요 
 * 
 * 속성 : 현재의 속도 (변수)
 * 기능 : 가속, 정지 (매소드)
 * 
 * 
 * */


public class Car {
	
	// 1. 맴버 변수 선언부 : 상태저장 
	int velocity = 10; 
	String nickname;
	
	// 2. 생성자 선언부 : 초기화 위해 
	// 생략
	
	// 3. 매소드 선언부 : 사용을 위해
	// (1) 가속기능 : 가속된 결과 현재 속도가 얼마인지 리턴
	public int accelerate(int value) { 
		velocity += value ; 
		return velocity;
	}
	
	// (2) 정지기능 : 속도를 완전히 0으로 설정
	
	public void stop() { 
		velocity = 0;
	} 
	

	
	// (3) 차의 별명을 설정하는 기능 : 
	public void setNickName(String carNickName) { 
		nickname = carNickName;
	}
	
	// (
	public void print() { 
		System.out.printf("이차의 현제 속도 : %dkm/h \n 차의 별명 : %s \n\n",velocity, nickname);
	} 
	
	
	
	
} 


















