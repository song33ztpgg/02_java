package array.multi;
/*
 * 수학의 행렬을 나타 낼수 있는 
 * 2차원 배열을 선언하고 초기화 후 출력해보는 클래스
 * */
public class Matrix {

	public static void main(String[] args) {
		
		int[][] matrix = { 
				{1, 2, 3}, 
				{4, 5, 6}, 
				{7, 8, 9}, 
				{10,11,12}
		}; 
		
		
		// matrix[2]   
		// 7,8,9  =  3가지 길이 
		for(int num = 0; num < matrix.length; num++) { 
			for (int num2 = 0 ;num2 < matrix[num].length; num2++) {
				System.out.printf("[%d] [%d] = %d\t", num, num2, matrix[num][num2]);
			}  
			System.out.println("");
		}
		 
		
		
		for(int[] num3 : matrix) { 
			for(int num4 : num3) { 
				System.out.printf(" %2d  ", num4);
				//System.out.printf("%d %d= %d\t", num3, num4, num4); 
			} 
			System.out.println();
		}
		
	}

}
