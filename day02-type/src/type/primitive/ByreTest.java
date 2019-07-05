package type.primitive;


/* byte : 1byte(8bit) 에 해당하는 범위 만큼 정수를 저장하는 타입
 * 2^8 = 256(-128 ~ 127) 개  숫자를 표현가능 
 * 
 * 
 * 
 * */
import java.util.Scanner;

public class ByreTest {

	public static void main(String[] args) {

		
		byte buffer = 0; 
		System.out.println(buffer);
		
		
		buffer = -128;
		System.out.println(buffer);
		
		buffer = 127;
		System.out.println(buffer);
		

		// buffer = -130;    // 범위를 벗어나면 빨간 줄이 생긴다.
		// type mismatch connot convert from int to byte
		
		



	}

}
