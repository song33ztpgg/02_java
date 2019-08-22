package sequence;

public class ArithProgression2 {

		//계산을 하는 매소드 
		public int sequence(int index) { 
			
			
			

			for (int a = index; a > 0; a--) { 
				System.out.printf(" ");
				sequence(index - 1);
			}
			
			
			return 0;
		}
		
}
