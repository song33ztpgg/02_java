package operator.ternary;

import java.util.Scanner;

/*
삼항 연산자 (조건식 ? 값1 : 값2) 테스트 

조건식 : 연산 결과가 항상  true , false 데이터로 나와야 함
 
 
 
 
 * */
public class TernaryTest {

	public static void main(String[] args) {

		
		int x = 10; 
		int y = -10; 
		
		int absX = (x>=0) ? x : -x;
		int absY = (y>=0) ? y : -y; 
				
				
		System.out.printf("x = %d 일때 절대값은 %d\n ", x, absX);
		System.out.printf("y = %d 일때 절대값은 %d\n ", y, absY);

		Scanner scan; 
		int z; 
		int absZ;
		//참조형 : 초기화 방법이(new) 
		scan = new Scanner(System.in);
		 
		
		 
		
		System.out.println("값을 입력하시오");
		z = scan.nextInt();
		absZ = (z >=0)  ? z : -z;
		System.out.printf("z = %d 일때 절대값은 %d\n ", z, absZ);
	}

}
