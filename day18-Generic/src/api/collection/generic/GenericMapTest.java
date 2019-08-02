package api.collection.generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import api.map.Book;

/**
 * 데이터를 Key ,Value 쌍으로 저장하는 구조인 
 * Map  인터페이스에서  
 * Key ,Value 양쪽 모두 Generic을 적용하는 테스트
 * 
 * */
public class GenericMapTest {

	public static void main(String[] args) {

		//1.선언 : Key :Integer , Value :String 
		Map<Integer, String> map; 
		
		//2.초기화 HashMap중 key :Integer, Value : String 
		map = new HashMap<>(); // HashMap<Integer, String>();
		
		//3. 사용 
		//3.1 데이터 추가 : put 데이터 추출  
		map.put(1, "안녕하세요"); 
		// key : Integer , value : String  
		map.put(new Integer(2), "반가워요"); 
		//key : character valuse : String 
		map.put(3,"날씨"); 
		//double String 
		map.put(4, "덥다"); 
		//boolean  Book 
		map.put(5, new Book().getTitle());
		map.put(6, new Book(5).getAuthor()); 

//		map.put(true, 33333);
//		map.put(true, 32123); 
		Set<Integer> keys = map.keySet();
		
		for(int key : keys) { 
//			System.out.println(map.get(key));
			System.out.printf("key =%d  / valuse : %s%n" , key ,map.get(key));
	}

}	 
}
