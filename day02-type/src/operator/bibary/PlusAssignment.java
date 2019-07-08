package operator.bibary;


/*
누적대입 연산자 테스트 클래스 

+= : 산술 덧셈 연산 후 왼쪽의 변수로 재 할당 
@author 304
  
 * */
public class PlusAssignment {

	public static void main(String[] args) {
		
		int num = 0; 
		
		System.out.printf("초기 넘버 값은 %d\n " , num);
		num +=1;
		
		System.out.printf("num +=1 수행 후 값은 %d\n " , num);
		num = num +1;
		
		System.out.printf("num = num +1; 수행 후 값은 %d\n ", num); 
		
		num +=num;
		System.out.printf("num += num ; 수행 후 값은 %d\n ", num);
		
		num +=num * num;
		System.out.printf("	num +=num * num; ; 수행 후 값은 %d\n ", num); 
		
		// 연산 -> 계산 ->대입 20 
	}

}
