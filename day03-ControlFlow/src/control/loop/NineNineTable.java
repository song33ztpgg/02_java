package control.loop;

public class NineNineTable {

	public static void main(String[] args) {

		
		
		for(int stage = 2; stage < 10; stage ++) { 
			for(int times = 0; times < 10 ; times++ ) { 
				System.out.printf("%2d * %2d = %2d\n", stage, times , (stage * times));
			} 
			
			System.out.println("------------------------------------");
		}
	}

}
