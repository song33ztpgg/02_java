package point;
/**
 * 
 * 
 * */
public class PointTest {

	public static void main(String[] args) {
		//1.변수선언 
		Point p; 
		Point q; 
		Point o; 
		
		//NamePoint o 를 사용했어야 했지만 
		
		Point[] points = new Point[2];
		
		//2.초기회 
		p = new Point(0, 0);
		q = new Point(3, 4); 
		o = new NamedPoint("o",0,0); // 특별하게 이름을 지었음 
		
		points[0] = new Point(0,0);
		points[1] = new Point(3,4); 
		
		//3.사용 
		
		//3.1 점 p 출력 
		System.out.println("점 p : " +p);
		
		//3.2 점 q 출력 
		System.out.println("점 q : " +q);
		
		//3.3 두 점 사이의 거리를 계산
		System.out.println("두점사이의 거리 : " +p.distanceFrom(q)); 
		
		
		System.out.println("------------------------------------------");
		//3.4 점 o 출력 
		System.out.println("점 o : " +o);  
		//타입이 Point (int, int) 였지만 결과는 (String , int ,int ) 결과도 포함되어서 나왔다. 
		//가지고 있는 인스턴스의 형식을 보고 그에 맞는 매소드를 실행을 하는 것
		
		
		//3.5 이름이 붙은 원점과 점 q의 거리 계산 
		System.out.printf("원범과 점q의 거리 : %f%n" , o.distanceFrom(q));
		
	}

}
