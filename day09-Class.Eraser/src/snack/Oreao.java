package snack;

/**
 * 속성
 * cream : String :바닐라, 딸기 , 딸기  
 * radius : double : 오래오 쿠키 1개 반지름 길이 
 * thickness : double : 두깨
 * 
 * 생성자 
 * 기본생성자 ,  중복생성자 
 * 
 * 
 * */

public class Oreao {

	
	String cream; 
	double radius; 
	double thinkness; 
	
	
	Oreao(){ 
	} 
	
	Oreao(String cream){ 
		this(); 
		this.cream =cream;
	}
	
	Oreao(String cream,double radius){ 
		this(cream); 
		this.radius = radius;
	} 
	
	Oreao(String cream,double radius,double thinkness){ 
		this(cream,radius); 
		this.thinkness = thinkness;
	}
	
	
	
	//쿠키 상태 출력 
	public void print() { 
		
		System.out.printf("반지름 : %.2f 높이 : %.2f  크림종류 : %s\n",radius,thinkness, cream);
	} 
	
	//매개변수를 통해 크림을 변경함 
	public void  changeCream(String cream) { 
		
		this.cream = cream; 
	
		System.out.printf("%s 크림으로 변경되었습니다\n", cream); 
		

	}
}
