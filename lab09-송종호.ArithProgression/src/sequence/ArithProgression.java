package sequence;

public class ArithProgression {

//	private int start; 
//	private int diff; 
//	private int index; 
	 int result = 0;
//	
	public int sequence(int start, int diff, int index) { 
		
		if(index != 0) {
			result += start + diff * (index - 1);
			sequence(start, diff, index);
		}
		
		index--;
		
		return result;
	}
	
//	public void setStart(int start) { 
//		this.start = start;
//	}
//	
//	public void setDiff(int diff) { 
//		this.start = start;
//	}
//	
//	public void setIndex(int index) { 
//		this.start = start;
//	}
	
}


//---------------------------------------------
//
//첫항 : start
//공차 : diff
//항의 갯수 : index 
//--------------------------------------------------------
//첫 항이 start 이고, 공차가 diff 이며, 항의 갯수 index 만큼인
//등차수열의 합을 구하는 메소드 sequence 를 작성하시오.
//
//등차 수열의 일반항은
//start + diff * (index - 1) 로 구한다.
//--------------------------------------------------------
//+ArithProgression     : class 
//+sequence(int start, int diff, int index) : int
//--------------------------------------------------------
//+ArithProgressionTest : test class
//+main()
//start : 1, diff : 3, index : 3 ==> 12
