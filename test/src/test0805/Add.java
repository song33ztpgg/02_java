package test0805;

public class Add {

	int number; 
	AddExcption ad = new AddExcption();
	
	public Add() { 
		
	} 
	
	public int result(int num) throws AddExcption { 
	
		switch(num) { 
		case 0: 
			System.out.println(ad.toString()); 
		default : 
			break;
		}
		
//		 int result2 = 100/num ; 
//		 return result2;
		return 0;
	}
	
}
