package test;

public class test2 {

	int hp; 
	int mp;
	String name; 
	
	
	public test2(){ 
		
	} 
	
	public test2(String name){ 
		this(); 
		this.name = name;
	}
	
	public String getName(){ 
		return name;
	}
	
	public void print(){ 
//		System.out.printf(" " +hp);
//		System.out.printf(" " +mp);
		System.out.printf(" " +name); 
		System.out.println();
		System.out.println("--------");
	}
	
	
}
