package acounnt;

public class EraserTest {

	public static void main(String[] args) {

		Eraser leftEraser; 
		Eraser rightEraser; 
		
		
		rightEraser = new Eraser(3.5 , 12.0 , 5.5 , 3, "흰색"); 
		leftEraser = new Eraser();
		
		// 1 두지우개 초기 상태 출력 
		rightEraser.print(); 
		leftEraser.print();
		
		// 2.오른쪽 지우개에 한 겹 제거  
		rightEraser.peel();
		System.out.println("--------------------\n");
		// 3. 두 지우개 상태 출력 
		rightEraser.print(); 
		leftEraser.print();
		
		// 4.왼쪽 오른쪽 지우개 한 겹 제거 
		rightEraser.peel();
		leftEraser.peel();
		System.out.println("--------------------\n");
		//5.왼쪽 지우개로 칠판 지우기 
		leftEraser.eraser();
		
		//6.두 지우개 상태 출력 
		rightEraser.print(); 
		leftEraser.print();
		
	}

}
