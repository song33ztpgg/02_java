package game;

public class GameManager {

	GameChar[] game; 
	
	GameManager() { 
		game = new GameChar[0];
	} 
	
	GameManager(GameChar[] game) { 
		this.game = game;
	}
	
//■■■■■■■■■■■■■■■■■■■■■■■ 매소드 ■■■■■■■■■■■■■■■■■■■■■■■//
	public void damage(GameChar game) { 
		for(int i = 0; i < 10 ; i++) { 
			charAdd(game);
		}
		
	}
	
//	public void charAdd(GameChar game) { 
//		System.out.println(game.hp);
//	}
//	
	public void charAdd(GameChar game) { 
		System.out.println(game.hp);
	}
	
	
}
