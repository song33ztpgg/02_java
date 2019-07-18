package acounnt;
/** 
 * 계좌 Account 타입 클래스의 
 * 인스턴트(객체, 실체)를 생성하고 
 * 이때 중복정의된 생성자를 사용해서 
 * 실체화를 진행하며 
 * 그렇게 생성되 객체에 테스트 하는 클래스
 * 
 * 
 * */
public class AcountTest {

	public static void main(String[] args) {

		// 1, 선언 :계좌의 객체 참조 변수
		Account myAccount; 
		Account yourAccount; 
		Account hisAccount;
		
		//2.초기화 
		//-기본생성 초기화
		myAccount = new Account(10000);
		//-매개변수를 받는 중복정의된 생성자로 초기화 
		yourAccount = new Account(10000);  
		hisAccount = new Account(30000);
		
		//3.사용 
		System.out.println("1번째 계좌"); 
		
		myAccount.print();
		myAccount.depoit(1000);
		myAccount.print();  
		myAccount.depoit(5000);
		myAccount.print();  
		myAccount.withdraw(4000); 
		System.out.println();
		System.out.println("2번째 계좌");
		yourAccount.print(); 
		yourAccount.depoit(1000);
		yourAccount.print();  
		yourAccount.depoit(5000);
		yourAccount.print();  
		yourAccount.withdraw(17000); 
		System.out.println("3번째 계좌");
		hisAccount.print(); 
		hisAccount.depoit(1000);
		hisAccount.print();  
		hisAccount.depoit(5000);
		hisAccount.print();  
		hisAccount.withdraw(17000); 
	}   

}
