package test; 



/**
 * Generic 을 사용하여 
 * 사용자 정의한 클래스인 
 * DataPair를 테스트 
 * 
 * 
 * */
public class DataPairTest {

	public static void main(String[] args) {

		DataPair<String ,Integer> A ;
		A = new DataPair<>("one", 1);
	
		
		
		System.out.printf("%s  %d" , A.getValue() , A.getKey());
		
	}

}
