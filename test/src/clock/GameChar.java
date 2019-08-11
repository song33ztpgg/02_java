package clock;

public class GameChar extends OverWatch {

//	@Override
	public void start() {
	  System.out.printf("이름은 ");
	  System.out.println(getName());
	  
	  System.out.printf("hp는 ");
	  System.out.printf("" +downHP(10)); 
	}


}
