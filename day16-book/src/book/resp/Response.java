package book.resp;
/**
 * 북매니저가 어떤 작업에 대해 
 * 응답하는 방식을 정의하는 인터페이스 
 * 
 * 
 * */
public interface Response {

	/**
	 * 매지저가 특정작업에 대해 
	 * 응답하는 메소드
	 * */
	public abstract void response(Object object);
	 
}
