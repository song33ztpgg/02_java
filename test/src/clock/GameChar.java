package clock;

public class GameChar extends OverWatch {

//	@Override
	public void start() {
	  System.out.printf("이름은  ");
	  System.out.println(getName());
	  
	  System.out.printf("hp는  ");
	  System.out.println(downHP(10)); 
	  System.out.println("결과는");
	}


}
