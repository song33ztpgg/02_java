//인터페이스 사용
package clock;

public class GalaxyGear4 extends SmartWatch {

	@Override
	public void displayTime() {
		System.out.println(getWatchName() + "디스플레이에 시간이 표시됩니다.");
	}

}