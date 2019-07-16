package account.one;

public class AccountTest {

	public static void main(String[] args) {

		// ac 객체 , myac 객체
		// new Accout()  => 생성자 호출 
		Account ac = new Account();  
		Account myac = new Account(); 
		
		
		System.out.println("1번재 계좌");
		ac.print();
		ac.depoit(10000);  
		ac.print(); 
		ac.depoit(5000);
		ac.print(); 
		
		System.out.println("2번째 계좌"); 
		myac.print(); 
		myac.depoit(10000);  
		myac.print(); 
		myac.depoit(-7000);
		myac.print();
		
	}

}
