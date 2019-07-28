package game3;

public class GameTest {

	public static void main(String[] args) {
		
	GameChar[] Gchar = new GameChar[0]; 
	GameManager Gman = new GameManager(); 
	
	GameChar emp; 
	emp = new GameChar(25,6,"emp"); 
	GameChar hack = new GameChar(5,8,"hack" );
	GameChar som = new GameChar(200,5, "som");
	
	Gman.add(emp);
	Gman.add(hack);
	Gman.add(som);
	
	}
}