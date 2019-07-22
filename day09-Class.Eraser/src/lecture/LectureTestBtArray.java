package lecture;

public class LectureTestBtArray {

	public static void main(String[] args) {

		final int EraserTotal = 2; 
		final int MarkerTotal = 4; 
		
		//배열선언
		Maker[] markers = new Maker[MarkerTotal]; ; 
		Eraser[] erasers;
		//markers = new Maker[MarkerTotal]; 
		erasers = new Eraser[EraserTotal];
		
//		Maker[] markers = {    (3.5, 12.0, 5.5, 5, "검정색", "왼쪽"),
//							   (3.5, 12.0, 5.5, 3, "흰색" , "오른쪽"); 
//		Eraser[] erasers;
		
		//선언 
//		Eraser leftEraser; 
//		Eraser rightEraser;
//		Maker red;
//		Maker blue;
//		Maker green;
//		Maker black;
		
		//초기화
//		leftEraser  = new Eraser(3.5, 12.0, 5.5, 5, "검정색", "왼쪽");
//		rightEraser = new Eraser(3.5, 12.0, 5.5, 3, "흰색" , "오른쪽");
//		red = new Maker(true, true, "빨강");   
//      blue = new Maker(false, false, "파랑");  
//		green = new Maker(true, false, "초록"); 
//		black = new Maker(true, false, "검정"); 
	
		erasers[0] = new Eraser(3.5, 12.0, 5.5, 5, "검정색", "왼쪽");  
		erasers[1] = new Eraser(3.5, 12.0, 5.5, 3, "흰색" , "오른쪽"); 
		    
		
		markers[0] = new Maker(true, true, "빨강"); 
		markers[1] = new Maker(false, false, "파랑");   
		markers[2] = new Maker(true, false, "초록");         
		markers[3] = new Maker(true, false, "검정");              
		
		
		//Maker[] markers = new Maker[MarkerTotal];
		//Eraser[] erasers = new Eraser[MarkerTotal];
		
		
	
		/**
		3. foreach를 사용하기
		*모든 마커를 한번씩 사용 use 
		*모든 지우개를 한번씩 사용 erase 
		*모든 지우개를 한번씩 한 겹 벗겨내기 peel 
		*모든 지우개의 상태 출력 
		*모든 마커의 상태 출력
		*/
		
		//모든 마커를 한번씩 사용 use 
		
		for(Maker marker : markers) {
			 marker.use();
		}
		
		
	}

}



