package shoes.set;

import java.util.HashSet;
import java.util.Set;

import shoe.Shoe;

public class SetShoeSowcase {
	
	
	private SetShoeSowcase() { 
		Set<Shoe> shoes = new HashSet<Shoe>();	
	}  
	
	
	public int add(Shoe shoe) {
		
		return 0; 
	}
	
	
	
}

//SetShoeSowcase  : shoes.set 패키지에 추가할 class
//- shoes : Set<Shoe> 
//+ 기본생성자 : shoes 를 직접 HashSet<Shoe> 로 초기화
//메소드 영역
//+ add(Shoe shoe) : int : 추가 성공 : 1, 추가 실패 : 0
//+ set(Shoe shoe) : int : 수정 성공 : 1, 수정 실패 : 0
//+ remove(Shoe shoe) : int : 삭제 성공 : 1, 삭제 실패 : 0
//+ get(Shoe shoe) : Shoe : 조회 성공 : shoe, 조회 실패 : null
//+ getAllShoes()  : List<Shoe> : 전체목록을 리턴
//- isExists(Shoe shoe) : boolean : shoe 정보 존재시 true, 존재하지 않을 시 false 리턴