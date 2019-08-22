package sequence;

public class ArithProgression {

		//계산을 하는 매소드 
	public int sequence(int start, int diff, int index) { 
			
			//호출때 마다 초기화 되는 변수, 값을 넣을 변수
			int result = 0;
			//호출때 마다 0으로 초기화 되는 변수 , 최종 값을 넣을 변수
			int value = 0;
			//계산
			result = start + diff * (index - 1);
			
			//index 값이 0이 아닐 때 까지 실행
			if (index != 0) {
				
				//index값 감소
				index--; 			
				//index 값이 0 이되면 불러왔던 호출한 매소드들의 반환값을 다 받아 계산한다
				result += sequence(start, diff, index);  
				
				//최종 결과만 value 대입
				value = result;
			}
			
			return value;
		}
		
}
