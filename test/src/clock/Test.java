package clock;

public class Test {

	public static void main(String[] args) {

		
//		OverWatch tank = new OverWatch();   
		OverWatch[] game = new OverWatch[2];   
		
		game[0] = new GameChar(); 
		game[0].sethp(100);
		game[0].setName("sigma");   
		game[1] = new GameChar2(); 
		game[1].setName("dva"); 
		game[1].sethp(600); 
		
		
		
		for(OverWatch set : game) { 
			set.start();
		}

		
	}

}
