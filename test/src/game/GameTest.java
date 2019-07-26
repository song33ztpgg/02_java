package game;

public class GameTest {

	public static void main(String[] args) {
		
		GameManager game = new GameManager(); 
		//GameChar[] ch = new GameChar[2];
		
		GameChar tracer; 
		GameChar emp;
		
		tracer = new GameChar(10,20,"a"); 
		emp = new GameChar(33,71,"n");
		

		game.damage(tracer);
	
			
	}

}
