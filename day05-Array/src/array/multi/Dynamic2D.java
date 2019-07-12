package array.multi;

public class Dynamic2D {

	public static void main(String[] args) {

		int[][] twoDArray; 
		int count = 0; 
		
		twoDArray = new int[4][]; 
		// 여기서 초기화를 하지 않으면 null 값을 얻게 된다. 
		twoDArray[0] = new int[3];
		twoDArray[1] = new int[4];
		twoDArray[2] = new int[1];
		twoDArray[3] = new int[5]; 
		
		for(int[] Arr : twoDArray) { 
			System.out.println("darray =" +Arr);
		}
		
		for(int idx = 0; idx < twoDArray.length; idx ++) { 
			for(int ind =0; ind <twoDArray[idx].length; ind++) { 
				twoDArray[idx][ind] = ++count;
			}
		} 
		
		for(int[] array : twoDArray) { 
			for(int num : array) { 
				System.out.printf("%d\t", num);
			} 
			System.out.println();
		}
		
		
	}

}
