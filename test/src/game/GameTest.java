package game;

public class GameTest {

	public static void main(String[] args) {

		GameCCC[] game = new GameCCC[2]; 
		game[0] = new GameChar1(); 
		game[0].setName("test"); 
		game[0].setHp(10); 
		game[1] = new GameChar2(); 
		game[1].setName("테스트"); 
		game[1].setHp(200); 
		
		System.out.println("1번째");
		for(GameCCC play : game) { 
			play.print();
		} 
		
		GameManager test1 = new GameChar1(); 
		GameManager test2 = new GameChar2();
		GameManager[] test = new GameManager[2];
		
		test[0] = test1; 
		test[1] = test2;
		
		
		System.out.println("2번째");
		for(GameManager play : test) { 
			play.test();
		} 
		
		
		
	}

}
