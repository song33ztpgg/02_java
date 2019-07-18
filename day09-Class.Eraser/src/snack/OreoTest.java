package snack;

/** 
 * Oreo 쿠기가 3개 들어있는 oreoBox라는 변수를 
 * Oreo 배열타입으로 선언한고
 * 
 * oreoBox[0] = 크기, 두깨 , 크림 
 * */
public class OreoTest {

	public static void main(String[] args) {

		
		Oreao[] oreaoes = new Oreao[3];
		
		oreaoes[0] =  new Oreao("바닐라",1.0, 2.0);  
		oreaoes[1] =  new Oreao("초코",5.0, 6.0); 
		oreaoes[2] =  new Oreao("딸기",3.0, 3.0);
		oreaoes[3] =  new Oreao("매운맛",9.9, 9.9);
		
		
				
	//1.쿠키의 상태 출력 
				
	for(Oreao oreao :oreaoes ) { 
		oreaoes.print()
	}
	//2.for를 사용하여 모든 쿠키의 크림을 바닐라로 변경 
				
	//3.모든 쿠키의 상태 확인
				
	}

}
