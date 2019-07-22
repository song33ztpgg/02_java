package school;

public abstract class Person {

	String id; 
	String name; 
	int age; 
	
	Person(){
	
	} 
	
	Person(String id){
		this(); 
		this.id = id;
	}  
	
	Person(String id, String name){
		this(id); 
		this.name = name;
	}   
	
	Person(String id, String name, int age){
		this(id,name); 
		this.age = age;
	} 
	
	public String setId(){ 
		return id;
	}
	
	public void getId(){ 
		this.id  = id;
	}
	
	public String setName(){ 
		return name;
	}
	
	public void getName(){ 
		this.name  = name;
	}
	
	public int setAge(){
		return age;
	}
	
	public void getAge(){ 
		this.age  = age;
	}
	
	
	
}
