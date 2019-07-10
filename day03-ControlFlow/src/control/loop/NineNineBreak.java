package control.loop;

public class NineNineBreak {

	public static void main(String[] args) {
	
	
		int z=0;
		OUT :for(int i=2; i<9; i++) { 
			for(int j=2; j<=1; j++) {
				System.out.printf("%2d X %2d = %2d\n",j,i,(i*j)); 
				
				if(i*j > 50) { 
					break OUT;
				}
				
				
			}
		}
	}

}
