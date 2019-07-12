package car;
/*
 * 
 * 메소드 작성 연습 클래스 
 * 
 * */

public class VarietyMethods {

	/*
	 * 화면에  hello , world! 를 출력하는 메소드 
	 * 
	 * */ 
	
	public void sayHello( ) { 
		System.out.println("Hellow world!");
	} 
	
	public void sayMaxim(String name, String maxim) { 
 
		System.out.printf("%s(이)가 말하길 \" %s \" 라고 하였다", name , maxim);
		
	} 
	
	
	public double fahToCel(double fah) { 
		return 5.0/9.0 * (fah -32);
	}
	
	
}
