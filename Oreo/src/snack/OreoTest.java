package snack;

/**
 * Oreo 쿠키가 3개 들어있는 oreoBox 라는 변수를
 * Oreo 배열타입으로 선언하고
 * 
 * oreoBox[0] ~ [2] Oreo 쿠키를 입력
 * 크림의 종류는 바닐라, 초코, 딸기, 말차 중 하나로 입력할 것.
 * 
 * foreach 를 사용하여
 * oreoBox 에서 모든의 쿠키의 상태를 출력
 * 
 * for를 사용하여 모든 쿠키의 크림을 바닐라로 변경
 * 
 * foreach 사용해서 모든 쿠키의 크림 변경 상태 확인을 위한 출력
 * 
 * @author 304
 *
 */
public class OreoTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		Oreo[] oreos = new Oreo[0];
		
		OreoBox box = new OreoBox(oreos);
		
		Oreo choco      = new Oreo(1, "초코");
		Oreo strawberry = new Oreo(2, "딸기");
		Oreo greentea   = new Oreo(3, "말차");
		Oreo sobjingho  = new Oreo(4, "오줌");	
		// 3. 사용
		// add 기능 테스트
		box.add(choco);
		box.add(strawberry);
		box.add(greentea);
		
		// 생성 직후 상태 출력
		for (Oreo oreo: box.getAllOreos()) {
			oreo.print();
		}
		
		// 초코 쿠키 (1번 쿠키)를 바닐라로 변경 : set
		
		
		// 변경된 초코쿠키 (1번 쿠키) :get
		
		
		// 전체 크림 변경
		for (Oreo oreo: box.getAllOreos()) {			
			oreo.changeCream("바닐라");
		}
		
		System.out.println("===========================");
		
		// 바닐라 크림 변경 후 출력
		for (Oreo oreo: oreos) {
			oreo.print();
		}
		
		
		// 3번 쿠키 삭제 : remove
		
		// 전체 목록 출력 
		
	}

}