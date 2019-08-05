package schoolTest;

import schoolTest.Employee;
import schoolTest.Teacher;

public class SchoolTest {

	public static void main(String[] args) {
		
		Person[] persons; 
		persons = new Person[3]; 
				
		persons[0] = new Student("S01","홍길동",18,"도술"); 
		persons[1] = new Teacher("T01","정약용",32,"실학");
		persons[2] = new Employee("E01","허균",48,"문학예술"); 
		
		for(Person per : persons){ 
			// 가상 메소드 호출 부모클래스 정의 매소드 호출 
			// 실제 인스턴스 타입의 클래스에 재정의된 
			//메소드가 응답하는 것 
			// 가상메소드 호출이 되기 위해서는 
			// 반드시 상속이 전제되어야 함
			
			per.print(); 

			
		}
		
		
	}

}
