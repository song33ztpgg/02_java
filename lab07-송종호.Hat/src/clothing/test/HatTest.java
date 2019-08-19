package clothing.test;

import java.util.ArrayList;
import java.util.List;
import clothing.Hat;

public class HatTest {

	public static void main(String[] args) {
//		String hatId, String type, String material, double size, String color, double price ,int quantitym,char gender
//		메인 메소드 내에 Hat 객체를 3개 생성
		//Hat cap = new Hat(......); // type을 "야구모자"로 생성, hatId: HT001, 나머지 필드는 적당히
		//Hat fedora = new Hat(....);// type을 "페도라"로 생성  , hatId: HT002, 나머지 필드는 적당히
		//Hat sunCap = new Hat(....);// type을 "썬캡" 으로 생성 , hatId: HT003, 나머지 필드는 적당히
		Hat cap = new Hat("ht001" ,"야구모자", " 가죽" , 52 , "black" , 13500, 10 , 'M'); 
		Hat fedora = new Hat("ht002" ,"페도라", "천" , 60 , "yello" , 25000, 20 , 'F');
		Hat sunCap = new Hat("ht003" ,"썬캡", "플라스틱" , 58, "red" , 8000, 30, 'F'); 
		
		List<Hat> hats = new ArrayList<Hat>(); 
		hats.add(cap); 
		hats.add(fedora); 
		hats.add(sunCap);
		
		for(Hat hat : hats) { 
			System.out.println(hat);
		}
		
		
	}

}
