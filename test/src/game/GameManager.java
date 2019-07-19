package game;

public class GameManager {

	GameChar[] game= new GameChar[0]; 
	
//	GameManager() {
//		game = new GameChar[3];
//	} 
	
	public void damage() { 
		for(int i = 0; i < 10 ; i++) { 
			System.out.println(game.length +i);	
		}
		
	}
	
}
