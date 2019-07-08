package operator.nuary;
/*
 * 단항연산자를 태스트 해보는 클래스
 * +,- : 부호변경 연산자 
 * 		 변수의 왼쪽에서 해당 변수에 있는 숫자 값의 부호를 변경
 * +, -:증감 연산자 , 공백이 존재하면 안된다
 * 
 * */

public class IncreaseDecrease {

	public static void main(String[] args) {

		int count = 0;
		int ten = 3; 
		
		ten = -ten;
		System.out.println("ten = -ten = "  + ten); 
		ten = -ten;
		System.out.println("ten = -ten = "  + ten); 
		
		System.out.println(++count); 
		// 순서 1. ++ 계산을 해라 -> +1 되어 출력
		System.out.println(count++); 
		System.out.println(count);
		 
		// (1 칸 초기설정 ) 
		
		int i=0; 
		for(i=0 ; i<100 ; i++) 
		{ 
			

			System.out.println("경봉이형 나이 "+i);
	
		}

	}

}
