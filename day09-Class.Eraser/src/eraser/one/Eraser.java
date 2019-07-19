package eraser.one;

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
	String coler;	

	 Eraser(){
		 
	 }

//	 Eraser() {
//			width = 0.0;
//			height = 0.0;
//			depth = 0.0;
//			layer = 0;
//			color = null;
//		}
//
//		// (2) 매개변수가 있는 생성자 : 
//		//     다섯개의 매개변수를 모두 받는다.
//		
//	  Eraser(double width, double height, double depth, int layer, String color) {
//		
//			this.width = width;
//			this.height = height;
//			this.depth = depth;
//			this.layer = layer;
//			this.color = color;
//		}
	 
	 
	  // (2) 매개변수가 있는 생성자 :
	Eraser(double newWidth, double newHeigth, double newDepth, int newLayer, String newColer){
	    width = newWidth;
	    heigth = newHeigth;
	    depth = newDepth; 
	    layer = newLayer;
	    coler = newColer;
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
		
		System.out.printf("가로 :%4.2f 세로 :%4.2f 높이 :%4.2f 겹 :%d 색상 : %s \n", width, heigth , depth , layer, coler);
		
	}
		
	
	   

	 
	
	
	
	
	
}





