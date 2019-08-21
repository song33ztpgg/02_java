package sequence;

public class ArithProgression {
	
	//맴버변수 =
	private int result = 0;
	
	//계산을 하는 매소드 
	public int sequence(int start, int diff, int index) { 
		
		//index 값이 0이 아닐 때 까지 실행
		if (index != 0) {
			//계산
			result += start + diff * (index - 1);
			//호출을 할때마다 idx 값 감소
			index--; 
			//제귀 호출
			sequence(start, diff, index);
		}
		
		return result;
	}
}
