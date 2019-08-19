//-code     : int    : 신발 제품코드 (1, 2, 3, ... , n) 으로 숫자로 1씩 증가함
//-name     : String : 신발 제품 명
//-size     : int    : 신발의 사이즈(한국형 크기 240, 250 등)
//-price    : int    : 가격
//-type     : String : 신발의 타입
//                     (운동화, 샌들, 구두, 슬리퍼, 부츠 중 1개의 String 값을 가질 수 있음)
//                     (정의 시점에는 적용 불가능 실제 사용하여 Shoe 인스턴스 만들때 이러한 값으로 적용)
//-quantity : int    : 재고수량
//












//============================================================================================
//package : shoe.test
//class : ShoeTest : Shoe 클래스를 테스트
//--------------------------------------------
//2. (1) Shoe 타입을 저장할 수 있는 
//       List<Shoe> shoesList 를 add(shoe) 로 추가
//   (2) Set<Shoe> shoesSet 를 선언하여 add(shoe)로 추가
//   (3) Map<Shoe> shoesMap 를 선언하여 put(code, shoe)로 추가
//   
//3. 각 자료구조별 shoes 를 foreach 로 출력
//
//4. 3 번 코드로 등록된 신발의 정보 1개를 출력
//
//5. 3 번 코드로 등록된 신발의 정보에서 재고를 0으로 
//   조정
//   
//6. 재고가 조정된 내용 출력
//
//7. 3 번 코드로 등록된 신발 정보를 삭제
//
//8. 삭제된 신발의 정보가 shoes 에 없는 것을 출력(전체 출력)








//package : shoes.list, shoes.map, shoes.set
//---------------------------------------
//ListShoeSowcase : shoes.list 패키지에 추가할 class

//MapShoeSowcase  : shoes.map 패키지에 추가할 class
//---------------------------------------
//멤버변수 영역
//- shoes : List<Shoe> 

//- shoes : Map<Integer, Shoe> 
//---------------------------------------
//생성자 영역
//+ 기본생성자 : shoes 를 직접 ArrayList<Shoe> 로 초기화 

//+ 기본생성자 : shoes 를 직접 HashMap<Integer, Shoe> 로 초기화
//+ 매개변수가 있는 생성자
//---------------------------------------
//메소드 영역
//+ add(Shoe shoe) : int : 추가 성공 : 1, 추가 실패 : 0
//+ set(Shoe shoe) : int : 수정 성공 : 1, 수정 실패 : 0
//+ remove(Shoe shoe) : int : 삭제 성공 : 1, 삭제 실패 : 0
//+ get(Shoe shoe) : Shoe : 조회 성공 : shoe, 조회 실패 : null
//+ getAllShoes()  : List<Shoe> : 전체목록을 리턴
//- isExists(Shoe shoe) : boolean : shoe 정보 존재시 true, 존재하지 않을 시 false 리턴
//---------------------------------------













//===============================================                     
/