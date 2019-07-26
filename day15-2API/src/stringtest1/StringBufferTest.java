package stringtest1;
/**
 * 가변 문자열 API 클래스인 
 * StringBuffer 클래스를 텍스트
 * */

public class StringBufferTest {

	public static void main(String[] args) {

		//1.선언 
		String str; 
		StringBuffer buffer; 
		
		//2.초기화 
		str = "안녕하새요";
		// butffer = "안된다" 
		//문자열을 다루지만 기본형 같이 할당할수 없음
		
		buffer = new StringBuffer(str);	
		
		//3.메소드 테스트 
		System.out.println(buffer);
		
		//3.1 append(String) 문자열을 추가
		//    append() 메소드는 매개변수가 타입별로 
		//	  중복정의 되어 있어서 원하는 타입의 데이터를 추가해서 
		//	  문자열로 만들수 있다
		buffer.append(", 자바");
		buffer.append(true); 
		
		System.out.println(buffer); 
		
		//3.2 length() : 문자열의 길이를 정수로 리턴하는 메소드 
		System.out.println(" buffer 의 길이" + buffer.length());
		
		//3.3 reverse() : 문자열을 뒤집어서 StringBuffer로 리턴 
		System.out.println(buffer.reverse()); 
		buffer.reverse(); 
		
		//3.4 setLenghth() : 가변 문자열이기 때문에 길이를 지정 
		buffer.setLength(5); 
		System.out.println(buffer);
		
		
	}

}
