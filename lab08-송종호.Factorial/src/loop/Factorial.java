package loop;
/**
 * 팩토리얼을 개산하는 클래스 
 * 
 * @author Administrator
 *
 */
public class Factorial {
	// + factorial( int n) : int 
	int factorial = 1; 
	
	public int calculator(int input){ 
		
		int result = factorial;
		
		for(int idx = 1; idx < input +1 ; idx++) {
			
			result *= idx;
			System.out.printf("%d ",idx);
			
			if(idx < input) {
				System.out.printf(" * "); 
			}
		}
		
		System.out.printf(" = ");
		return result;
	} 
	
	public int calculator2(int input){
	
		int result = factorial;
		
		for(int idx = input; idx > 1; idx--) {
			result *= idx; 
		}
		
		return result;
		
	} 
	
}
