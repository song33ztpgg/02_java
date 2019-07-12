package array.basic;

/*
 * 참조형 타입인 String 타입인 배열 emps 를 
 * 초기화 목록을 사용하여 초기화 하고  
 * 내용을 출력해보는 테스트 클래스
 * */

public class StringArrayInitList {

	public static void main(String[] args) {

		String[] students = {"정하은","최현정","김지후","정현수"}; 
		
		for(String name : students) 
		{ 
			System.out.printf("학생의 이름은 : %3s 입니다\n", name);
		} 
		
		System.out.println("");
		
		for(int idx =0; idx < students.length ; idx++) { 
			System.out.printf("학생의 이름은 : %s 입니다\n", students[idx]);
		} 
		 
		
		int[][] num  = new int[10][10]; 
		
		
		for(int i = 0; i < num.length; i++) { 
			for(int j = 0; j < num.length; j++) { 
				 
				System.out.println(+num[i][j]);
				
				
			} 
			System.out.println(+i);
		}
		
	}

}
