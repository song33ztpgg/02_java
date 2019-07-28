package game3;

public class GameManager {

	
	GameChar[] gameChaters; 
	GameChar test;
	public GameManager() {
	
		gameChaters = new GameChar[1];
	}
	
	public GameManager(GameChar[] GameChaters) { 
		this(); 
		this.gameChaters = gameChaters;
	}
	
	
	public void add(GameChar infomation) { 
		GameChar[] newGame = new GameChar[gameChaters.length +1]; 
		int count = 0;
		for(int idx = 0; idx < gameChaters.length ; idx++) { 	
			newGame[idx] = gameChaters[idx]; 
			count = idx;
		}  
		newGame[count + 1] = infomation; 
		GameChar test2 = newGame[count +1]; 
		
		test.print(test2);
		
		
	}
	
	
	
}
	

