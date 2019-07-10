package control.loop;

public class NineNineTable2 {

	public static void main(String[] args) {
		
			
		int front = 2;
		
		for(int k = 2 ; k < 10 ; k+=3) {		
			
			if((k+2) == 10) {
			System.out.printf("%2d단 %11d단\n", k,k+1);
			} else { 
				System.out.printf("%2d단 %11d단 %11d단\n", k,k+1,k+2);
			}
			
			
		for(int j =1;j <= 9;j++) {		
			for(int i = 0; i < 3 ; i++) {
				if((front +i)!=10) {
				System.out.printf("%2d X %d = %2d   ",front+i,j,(front+i) * j); 
				}	
			}  
		System.out.println("");
		} 
		
		front +=3;  
		System.out.println("");
		}
		
	}
		
		
		
	}


