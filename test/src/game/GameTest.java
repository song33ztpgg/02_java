package game;

public class GameTest {

	public static void main(String[] args) {
		
		GameManager game; 
		GameChar ch;
		ch = new GameChar();
		
		GameChar tracer; 
		GameChar emp;
		tracer = new GameChar(10,20,"a"); 
		emp = new GameChar(33,71,"n");
		
		ch.chartest();
			
	}

}
