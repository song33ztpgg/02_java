package book.resp;

public class SingleResp implements Response {

	/**
	 * 입력된 한거의 데이터(object)가 
	 * Book 한권의 정보일때 그것을 출력 
	 * */
	public void response(Object object) {  
		String message = (String)object; 
		System.out.println(message);

	}
 
} 
 