package game;

public class GameTest {

	public static void main(String[] args) {
		
		GameServer tank = new GameServer(); 
		GameServer support; 
		
		
		tank.setHp(400); 
		tank.setMp(1); 
		tank.setName ("sigma"); 
		tank.setCoolTime(100);
		
		
//		tank = new GameServer(400, 1, "sigma", 13.5); 
//		support = new GameServer(200, 2, "mercy", 15.0); 
		
		
		
		
		tank.print(); 
//		support.print(); 
		
		tank.sell(10); 
		
		
		
	}

}
