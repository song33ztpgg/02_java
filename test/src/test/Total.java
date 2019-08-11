//import account.one.맴버;

/* 
 //■■■■■■■■■■■■■■■■■■■■■■■■■■■■단축키■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■//
 alt + shift + a
 
 ctrl 누른상태로 매소드 클릭하면 매소드 위치로 이동을 한다
  
 alt + shift + R  : 전체 수정
 
 alt + shift + s : hash 코드 만드는 매소드 만들기 
 
 alt + 방향키 : 문장 이동
 
 //■■■■■■■■■■■■■■■■■■■■■■■■■키워드 사용법■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■//
 
  
 ■ String name = "123456789"; 
   System.out.println(name.charAt(0));


 case 다중 선택가능하게 
 => case1: (null) 
 	case2:  
 	
 	
do while  
= 반드시 1번은 수행되어야 할 때 사용 
= 실행을 하고 while 조건에 맞는지 확인한다.
 
 ■ 리펙토링 
 this.width = width;
 
 ■ int z; 이것을 바꿀려면  (double)z 로 바꾸면 된다.
  
 ■ final int x = 0;  ==> x는 다시 변환 할수 없게 된다
 
 ■ %5.5f   ==> 오른쪽으로 5칸을 맞춰주며 5자리까지만 나오도록 한다. 
 
 ■ IN break OUT
 
 ■ 배열은 참조 형 
 
 ■ continue 는 증감식 으로 간다. 
 
 ■ 배열의 이름을 지을때는 복수형이름으로 지을 것
    int[] 복수형이름; 
	복수형이름 = new int[크기];

 ■  데이터 구조 
 1.배열 
 2.리스트
 3.맵 
 4.셋 
 
 ■ foreach 구문
for(원소의타입 변수이름 : 자료구조(==배열)) { 
	문장들 
	}; 
	
 ■ for(int idx : numbers) 
 순서 
 1. idx = number[0]; 
    idx = number[1]; 
 
만역 number[3] 중 number[5] 나 number[0]은 정보를 얻을수 없다. 
무조건 순차적으로   
ex) 바구니 안에 공을 꺼내서 사용한다. 개념 (하나만 꺼내서 보고 꺼낸거는 다시 넣지 않는다.)

앞 int idx 를 double idx 로 변환이 가능하다
 
 ■ 참조형 기본값 null
 
 ■ 생성자 
 클래스이름(String) { } 
 클래스이름(int) { }  
 기본생성자 : 타입이 없음 , 매개변수가 없음, 
 
  -이름은 클래스 이름과 동일하게 
  -다양한 매소드 라도 생성자 부분에는 다 같은 이름으로 
  -중복정의는 생성자에도 적용이 되는 정의 기법 
  -대부분 맴버변수를 초기화(실체화) 하는대 사용 
  -return 값이 없다(?)
  
 ■중복정의(overloading)
  
  매개변수 목록이 다르다 
  1) 갯수가 다르다 
  2) 매개변수 타입이 다르다 
  
 타입같다, 
 같은 생산라인에서 나왔다 or 사용기능이 똑같다
 
 ■중복정의 중요한점 
 -매소드 이름,매개변수타입,매개변수 갯수 
 ■중복정의 중요하지 않는것 
 -리턴타입 , 매개변수 이름 
 
 ■ static 매소드  
클래스이름.매소드이름(아규먼트) 
ex)Test.sum(10.0,15.0); 

import static 페키지이름.클래스이름.불러오고싶은 매소드(전체 불러올려면 *표시)
 
 ■ 객체지향이 아닌 언어들은 중간값에 return값을 보낼수 있으나 되도록 
    맨 마지막에 return을 해주는것이 제일 확실하다. 
 
 ■ this 초기화 하는동안  = 대입을 않해주면 값을 알 수 있는 방법이 없다  
    그렇기 때문에 그 값을 알기 위해 this 를 사용 
    
 ■ super() 부모가 갖지고 있는 필드를 불러옴 
       
 
 ■상속 =  다향성 ,메소드제정의,  버츄얼메소드 인버케이션 
   ㄴtoString 제공
  
 ■ import static java.lang.Math.*; 
   
 ■ 예외처리 방법
try    - 시작
catch  - if else
final  - default		 


■ override 중복정의가 발생할 경우 오류로 표시를 해준다
 			
■ static 변수 사용 
-맴버 변수보다 상위에 존재 
-생성자가 초기화를 하지 않기에 생성과 동시에 초기화 설정 
-다른 곳에 사용을 하고 싶을 경우 static변수가존재하는클래스.static변수로 작용해야 한다
 		
 ■ '변수1변수2'로 출력하기			
 변수1.concat(변수2)
 
 ■ StringBuffer 
 초기화를 해주어도 주소값은 같다
 			
//■■■■■■■■■■■■■■■■■■■■■■■■■■■■개념■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■//
 ■ 레코드  :다양한 정보가 저장된것
 
 ■ 객체
   속성(변수)   : 이름 , 종류 ,제조사 , 생상 ,최대속도  
   기능(매소드) : 가속 , 감속 , 출발 ,정지

    속성 : 예금주, 잔액, 통장 유형 
    기능 : 입금, 출금, 잔액조회
    
 ■ 클래스  : 현실세계에 존재하는 객체를 프로그램에서 구현하는 설계도 
             실제 객체가 아닌 객체를 찍어내기 위한 틀
             (설계도 대로 나온다) (타입)
             
    ex) 팬 (글자) : 스프링을 넣는다, 색갈은 빨강이다, 굵기가 10cm 이다      
        객체 , 인스턴스 : 글자대로 만들어진것
        
    ex) 자동차 클래스화 
    자동차의 속성(Type)을 나타내는 값들을 나타낼 car 클래스 정의 
   현실세계의 자동차의 속성은 수 없이 많을 수 있다. 
   따라서 필요한 영역으로 제한 
   
   자동차는 여러가지 속성이 있으나 필요한 기능만 넣어서 만들어 냄
   주유소  : 기종(lpg, 디젤)등 중요함 
   K1 경주 : 성능 , 디자인 등 중요함 
   병원    : 안전성, 소리크기 중요함
   
  객체지향 : 객체를 만들기 위한 클래스(디자인) 하고 
  		      사용 할수있게 객체(작품)로 만들어 낸다.    
  
  추상화 : 		 휴대폰 = 전력을 사용하며 가지고 다닐수 있으며 다양한 기능을 가기고 있는 기기에 인터넷이 되는 것
         	   스마트폰 - 전력을 사용하며 가지고 다닐수 있으며 LG기능을 가지고 있는 기기에 인터넷이 되는것
       		LG 스마트폰 - 전력을 사용하며 가지고 다닐수 있으며 LG기능을 가지고 있는 기기
       		   휴대기기 - 전력을 사용하며 사람이 가지고 다닐수 있는 기기
       		       기계 - 전력을 사용하는 작품 
       		       
        휴대폰기능 { 
            스마트폰 { 
              LG스마트폰 { 
                  휴대기기 { 
                        기계 { 
                             =전력을 사용하는 작품
                              } 
                            =사람이 가지고 다닐수 있는 기기
                            }  
                         =LG기능을 가지고 있는 기기
                          } 
                  =스마트폰 - LG기능을 가지고 있는 기기에 인터넷이 되는것
                       }  
              =다양한 기능을 가기고 있는 기기에 인터넷이 되는 것 
                    } 
                    
                    
        -지칭하는 기준을 통해서 가지고 있는 기능을 간략하게 표현한 것
        -본질만 남기는것 (핵심적 기능만 남기는 것)
        
       
     [매소드] 
    리턴타입
    메소드 이름 
	아규먼트 리스트   
        
        
      [자바 자동 설정들]
     *  public class Name extends Object{ 
	 *  public Name() { 
	 *  	super();
	 *  }
	 * 
	 * 	자바가 기본으로 작동해주는 것 
	 * -부모클래스는 Object  
	 * -기본 생성자 생성 
	 * -기본 생성자는 부모(object) 기본생성자 형식을 따른다 
	 
	 [상속]
	 상속을 할때 상속자는 받지 못하는 이유 
	 => 클레스 이름이 달라서, 클래스 이름은 유일하기때문에
     
     부모필드 빌릴수 있다.
    
 */

//■■■■■■■■■■■■■■■■■■■■■■■■■■■■오류 부분■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■//
/**
 * Implicit super constructor Point() is undefined for default constructor. Must define an explicit constructor
 * undefined for default constructor =>
 */

// ■ 클래스, 맴버 변수때 사용하는 주석