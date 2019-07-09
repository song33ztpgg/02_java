package control.swch;

public class PrintToTen {

	public static void main(String[] args) {		
		
//		while(z < 11) { 
//			System.out.printf("%d\n", z); 
//			z++;
//		}
		
		
//		int x = 1; 
//		int sum = 0;
//		
//		while(x <= 100) { 
//			sum += x;
//		    x += 2;
//		} 
//		
//		System.out.printf("홀수의 합은 %d 입니다", sum); 
//		
//		
//		
//		int y = 2; 
//		sum = 0; 
//		
//		while(y <= 100) { 
//			sum += y; 
//			y +=2;
//		}
//		System.out.printf("짝수의 합은 %d 입니다", sum);
//		
//		
		
		
		
		int z = 0; 
		int sum2 = 0; 
		
		while(z <= 100) { 
		
			 if((z % 2) == 1 ) { 
				 sum2 +=z ;
				 z++;
			 } else {
				 z++;
			 } 
			 } 
		
		
		System.out.printf("홀수의 총합은 %d 입니다", sum2); 
		
		

		int x = 0; 
		int sum3= 0;
		
		do{ 
			
			if((x % 2) == 0 ) { 
				 sum3 +=x ;
				 x++;
			 } else {
				 x++;
			 } 
			
		}while(x <= 100);  
		
		
		System.out.printf("짝수의 총합은 %d입니다. " ,sum3);
		
		
		
		
		
		
		
		
		
		
	}

}
