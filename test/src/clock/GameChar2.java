package clock;

public class GameChar2 extends OverWatch {

	public void start() {
		System.out.println();
		System.out.printf("이름은 ");
		System.out.println(getName()); 
		System.out.printf("채력은 "); 
		System.out.println(downHP(10));
		
	}

}
