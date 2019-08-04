package generic.definition.getinstance;
/**
 * Generic 사용시점 : <> 안에 모든 참조형 타입명이 들어갈 수 있음 
 * 
 * Generic 정의시점 : 
 * -----자주사용-----
 * <E> : Element :컬렉션에 저장된 엘리먼트의 타입 
 * <K> : Key	 : K로 지정된 것이 key의 역할을 할 때 지정하는 타입
 * <V> : Value	 : V로 지정된 것이 value의 역할 을 때 
 * <T> : Type	 : 전체적으로 리턴될 타입을 지정할 때 사용
 * 
 * <N> : Number	 : 저장될 타입이 숫자형일 때 자세한 지정을 위해 사용 
 * <S> : 
 * 
 * ============================= 
 * 
 * 데이터를 저장할 때 key , value 를 쌍으로 저장하는 클래스 
 * 
 * 
 * 
 * @author 304
 * */

public class DataPair<K ,V> {
	
	//1.변수 선언
	/** 
	 * 데이터 저장시 키의 역할을 하는 맴버변수 선언 
	 * 이때 변수의 타입이 무엇이든지 될 수 있도록 하려면 
	 * Generic 을 주어야 한다 
	 * 우리는 키로 사용된다는 의미로 K로 지정
	 */
	private K key; 
	
	/** 
	 * 데이터 저장시 값의 역할을 하는 멤버변수 선언 
	 * 값을 사용된다는 의미로 타입을 V로 지정 
	 */
	private V value;

	//2.생성자 선언부
	//2.1 기본생성자 
	private DataPair(){ 
		
	} 
	
	
	private DataPair(K key , V value) { 
		this(); 
		this.key = key; 
		this.value = value;
	} 
	
	//3. 메소드 선언부 
	//3.1 접근자 수정자  
	public K getPairKey() { 
		return this.key;
	}
	
	public <V> V getPairValue(K key) { 
		return (V) this.value;
	}
	
	public K getKey() { 
		return this.key;
	}
	
	public void setKey(K key) { 
		this.key = key;
	}
	
	public V getValue() { 
		return this.value;
	}
	
	public void setValue(V value){ 
		this.value = value;
	} 
	
	//3.2 이클래스 타입의 인스턴스를 리턴하는 
	// static 메소드 getInstance() 작성
	
	
	
	
			       //┌ 메소드 안에 K,V가 사용된다               
	public static <K, V> DataPair<K, V> getInstance(K key, V value) {
									//└리턴타입 K,V
		
		//getInstance() 메소드 내부에서 
		//private 생성자 호출이 일어남
		return new DataPair<>(key, value);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
