/**
-----------------------------------------------
package : shoe
class : Shoe :신발의 정보를 저장하는 클래스
-----------------------------------------------
'-' 의미  = private 
-code     : int    : 신발 제품코드 (1, 2, 3, ... , n) 으로 숫자로 1씩 증가함
-name : String : 신발 제품 명
-size     : int    : 신발의 사이즈(한국형 크기 240, 250 등)
-price    : int    : 가격
-type     : String : 신발의 타입
                     (운동화, 샌들, 구두, 슬리퍼, 부츠 중 1개의 String 값을 가질 수 있음)
                     (정의 시점에는 적용 불가능 실제 사용하여 Shoe 인스턴스 만들때 이러한 값으로 적용)
-quantity : int    : 재고수량
----------------------------------------------
+ 기본생성자 / + 생성자 중복정의 할 수 있는 만큼 모두
----------------------------------------------
+ 각 필드의 접근자 / 수정자 메소드
+ code 기준 equals(), hashCode() 재정의
+ toString() 재정의


============================================================================================
package : shoe.test
class : ShoeTest : Shoe 클래스를 테스트
--------------------------------------------
main 메소드에서 
1. Shoe 타입의 객체를 4개 생성
   code 는 1, 2, 3, 4 로 일련번호를 부여
   name, size, price, type 등은 
   실제로 있는 데이터 인터넷(ABC mart 페이지에서 검색)하여 생성
   
2. (1) Shoe 타입을 저장할 수 있는 List<Shoe> shoes 를 add(shoe) 로 추가
   (2) Set<Shoe> shoesSet 를 선언하여 add(shoe)로 추가
   (3) Map<Shoe> shoesMap 를 선언하여 put(code, shoe)로 추가
   
3. 각 자료구조별 shoes 를 foreach 로 출력

4. 3 번 코드로 등록된 신발의 정보 1개를 출력

5. 3 번 코드로 등록된 신발의 정보에서 재고를 0으로 
   조정
   
6. 재고가 조정된 내용 출력

7. 3 번 코드로 등록된 신발 정보를 삭제

8. 삭제된 신발의 정보가 shoes 에 없는 것을 출력(전체 출력)

==========================================================================================
package : shoes
Interface : ShoeShowcase(신발진열장을 의미하는 인터페이스)
---------------------------------------------
인터페이스 추상메소드 영역
+ add(Shoe shoe) : int
+ set(Shoe shoe) : int
+ remove(Shoe shoe) : int
+ get(Shoe shoe) : Shoe 
+ getAllShoes()  : List<Shoe>

==========================================================================================

package : shoes.list, shoes.map, shoes.set
---------------------------------------
ListShoeSowcase : shoes.list 패키지에 추가할 class
SetShoeSowcase  : shoes.set 패키지에 추가할 class
MapShoeSowcase  : shoes.map 패키지에 추가할 class
---------------------------------------
멤버변수 영역
- shoes : List<Shoe> 
- shoes : Set<Shoe> 
- shoes : Map<Integer, Shoe> 
---------------------------------------
생성자 영역
+ 기본생성자 : shoes 를 직접 ArrayList<Shoe> 로 초기화 
+ 기본생성자 : shoes 를 직접 HashSet<Shoe> 로 초기화
+ 기본생성자 : shoes 를 직접 HashMap<Integer, Shoe> 로 초기화
+ 매개변수가 있는 생성자
---------------------------------------
메소드 영역 @over
+ add(Shoe shoe) : int : 추가 성공 : 1, 추가 실패 : 0
+ set(Shoe shoe) : int : 수정 성공 : 1, 수정 실패 : 0
+ remove(Shoe shoe) : int : 삭제 성공 : 1, 삭제 실패 : 0
+ get(Shoe shoe) : Shoe : 조회 성공 : shoe, 조회 실패 : null
+ getAllShoes()  : List<Shoe> : 전체목록을 리턴
- isExists(Shoe shoe) : boolean : shoe 정보 존재시 true, 존재하지 않을 시 false 리턴
---------------------------------------

===============================================                     
package : shoe.test
class : ShoeTest2 : Shoe 클래스와 각 ShoeShowcase 를 테스트
--------------------------------------------
main 메소드에서 
1. Shoe 타입의 객체를 4개 생성
   code 는 1, 2, 3, 4 로 일련번호를 부여
   name, size, price, type 등은 
   실제로 있는 데이터 인터넷(ABC mart 페이지에서 검색)하여 생성
   
2. ShoeShowcase 타입의 변수 showcase 선언
   (1) ~ (3) 을 각각 수행 
   (1) ListShoeShowcase 로 ShoeShowcase 인스턴스 생성
   (2) SetShoesShowcase 를 선언하여 add(shoe)로 추가
   (3) MapShoesShowcase 를 선언하여 put(code, shoe)로 추가
   
3. 각 구현에 관계 없이 ShowShowcase 의 기능 getAllShoes() 를 호출

4. 3 번 코드로 등록된 신발의 정보 1개를 출력

5. 3 번 코드로 등록된 신발의 정보에서 재고를 0으로 
   조정
   
6. 재고가 조정된 내용 출력

7. 3 번 코드로 등록된 신발 정보를 삭제

8. 삭제된 신발의 정보가 shoes 에 없는 것을 출력(전체 출력==getAllShoes())
*/