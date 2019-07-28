package game2;

public class GameMC {

	GameChar[] gameCS; 
	GameChar x = new GameChar();
	
	public GameMC(){ 
		gameCS = new GameChar[1];
	}
	
	public GameMC(GameChar[] gameCS){ 
		this();
		this.gameCS = gameCS;
	}
	
	public void add(GameChar game) { 
		GameChar[] newGames = new GameChar[gameCS.length + 1]; 
		
		for(int idx = 0 ; idx < gameCS.length ; idx++) { 
			newGames[idx] = gameCS[idx];
			game.print(gameCS[idx]);
		} 
	}
	
	
	
}
