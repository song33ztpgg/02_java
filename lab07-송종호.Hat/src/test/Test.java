//﻿프로젝트명 : lab07-Hat
//패키지 이름 : clothing
//클래스 이름 : Hat
//----------------------------------
//멤버변수 : 
//  hatId : String : 모자제품의 일련 번호(ht001 로 일련번호를 줄 용도)
//  type : String : 모자의 종류(스포츠캡, 페도라, 중절모, 썬캡, 베레모, 후드, 카우보이 등)
//  material : String : 모자의 소재(가죽, 플라스틱, 천, 라탄 등)
//  size : double : 모자 둘레 길이(단위 : cm)
//  color : String : 모자의 색상
//  price : double : 모자의 가격
//  quantity : int : 재고 수량
//  gender : char : 사용성별 (M:남성, F:여성, U:공용 으로 설정)
//-----------------------------------
//생성자
//  1. 기본생성자
//  2. 매개변수를 받는 생성자(멤버 변수 1개씩 증가시키며 모두) 중복 정의
//---------------------------------------------
//메소드 
//
//  1. public double discount(int amount) : 
//     amount 만큼 할인한 가격을 리턴.
//     원래 가격보다 큰 값 할인은 불가능하도록 설정.
//     할인가가 원래 제품가격보다 크면 "제품 가격보다 크게 할인할 수 없습니다." 내용 출력
//
//  2. public void dye(String color) : 모자 색상을 입력된 color 로 염색하여 색상을 변경
//
//  3. public int sell(int amount) : amount 만큼 판매(재고를 줄임). 원래 수량보다 많이 판매 불가
//
//  4. public int buy(int amount) : amount 만큼 구매(재고를 늘림)
//
//  5. 각 필드에 대한 접근자/수정자 정의
//
//  6. hatId  기준으로 equals(), hashCode() 재정의
//
//  7. toString() 재정의
//
//===================================================================








//사용 클래스 HatTest 작성
//패키지 이름 : clothing.test
//클래스 이름 : HatTest
//--------------------------
//main 메소드 작성
//
//메인 메소드 내에 Hat 객체를 3개 생성
//Hat cap = new Hat(......); // type을 "야구모자"로 생성, hatId: HT001, 나머지 필드는 적당히
//Hat fedora = new Hat(....);// type을 "페도라"로 생성  , hatId: HT002, 나머지 필드는 적당히
//Hat sunCap = new Hat(....);// type을 "썬캡" 으로 생성 , hatId: HT003, 나머지 필드는 적당히 
//
//List<Hat> hats 를 생성하고 앞서 생성한 cap, fedora, sunCap 을 add() 한다.
//hats 를 foreach 로 출력. 출력할 때 println() 메소드 안에 hat 객체를 바로 출력하여 모자 객체의 내용이 출력되도록 한다.