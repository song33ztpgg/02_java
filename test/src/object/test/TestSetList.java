package object.test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestSetList {

	public static void main(String[] args) {

		Set set; 
		List list; 
		
		set = new HashSet(); 
		list = new ArrayList(); 
		
//		 Book(String title , int price , int totalPage) { 
		
		
		Book book = new Book("실행" , 1000 , 100); 
		System.out.println();
		
		System.out.println("[Set에 관하여]"); 
		
		String name2 = "안녕";
//		System.out.println(set.add("글자"));
//		System.out.println("set 결과 : " +set);
//		
//		System.out.println(set.add(new Double(3.0)));
//		System.out.println("set 결과 : " +set); 
		
		System.out.println(set.add(1.0));
		System.out.println(set.add(1));
		System.out.println(set.add(1)); 
		System.out.println(set.add(true));
		System.out.println(set.add("글자"));
		System.out.println(set.add(book));
		System.out.println("set 결과 : " +set); 

		System.out.println();
		System.out.println("[list에 관하여]");
		System.out.println(list.add(1.0));
		System.out.println(list.add(1));
		System.out.println(list.add(1));
		System.out.println(list.add(true));
		System.out.println(list.add("글자"));
		System.out.println(list.add(book));
		System.out.println("list 결과 : " +list);
		
		
		
		
	}

}
