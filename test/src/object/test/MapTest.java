package object.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {

		
		Map map = new HashMap(); 
		
		Book book = new Book("책",39800,200);
		
		map.put(1, "1번째 글짜"); 
		map.put(2, 12345); 
		map.put(3, true);
		System.out.println(map);
	
		System.out.println(map.get(1));
	}

}
