package test;
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

public class DataPair<V, K> {

	V value; 
	K key; 
	
	public DataPair() {
		
	}
	
	public DataPair(V value, K key) {
		this(); 
		this.value = value; 
		this.key = key;
	}
	
	public V getValue() { 
		return value; 
	} 
	
	public void setValue() {
		this.value = value;
	}
	
	public K getKey() { 
		return key; 
	} 
	
	public void setKey() {
		this.key = key;
	} 
	
	
	
	
	
	
}
