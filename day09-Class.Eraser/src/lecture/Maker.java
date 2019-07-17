package lecture;

public class Maker {

	int persent = 100 ; 
	boolean isOpen =true; 
	boolean isNew;
	String color = "빨강"; 
	int count = 0;
	
	Maker(){ 
		
	}  
	
	
	Maker(int persent) { 
		System.out.printf("%d", persent);
	}
	
	Maker(boolean isOpen){ 
		this(); 
		this.isOpen = isOpen;
	} 
	
	Maker(boolean isOpen, boolean isNew) { 
		this(isOpen); 
		this.isNew = isNew;
	}  
	
	Maker(boolean isOpen, boolean isNew , String color) { 
		this(isOpen,isNew);  
		this.color = color;
	}  
	
	
	public void isOpenInfo(/*boolean isOpen*/) { 
		
		if(isOpen == true) { 
			System.out.println("열렸습니다"); 
			//isOpen = false;
		} else { 
			System.out.println("닫혔습니다"); 
			//isOpen = true;
		} 
	} 
	
	public void isNewInfo() {
		if(count == 0) { 
			System.out.println("새것입니다"); 
		} else { 
			System.out.println("새것이 아닙니다"); 
			System.out.printf("잔량은 %d%% 입니다\n", persent - count);
		}
	} 
	
	public void colorInfo(String color) { 
		System.out.printf("%s" , color);	
	} 
	 
	
	public void print() { 
		String message = "마커 색상 %s %s %s"; 
		String openStatus; 
		String newStatus; 
		
		if(isOpen) { 
			openStatus = "뚜껑 열려 있습니다"; 
		} else { 
			openStatus = "뚜껑 닫혀 있습니다";
		} 
		
		if(isNew) { 
			newStatus = " 새 마커입니다"; 
		} else { 
			newStatus = "다 쓴 마커입니다 ";
		} 
		System.out.printf(message, color, openStatus, newStatus);
	}
	
	public void use() {
		System.out.printf("%s색의 마커를 "
				       + "사용하고 있습니다.%n", color);
	}
	
	
//	public void test() { 
//		System.out.printf("%d", persent);
//	};
//	
//	public void test2() { 
//		System.out.printf("%d",color);
//	}
	
	
	
	
	
	
	
	
	
	
	
}
