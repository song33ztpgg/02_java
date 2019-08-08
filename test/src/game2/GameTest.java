package game2;

public class GameTest {

	public static void main(String[] args) {

		
		GameServer attack; 
		GameServer tank;
		GameChar support;
		
		attack = new GameServer("a"); 
		tank = new GameServer("b"); 
		support = new GameChar(10,20,"c");
		
		
		GameServer test = new GameServer(); 
		
		System.out.println(attack); 
		System.out.println(tank); 
		System.out.println(support);
		

	}

}
