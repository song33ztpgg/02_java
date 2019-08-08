package clock;

public class Test {

	public static void main(String[] args) {

		
//		OverWatch tank = new OverWatch();   
		OverWatch[] game = new OverWatch[2];   
		
		game[0] = new GameChar(); 
		game[0].sethp(10);
		game[0].setName("sigma"); 
		
		for(OverWatch set : game) { 
			set.start();
			System.out.println("끝");
		}
		System.out.println("끝");

		//		tank.setName("sigma"); 
		
	}

}
