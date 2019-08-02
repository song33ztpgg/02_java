package point;

public class PointTest2 {

	public static void main(String[] args) {
		//1.Point 배열 선언 + 2.초기화
		/**
		 * points 3칸 배열 가리킴 
		 * 1칸당 Point 형식을 가짐
		 * */
		Point[] points = {	new Point(10,1)
						  , new Point(3,4)
						  , new NamedPoint("0",0,0)
						  };  
		 
		
		
	
		//3.사용 
		
		for(Point point : points) {  
			System.out.println(point);
			System.out.println(point.toString()); 
			//같은 방식  
			//가상메소드 방식
			
			// 그러나 단순 point를 출력해도 같은 결과를 받는 이유 
			//1.toString() 매소드는 print() 계열 메소드에서 객체 참조변수를 출력할 때 
			// 자동으로 작동하는 특징을 가지고 있따. 
			
			//2.toString()은 Object 에서 부터 물려받은 메소드로 
			// 모든 서브 클래스 들이 가지고 있으며 
			// 재정의 된 경우에는 해당 인스턴스 타입에 맞추어 부모클래스에 정의된 메소드로 
			// 호출을 해도 인스턴스 타입의 재정의된 메소드가 자동으로 응답 
			// => 가상 메소드 호출 
			
		//다음 점과의 거리를 구해서 출력
		for(int idx = 0; idx < points.length -1; idx++) { 
			System.out.printf("두점 points[%d] , points[%d] 사이의 거리 :  %.2f%n"
								 ,idx,idx +1 , points[idx].distanceFrom(points[idx +1]));
		} 
		
		
		for(int idx = 0; idx < points.length -1; idx++) { 
			System.out.printf("두점 points[%s] , points[%s] 사이의 거리 :  %.2f%n"
								,points[idx].toString()
								,points[idx +1].toString() 
								,points[idx].distanceFrom(points[idx +1]));
		}
		
		
		}
		
	}

}
