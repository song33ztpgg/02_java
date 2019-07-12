package array.basic;


/*
 자바 1.5 부터 지원 
 데이터 구조화 함깨 사용
 
 
 
 * */
public class Class {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5};
		
		
		
		int sum = 0;
		
		
		//foreach 구문
		//for(원소의타입 변수이름 : 자료구조(==배열)) { 
		// 문장들 };
		for(int num : numbers) { 
			System.out.println("num = " +num); 
			
		} 
		
		System.out.println("");
		
		
		for(int idx =0; idx < numbers.length ; idx++)
		{ 
			numbers[idx] = (idx +1) * 100;
		}
		
		 
		
		for(int idx2 : numbers) { 
			
			sum += idx2 * 100; 
		System.out.println("" +idx2);
		} 
		System.out.println("" +sum);
	    
	    
	
		
		

	}

}
