package api.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 데이터를 Key Value 를 쌍으로 저장하는 자료구조인 
 *	Map을 테스트 하는 클래스 
 *	key : 중복을 허용하지 않음 
 *  value : 중복을 허용  
 *  
 *  Key , Value 는 반드시 한 쌍으로만 취급할 수 있음 
 *  Key 없는 Value 를 만들수 없음 
 *  Key 없이 Value 를 찾을수 없음
 *
 * key, Value에 모든  (참조)타입의 데이터 저장 가능 
 *  
 * 
 * 
 * */

public class MapTest {

	public static void main(String[] args) {
	//1.map 인터페이스 타입 변ㅅ ㅜ
		Map map; 
		
	//2.초기화 HashMap(); 
		map = new HashMap(); 
		
	//3.사용
	//3.1 Map 에 데이터 추가 put(Key,Value);
	
	map.put("1", "안녕하세요"); 
	// key : Integer , value : String  
	map.put(new Integer(2), "반가워요"); 
	//key : character valuse : String 
	map.put('3',"날씨"); 
	//double String 
	map.put(4.0, "덥다"); 
	//boolean  Book 
	map.put(true, new Book());
	map.put(true, 33333);
	map.put(true, 32123);
	map.put(false, new Book(5)); 
	
	//3.2 map 데이터 추출 
	// get(K);
	System.out.println(map.get("1")); 
	System.out.println(map.get(2)); 
	System.out.println(map.get('3'));
	System.out.println(map.get(4.0)); 
	System.out.println(map.get(true));
	System.out.println(map.get(false));
	//auto - boxing , equlas() , hashCode() , toString 결과
	
	System.out.println("--------------------------");
	//3.3 Map의 데이터 추출 : 전체 데이터 추출 
	//	  foreach로 key 꾸러미를 먼저 얻어냐야 함 
	//	  key 꾸러미를먼저 얻어내야 함 (key 는 set의 능력을 가지고 있다) 	
	// set keys 안에는 
	Set keys = map.keySet(); 
	// 얻어진 key 꾸러미가 set 이기때문에 이 key에 forecah를 적용
	
	for(Object key : keys) { 
//		System.out.println(map.get(key));
		System.out.printf("key =%s  / valuse : %s%n" , key.toString(), map.get(key).toString());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
