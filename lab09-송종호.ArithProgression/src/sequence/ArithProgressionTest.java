package sequence;

public class ArithProgressionTest {

	public static void main(String[] args) {
		
		//클래스 호출 , 초기화
		ArithProgression arithProgression = new ArithProgression(); 
		
		System.out.printf("첫항 1 / ");
		System.out.printf("공차 3 / "); 
		System.out.println("항의 개수 3");
		
		//결과값 출력 
		System.out.println(arithProgression.sequence(1,3,3));
	}
}
