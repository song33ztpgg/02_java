package stringtest1;

import java.util.StringTokenizer;

/**
 * StringTokernizer 클래스 테스트 
 * StringTokernizer는 java.util 패키지에 있으므로 
 * java.lang에 있는 Objext, String ,StringBuffer , StringBuilder와 같이 기본으로 
 * 사용할수 없고 
 * 반드시 명시적으로 import 구문이 들어가야 사용가능 
 * 
 * 
 * 
 * --띄어쓰기, 공배의 기준으로 토큰을 나눈다
 * 
 * */
public class Tokenizer {

	public static void main(String[] args) {

		//1.선언 
		StringTokenizer token; 
		
		//2.초기화 
		token = new StringTokenizer("안녕하세요, 자바 제미있게 배워볼까요"); 
		
		//3.StringTokenizer 메소드 테스트 
		//(123 456 789) => ture, ture , ture false 

		for(;token.hasMoreTokens();) { 
			System.out.println(token.nextToken());
		} 
		System.out.println();
		System.out.println("!기준으로 나누기");
		token = new StringTokenizer("안녕하세요, ! 기준으로 나눌거에요","!"); 
		
		for(;token.hasMoreTokens();) { 
			System.out.println(token.nextToken());
		}
		
		
		
		
		
	}
	

}
