package array.basic;

/*
 
 boolean, int , double , String 타입의 크기 5 
 각배열의 원소가 초기호 된 값을 확인한다
 
 * */

public class MultiTypeArrayInit {

	public static void main(String[] args) {

		//각 배열의 크기를 지정하는 상수 
		final int SIZE =5; 
		
		boolean[] flags = new boolean[SIZE]; 
		int[] ages = new int[SIZE]; 
		double[] hights = new double[SIZE]; 
		String[] names = new String[SIZE];
		
		System.out.println("(1)  boolean 배열 출력"); 
		for(boolean flag: flags) { 
			System.out.printf("flag = %2b\n" , flag );
		} 
		System.out.println("");
		
		System.out.println("(2) int 배열 출력"); 
		for(int age: ages) { 
			System.out.printf("age = %2d\n" , age);
		}
		System.out.println("");
		
		System.out.println("(3)  double"); 
		for(double hight: hights) { 
			System.out.printf("hight = %.2f\n" , hight);
		}
		System.out.println("");
		
		System.out.println("(4)  String 배열 출력"); 
		for(String name : names) { 
			System.out.printf("name = %2s\n" , name);
		}
		System.out.println("");
		
	}

}
