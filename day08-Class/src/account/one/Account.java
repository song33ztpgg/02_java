package account.one;

/*
 * 은행 계좌를 정의하는 클래스 
 * 계좌의 속성을 나타내기 위하여 두개의 맴버변수 선언 
 * 계좌번호 : accNumber 
 * 계좌잔액 : balance 
 * 계좌잔액을 증가시키는 입금 메소드 : deposit(int amount) 
 * 계조의 현재 상태 출력하는 메소드 : printf
 * 
 * */
public class Account {

	
	
	
	//1. 맴버변수(실제 변수) 선언부 
	// 자기만의 자리를 같는  
	// 기본적으로 초기화를 해준다. 
	
	int accNumber; /** 계좌번호*/ 
	int balance; /** 계좌작액*/
	
	//2.생성자 선언부  
	 
	//3.메소드 선언부
	
	
	
	public void depoit(int amount) { 
		
		balance += amount; 	 
	//	System.out.printf("입금 : %d\n",balance);
		
	} 
	
	/** 이 계좌의 상태를 출력*/
	public void print() { 
		System.out.printf("계좌번호 : %d |  \t 계좌잔액 : %d\n", accNumber, balance);
	}
	
	
}
	

