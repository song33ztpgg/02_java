package stringtest1;
/**
 * 
 * String : 변경되지 앟는 문자열 
 * StringBuilder : 변경되는 문자열 
 * 
 * 두 클래스의 인스턴스가 
 * 문자열 변경후 유지되는지 여부를 확인하는 테스트 클래스 
 * 
 * 
 * */
public class StringClasses {

	public static void main(String[] args) {

		//1.선언 
		String str = new String("안녕하세요"); 						
		StringBuilder builder = new StringBuilder("안녕하세요"); 	
		
		//3.초기화 
		System.out.println("변경전"); 								/**안녕하세요*/
		                                                            /**안녕하세요*/
		//3.1 초기화 직후 내용출력 
		System.out.println("str :" +str); 
		System.out.println("builder :"  +builder); 
		
		//3.2 초기화 직후 객체참조변수의 해시값을 출력 
		System.out.printf("String의 str     :");
		System.out.println(str.getClass().getName() +"@" +Integer.toHexString(str.hashCode())); 
		
		System.out.printf("builder의 hash    : "); 
		System.out.println(builder.getClass().getName() +"@" +Integer.toHexString(builder.hashCode())); 
		
		System.out.println("변경후"); 
		
		//3.3 값변경  
		str = str + "자바"; 
		builder.append("str의 hash"); 
		System.out.printf("String의 str     :");
		System.out.println(str.getClass().getName() +"@" +Integer.toHexString(str.hashCode())); 
		
		System.out.printf("builder의 hash    :");
		System.out.println(builder.getClass().getName() +"@" +Integer.toHexString(builder.hashCode()));
		
	}

}
