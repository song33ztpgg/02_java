package test;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.List;

import java.util.Set;

public class test {

	public static void main(String[] args) {


		List list; 
		list = new ArrayList(); 
		Set set;
		set = new HashSet();
		
		System.out.println(list);
		System.out.println(set); 
		
		System.out.println("\n1번째");
		System.out.printf("List =>");
		System.out.println(list.add("숫자"));
		System.out.printf("Set =>");
		System.out.println(set.add("숫자")); 
		System.out.println("list은 :" +list);
		System.out.println("set은 :" +set); 
		
		
		
		
		System.out.println("\n2번째");
		System.out.printf("List =>");
		System.out.println(list.add("숫자"));
		System.out.printf("Set =>");
		System.out.println(set.add("숫자")); 
		System.out.println("set은 :" +set);
		System.out.println("list은 :" +list);
		System.out.println("set은 :" +set); 
		
		System.out.println("\n3번째");
		System.out.printf("List =>");
		System.out.println(list.add("숫자"));
		System.out.printf("Set =>");
		System.out.println(set.add("숫자"));
		System.out.println("set은 :" +set);
		System.out.println("list은 :" +list);
		
		test2 t = new test2("안녕"); 
		
		System.out.println("\n4번째 Add");
		System.out.println("set.add(t) :" +set.add(t)); 
		
		System.out.println("list은 :" +list);
		System.out.println("set은 :" +set); 
		
		for(int idx = 0 ; idx < 10; idx ++) { 
		}
		
		
		
	}

}
