package array.basic;

public class ContinueTest2 {

	public static void main(String[] args) {
		
		int sum =0;
		for(int i = 1; i < 100 ; i++) { 
				if(i % 2 == 0) continue; 
				sum +=i; 
				} 
		System.out.printf("홀수 총합 %d\n",sum);
	
	

	
	sum = 0;
	for(int i = 1; i < 100 ; i++) {
			if(i % 3 != 0) continue; 
			sum +=i; 		
			} 
	System.out.printf("홀수 총합 %d\n",sum);
	} 
}
	


