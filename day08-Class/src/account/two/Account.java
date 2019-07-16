package account.two;

/*
 * 은행 계좌를 정의하는 클래스 
 * 계좌의 속성을 나타내기 위하여 두개의 맴버변수 선언 
 * 계좌번호 : accNumber 
 * 계좌잔액 : balance 
 * 계좌잔액을 증가시키는 입금 메소드 : deposit(int amount) 
 * 계조의 현재 상태 출력하는 메소드 : printf 
 * 
 * 기본 생성자 : 매개변수가 비어있는 생성자 
 * 
 * 
 * */
public class Account {

	
	
	
	//1. 맴버변수(실제 변수) 선언부 
	// 자기만의 자리를 같는  
	// 기본적으로 초기화를 해준다. 
	
	int accNumber; /** 계좌번호*/ 
	int balance; /** 계좌작액*/
	
	//2.생성자 선언부 
	/**
	 * 기본 생성자 : 클래스 이름과 대소문까지 모두 동일하고 
	 * 				 매개변수 목록이 비어있는 생성자
	 * */
	
	/** 
	 * 계좌 번호 , 계좌 잔액을 매개변수로 받아서 
	 * 입력된 값으로 계좌를 실체화(초기화)하는 
	 * 중복정의돤 생성자
	 * */
	Account(int newAccNumber, int newBalance) { 
		
		accNumber = newAccNumber; 
		balance = newBalance;
	}
	
	Account(String strAcc, int newBalance) { 
		
	}
	//3.메소드 선언부
	
	
	
	public void depoit(int amount) { 
		
		balance += amount; 	 
	//	System.out.printf("입금 : %d\n",balance);
		
	} 
	
	/** 이 계좌의 상태를 출력*/
	public void print() { 
		System.out.printf("계좌번호 : %d |  \t 계좌잔액 : %d\n", accNumber, balance);
	}
	
	
	/**
	 * 출금하는 매소드 
	 * 출금하려는 금액(amount)만클 잔액에서 차감하는 메소드 
	 * 만약 잔액이 amount보다 부족하면 출금을 진행하지 않는다
	 * */ 
	
	public void withdraw(int amount) { 
		if(amount > balance) { 
			System.out.println("잔액이 부족합니다.\n");
		} else { 
			balance -= amount; 
			System.out.printf(" %d 출금하였습니다 잔액은 %d 입니다\n\n", amount, balance);
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	

