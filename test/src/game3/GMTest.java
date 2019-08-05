package game3;


public class GMTest {

	public static void main(String[] args) {
		GM[] test1 = new GM[3]; 

		
		test1[0] = new GameCoolTime(8);
		test1[1] = new GameHP(200); 
		test1[2] = new GameName("som");
		
	
		for(GM p : test1) {
			p.print();
		}
		
	}
}
