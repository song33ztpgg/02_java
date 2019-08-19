package shoes.list;

import java.util.List;

import shoe.Shoe;

public class ListShoeSowcase {

	List<Shoe> shoes;
}

//- shoes : List<Shoe>  
//ListShoeSowcase : shoes.list 패키지에 추가할 class
//+ 기본생성자 : shoes 를 직접 ArrayList<Shoe> 로 초기화

//+ add(Shoe shoe) : int : 추가 성공 : 1, 추가 실패 : 0
//+ set(Shoe shoe) : int : 수정 성공 : 1, 수정 실패 : 0
//+ remove(Shoe shoe) : int : 삭제 성공 : 1, 삭제 실패 : 0
//+ get(Shoe shoe) : Shoe : 조회 성공 : shoe, 조회 실패 : null
//+ getAllShoes()  : List<Shoe> : 전체목록을 리턴
//- isExists(Shoe shoe) : boolean : shoe 정보 존재시 true, 존재하지 않을 시 false 리턴


