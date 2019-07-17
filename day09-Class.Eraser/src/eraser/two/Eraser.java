package eraser.two;

/*
 * 칠판지우개 정의 
 * 가로 : width 
 * 새로 : height 
 * 높이 : depth
 * 겹	: layer
 * 색상 : color 
 * 
 * 생성자 : 중복정의
 * 기본 생성자 명시
 * 매개변수를 받는 생성자 : 모든 필드(가로~ 색상)를 다 받도록 정의 
 *  
 * 기능 :매소드로 생성 
 * 칠판지우기: erase() : void 
 * 한겹씩 제거 : peel() : void 
 * 				
 * */
public class Eraser { 
	
	double width;
	double heigth;
	double depth;
	int layer;
	String color;	

	/**
	 * 지우개 클래스의 기본 생서아 
	 * 각 멤버변수 필드를 타입의 기본값으로 초기화 진행 
	 *  
	 * */ 
	
	 Eraser(){
	 }

	Eraser(double width) { 
		// 34줄 기본 생성자호출 
		// 매개변수가 ㅁ비어 있는 this() 이므로
		this(); 
		//width 필드는 매개변수로 넘겨진 값으로 초기화
		this.width = width;
	} 
	
	Eraser(double width, double hight){ 
		this(width); 
		this.heigth = hight;
	}
	
	/**
	 * 지우개의 가로 새로 높이 필드를 초기화 하는 생성자 
	 * 가로길이 - > 매개변수 2개 받는 생성자로 초기화 
	 * 새로길이 -> 매개변수 2개 받는 생성자로 초기화 
	 * 높이 -> 직접 초기화
	 * */
	
	Eraser(double width, double height, double  depth) { 
		this(width, height); 
		this.depth = depth;
	}
	
	/**
	 * 지우개의 가로 새로 높이 필드를 초기화 하는 생성자 
	 * 가로길이 - > 매개변수 2개 받는 생성자로 초기화 
	 * 새로길이 -> 매개변수 2개 받는 생성자로 초기화 
	 * 높이 -> 직접 초기화
	 * */
	Eraser(double width, double height, double depth,int layer) { 
		this(width, height,height); 
		this.layer = layer;
	}
	
	//모든것 초기화 
	Eraser(double width, double height, double depth,int layer,String color){ 
		this(width, height,height,layer); 
		this.color = color;
	}
	
	
	
	public void eraser(){ 
		System.out.println("칠판을 지웠습니다\n");
	}
	
	public void peel() { 
		if(layer - 1 >= 0){  
			layer--;
			System.out.printf("현재 남은 겹 : %d\n", layer);
		} else { 
			System.out.println("남아 있는게 없습니다\n");
		} 
	}
		
		
	public void print() { 
//		System.out.printf("지우개의 가로 : %4.2f\n",width );
//		System.out.printf("지우개의 새로 : %4.2f\n",heigth );
//		System.out.printf("지우개의 높이 : %4.2f\n",depth );
//		System.out.printf("지우개의 겹	 : %d\n", layer );
//		System.out.printf("지우개의 색상 : %s\n",coler ); 
		
		System.out.printf("가로 :%4.2f 세로 :%4.2f 높이 :%4.2f 겹 :%d 색상 : %s \n", width, heigth , depth , layer, color);
		
	}
		
	
	   

	 
	
	
	
	
	
}





