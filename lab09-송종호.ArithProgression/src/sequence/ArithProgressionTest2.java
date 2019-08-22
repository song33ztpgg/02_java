package sequence;

public class ArithProgressionTest2 {

	public static void main(String[] args) {
		long firstTime = System.currentTimeMillis();
		//클래스 호출 , 초기화
		ArithProgression2 arithProgression = new ArithProgression2(); 
		
		
		//결과값 출력 
		arithProgression.sequence(10000); 	
		
		long endTime = System.currentTimeMillis();
		
		long time = endTime - firstTime;
		System.out.println("걸린 시간: " + time + " 밀리초");	
	}
}
