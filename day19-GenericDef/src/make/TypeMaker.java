package make;

public class TypeMaker<K> { 
	
	private K key; 
	
	private TypeMaker() { 
		
	}

	private TypeMaker(K key) { 
		this(); 
		this.key = key; 
	}
	
	
	public K getKey() { 
		return key;
	} 
	
	public void print() { 
		System.out.println(key);
	} 
	
	public static <K> TypeMaker<K> test(int value){ 
		return new TypeMaker<Integer>;
	}
	
}
