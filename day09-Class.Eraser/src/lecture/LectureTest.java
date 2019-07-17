package lecture;



/**
 * 마커와 칠판 지우개를 사용하여 
 * 마커를 쓰고 지워보는 테스트 클래스 
 * */

public class LectureTest {

	public static void main(String[] args) {

		Eraser leftEraser; 
		Eraser rightEraser; 
		
		// 2. 초기화
		leftEraser  = new Eraser(3.5, 12.0, 5.5, 5, "검정색", "왼쪽");
		rightEraser = new Eraser(3.5, 12.0, 5.5, 3, "흰색" , "오른쪽");

		Maker red;
		Maker blue;
		Maker green;
		Maker black; 
		
		red = new Maker(true, true, "빨강");   
        blue = new Maker(false, false, "파랑");  
		green = new Maker(true, false, "초록"); 
		black = new Maker(true, false, "검정"); 

		
//		red 
//		blue 
//		green
//		black
//		leftEraser	 
//		rightEraser
		
	
		
		//3.사용 
		//(1)네 개의 마커를 한번씩 사용 
		red.use(); 
		blue.use(); 
		green.use();
		black.use();
		
		//(2)오른쪽 ,왼쪽지우개로 사용한 내용 지우 기
		leftEraser.eraser();	 
		rightEraser.eraser();
		
		//(3)오른쪽 지우개 한 겹 벗겨내기 
		rightEraser.peel();
		
		//(4) 오른쪽 지우개 상태 출력
		rightEraser.print();
	}

}
