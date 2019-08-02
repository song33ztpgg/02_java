package api.wrapper;

public class SystemTest {

	public static void main(String[] args) {
		
		long start, end;  
		 
		start = System.currentTimeMillis();
		
		System.out.println("현재시간" +start);
		System.out.println("10,000만번 반복문 시작");
		
		for(int i = 0 ; i < 10000 ; i++);
		System.out.println("종료");
		
		
		end = System.currentTimeMillis(); 
		System.out.println("반복종료 시간" + end); 
		System.out.println("반복종료 시간" + (end - start));
		
		
		
	}

}
