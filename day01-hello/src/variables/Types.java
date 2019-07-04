package variables;

// 자바의 자료형을 테스트 하는 클레스이다.


//         /**/- 문서주석
//         ctrl + d : 줄 지우기
public class Types {

	public static void main(String[] args) {
		//1.변수 선언
	    //  변수 선언 구문 : 타입이름 변수이름; 
		
		//(1) char : 문자 1글자 저장 
		char c;
		//(2) int  : 큰 정수를 저장하는 타입  (-1,0,255) 
		int size;
		//(3) String : 1글자 이상의 문자열 저장하는 타입 
		String name;
		
	    
		
		//2.초기화 구문 
		c = 'A'; 
		size = -255; 
		name = "black out"; //쌍타옴표를 사용  
		
		// 3. 사용 : 출력 
		System.out.println("c = " +c);
		System.out.println("size = " +size);
		System.out.println("name = "+name);  
		
		//상수  : 변수와 비슷하지만 값이 변하지 않음 
		//선언시 final 이라는 키워드 사용
		
		final int MAX_VALUE = 100; 
		System.out.println("" +MAX_VALUE);  
		
		
/*       
	  1.자료형──────┬─논리형(boolean) {true/ flase : 참값을 저장 1바트}
		            │  
		            └─숫자(numeric)────────┬─정수형 - byte     {부호있는 정수 / 8비트}
		              					   │	    - short    {부호있는 정수 / -128~128}
		              					   │		- char     {유니코드 문자}
		              				       │	    - int      {부호있는 정주 / 32비트}
		              					   │		- long     {부호있는 정수 / 64비트}
										   │ 
										   └─실수형 - float    {플로팅 포인트 / 32비트}
										   		    - double   {플로팅 포인트 / 64비트}

       2.참조형(reference type) - 클래스, 인터페이스, 배열

       
                        
      int number;       int[] number;
       number = 10    	number = 10          
	   ┌──────┐ 	  	┌──────┐
       │  10  │		  	│      ├───┐
       └──────┘ 	  	└──────┘   │	
               	   	  		       ↓		
      			  			       10
*/		
		
		
		
		
		
		
//	    줄을 선택하고 ctrl + / 하면 선택부분 주석이 된다
		
		
		
	}

}
