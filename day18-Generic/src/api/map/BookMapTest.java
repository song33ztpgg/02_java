package api.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set; 



/**
 * key :Integer 
 * value : Book 

 * */
public class BookMapTest {

	public static void main(String[] args) {

		Map<Integer, Book> map;
		map = new HashMap<>();
		
		
		Book a = new Book();
		
		Book vegetarian = new Book(1, "9788936433598", "채식주의자", "한강", "창비", 247, 10800, 10);
		Book littlePrince = new Book(2, "9791159039690", "어린왕자(초판본)", "생텍쥐페리", "더스토리", 150, 8820, 5);
		Book noDaap = new Book(3, "9791190182645", "제 인생에 답이 없어요", "선바", "위즈덤하우스", 192, 10800, 3);
		Book dduk = new Book(4, "9791196394509", "죽고 싶지만 떡볶이는 먹고 싶어", "백세희", "흔", 208, 12420, 2); 
		Book ax = new Book(5, "9788956055466", "책은 도끼다", "박웅현", "북하우스", 348, 14400, 2);
		
		
		map.put(1,vegetarian); 
		map.put(2,littlePrince); 
		map.put(3,noDaap); 
		map.put(4,dduk); 
		map.put(5,ax);
		
		Set keys = map.keySet();
		
		for(Object key : keys) { 
			System.out.printf("key = %s , valuse = %s \n" , key.toString(), map.get(key).toString() );
		}
		
		
		Set key2 = map.keySet(); 
		for(Object key : key2) { 
			System.out.println(a.getPrice() * 0.9);
		}
		
		
		
		//10% 가격다운 
		
	}

}
