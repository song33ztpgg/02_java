package game2;


public class GameTest {

	public static void main(String[] args) {

		GameMC mc = new GameMC(); 
		GameChar[] ch = new GameChar[3];
		
		GameChar pr = new GameChar();
		
		GameChar sombr; 
		GameChar emp; 
		GameChar hack;
		
		sombr = new GameChar(200,6,"sombra");
		emp  = new GameChar(1500,6,"All hack");
		hack = new GameChar(8,5, "sombra");
		
//		sombr.print(sombr);
		
		GameChar test = new GameChar();
		
		
		mc.add(sombr); 
		mc.add(emp); 
		mc.add(hack);		
				
		

	}

}
