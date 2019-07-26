package stringtest1;

public class StringApiTest {

	public static void main(String[] args) {
		//1 선언 
		//(1) char[] 선언 
		char[] data = { 'a', 'b' , 'c' }; 
		
		//(2) String 변수 선언 
		String str1 = new String(data); 
		String str2 = "def";
		String str3 = "XYZ"; 
		
		
		System.out.printf();
		System.out.println(str1.charAt(2));  // c
		
		//concat(String) : 문자열을 붙인 결과 리턴
		System.out.println(str1.concat(str2)); //abcdef 
		
		//substring(int) : 입력된 인덱스에서 마지막 문자까지 
		System.out.println(str3.substring(1)); 
		
		System.out.println(str1.concat(str2).concat(str3).substring(2,5));
		
		//(5) replayce (char char) 앞의 매개변수 문자를 뒤 매개변수 문자로 치환
		System.out.println(str1.replace('a' ,'x'));  
		
		//(6) toUpperCase() : 대문자로 변경 
		System.out.println(str1.toUpperCase());
	
		System.out.println(str3.toLowerCase()); 
		
		//(8) lenght() : 문자열길이를 정수로 리턴 
		System.out.println(str1.concat(str2).concat(str3).substring(2,5));
	}

}
