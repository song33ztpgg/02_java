package shool;
/**
 * 학겨시스템 구성원 모두 출결을
 * 나타내기 위해 정의하는 인터페이스 
 * */
public interface Attendance {

	/**
	 * 구성원의 출결을 나타내는 문자열을 리턴
	 * */
	public abstract String attend();
}
