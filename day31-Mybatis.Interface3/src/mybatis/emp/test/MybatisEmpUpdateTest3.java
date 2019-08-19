package mybatis.emp.test;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.MybatisClient;
import mybatis.emp.mapper.EmpMapper;
import mybatis.emp.vo.Emp;

/**
 * EMP 테이블에서 직원 정보 1건을 수정하는 
 * 쿼리를 Mybatis 로 실행하는 테스트 클래스
 * ----------------------------------------
 * 수정 : 선 조회 - > 후 수정
 * 
 * 1. 직원 사번으로 1명의 정보를 조회
 * 2. 조회된 내용이 맵으로 전달
 * 3. 2의 맵에 수정할 키(컬럼명) 만 새로 put
 * 4. 3에서 변경된 맵 객체로 update 실행
 * 
 * @author Administrator
 *
 */
public class MybatisEmpUpdateTest3 {

	public static void main(String[] args) {
		// 1. 펙토리 얻기
		SqlSessionFactory factory = MybatisClient.getFactory();
		
		// 2. 세션 얻기
		SqlSession session = factory.openSession(true);
		
		try {
			// 조회에 사용할 객체 선언
			Emp inputEmp = new Emp();
			//조회에 사용할 inputemp만듬
			inputEmp.setEmpno(9999);
			inputEmp.setMgr(7698);
			inputEmp.setComm(500); 
			
			// 3. 세션에서 매퍼 인터페이스 객체 얻어서 메소드 호출
			// (1) 매퍼 인터페이스 변수 선언
			// (2) 인터페이스 변수에 매퍼 객체 얻기
			EmpMapper mapper;
			mapper = session.getMapper(EmpMapper.class);
			
			// (3) 한건 조회 메소드 호출 
			Emp emp = mapper.selectEmp2(inputEmp);
			
//			Emp emp = session.selectOne("mybatis.emp.mapper.EmpMapper.selectEmp2", inputEmp);
			
			// 맵 객체인 emp 에 담긴 내용
			// 1111	박준석	SALESMAN		19/08/10			
			System.out.println(emp);
			

//			emp.setMgr(7698); // <- 원래 이렇게 해야 되는 데 포장이 일어나서, auto-boxing 이 발생함
//			emp.setSal(1250);
//			emp.setComm(800);
//			emp.setDeptno(30)
//			; 

			// 수정할 컬럼 = 값
			// comm =400 , mgr =7698
			//update3(Emp) 메소드는 동적 update 수행 메소드
			
			
//			int setCnt =mapper.update3(emp);
						
			// (4) 조회된 직원 정보 일부 수정
			//mybatis.emp.mapper.EmpMapper.update
//			int setCnt = session.update("mybatis.emp.mapper.EmpMapper.update2",emp);
//			int setCnt = mapper.update3(emp);
			
			//; update2(Emp)메소드는 정적 update 수행 메소드
			int setCnt = mapper.update3(inputEmp);
			
			if(setCnt > 0) {
				System.out.printf("%d 직원의 정보가 %d 건 수정되었습니다.%n", emp.getEmpno() , setCnt);
			}
			
			// (3) 수정된 정보 재조회
			Emp selectEmp = new Emp();
			selectEmp.setEmpno(1111);
			Emp newEmp = mapper.selectEmp2(selectEmp);
			System.out.println("수정된 맴버 조회");
			System.out.println(newEmp);
			
			
		}finally {
			if(session != null) {
				session.close();
			}
			
		}
		
		// 4. 세션 닫기
	}
}
