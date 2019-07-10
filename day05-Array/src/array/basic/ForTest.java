package array.basic;

public class ForTest {

	public static void main(String[] args) {

		// 50 ~ 0R짝수만 역순으로 
		//1.continue 사용 
		//2.미사용 
		int sum = 0;
		
		for(int number = 50;number >0; number--) {
			 if(number % 2 == 0) continue; 
		
			 sum +=number; 
		}
		System.out.printf("1. 총합은 %d 입니다(continue 사용)\n",sum);
		
		
		for(int number2 = 50; number2 > 0 ; number2--) { 
		
			if(number2 % 2 == 0) { 
				sum += number2; 
			}  else { 
				;
			} 
		}
		System.out.printf("2. 총합은 %d 입니다\n(continue 미사용)",sum); 
		
		System.out.printf("-----------------------------------\n\n"); 
		
		System.out.printf("3. 제곱표 출력\n",sum);
		for(int number3 = 1; number3 < 11; number3++ ) { 
			System.out.printf("%2d ^ %2d = %3d\n",number3,number3,(number3 * number3));
		} 
		
		System.out.println("");
		
		sum = 0; 
		int number4 = 0;
		
		while(number4 != 100) { 
			
				
			if((number4 % 2) == 0) continue; 
		
			number4++;
			sum += number4;
		} 
		
		System.out.printf("4. 총합은 %d 입니다(while문 사용)\n",sum);
		 
		
		
		
	
		
		
		
		
		
		
		
		//2 제곱표 출력 
	    // 1 x 1 = 1 
	    // 2 x 2 = 4
		
		
		
	}

}
