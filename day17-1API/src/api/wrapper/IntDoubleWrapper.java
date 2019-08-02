package api.wrapper;


import static java.lang.Integer.*; 
import static java.lang.Double.*;
/**
 * 기본형  <==> 참조형  데이터
 * 서로 변환 할 수 있도록 하는 포장클래스중 
 * int :Interger 
 * double : Double 
 * 
 * 두자기 포장클래스 
 * @author 304
 * */

public class IntDoubleWrapper {

	public static void main(String[] args) {

		//1. 사용할 문자열 변수 선언 , 초기화 
		String intInput = "200";
		String dbInput = "200.0"; 
		
		//2.String - > 기본형 
		//2.1 parseType() : 각 포장클래스의 static 메소드 사용 
//		String intFrm = String.format("문자열[%s] ==> 기본형[%d] \n", intInput,Integer.parseInt(intInput)); 
//		String dbFrm = String.format("문자열[%s] ==> 기본형[%d] \n", intInput,Double.parseDouble(dbInput));
		
		String intFrm = String.format("문자열[%s] ==> 기본형[%d] ", intInput,Integer.parseInt(intInput)); 
		String dbFrm = String.format("문자열[%s] ==> 기본형[%f] ", intInput,parseDouble(dbInput));
		
		System.out.println(intFrm); 
		System.out.println(dbFrm); 
		System.out.println(" ");
		
		//2.3 typeValue() 메소드 사용 : non - static 메소드 인스턴스 생성 후 사용 
		
		
//		intFrm = String.format("문자열[%s] ==> 기본형(int)[%d] \n", intInput,new Integer.parseInt(intInput)); 
		dbFrm = String.format("문자열[%s] ==> 기본형(double)[%f] \n", dbInput,new Double(dbInput).doubleValue());
		
		System.out.println(intFrm); 
		System.out.println(dbFrm); 
		System.out.println(" ");
		
		//=================================================================================== 
		
		//3. 기본형 -> String 
		int ten = 10; 
		double sixty =60.0; 
		String tenStr = new Integer(ten).toString(); 
		String sixtyStr = new Double(sixty).toString();
		
		tenStr += "입니다"; 
		sixtyStr += "입니다";
 
		System.out.println(tenStr); 
		System.out.println(sixtyStr); 
		
		//4. 기본형 -> 참조형 
		Integer objTen = new Integer(ten); 
		Double objSix = new Double(sixty); 
		
		String tenFrm =String.format("%s의 참조형 데이터 %s ",ten,objTen.toString()); 
		String sixStr =String.format("%s의 참조형 데이터 %s", sixty,objSix.toString()); 
		
		
		
		//4.2  다른 방법으로 출력
		System.out.println(ten + " 의 참조형 데이터" +objTen); 
		System.out.println(sixty + "의 참조형 데이터" +objSix);
		
		//5. 포장클래스의 
		//autoUnboxing : 참조형 인스턴스가 기본형 변수에 변환 메소드 호출 없이 바로 담시는 기법 
		//autoBoxing   : 기본형 데이터가 참조형 변수에 new없이 바로 담기는 기법 
		
		//5.1 autoBoxing 적용전 
		//	  반드시 포장클래스의 생성자를 사용해야 함
		Integer objOne = new Integer(1); 
		int one = 1;
		
		//5.2 autoBoxing 적용후  
		//	  포장클래스 변수를 마치 기본형 변수인 듯 
		//	기본형 값 바로 저장을 지원
		Integer objFive = 5;
		
		
		//5.3 autoUnboxing  적용전 
		// 명시적으로 typeCalue() 매소드 호출
		int three = new Integer(3).intValue(); 
		
		Integer objFour = new Integer(4);
		int four = objFour.intValue(); 
		
		
		//5.4autoUnboxing  적용후
		int five = new Integer(5);
		
		}

}
