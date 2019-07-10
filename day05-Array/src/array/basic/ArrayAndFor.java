package array.basic;

public class ArrayAndFor {

	public static void main(String[] args) {

		
		int[] numbers; 
		numbers = new int[10];
		int sumary = 0;
		
		
		for(int idx = 0; idx < 10; idx++) 
		{ 
			numbers[idx] = (idx + 1) * 10; 
			sumary += numbers[idx]; 
		}  
		
		System.out.println("총합은 " + sumary + " 입니다");
		}

}
