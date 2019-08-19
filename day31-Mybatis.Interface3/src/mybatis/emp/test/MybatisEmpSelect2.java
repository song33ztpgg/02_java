package mybatis.emp.test;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.MybatisClient;
import mybatis.emp.vo.Emp;

/**
 * EMP  테이블에서 1건, 전체조회를 
 * Mybatis 를 사용하여 실행하는 테스트 클래스
 * @author Administrator
 *
 */
public class MybatisEmpSelect2 {
	
	public static void main(String[] args) {
		// 1. factory 얻기
		SqlSessionFactory factory = MybatisClient.getFactory();
		
		// 2. 세션 얻기
		SqlSession session = factory.openSession();
		
		try {
			// 3. 세션을 통해 쿼리 실행
			// (1) 전체 조회 쿼리 아이디 
			// 		: mybatis.emp.mapper.EmpMapper.selectAll
			List<Emp> emps = 
					session.selectList("mybatis.emp.mapper.EmpMapper.selectAll2");
			
			// 조회 결과 foreach 출력
			for(Emp emp : emps) {
				System.out.println(emp);
				// 사번, 이름만 뱁에서 추출
			}
			System.out.println("================================");
			
			// (2) 직원 1명 조회
			// 		mybatis.emp.mapper.EmpMapper.selectEmp
			
			Emp inputEmp = new Emp();
			inputEmp.setEmpno(8888);
				
			Emp emp = 
					session.selectOne("mybatis.emp.mapper.EmpMapper.selectEmp2", inputEmp);
			// 직원 1명 결과 출력
			System.out.println(emp);
		}finally {
			// 4. 닫기
			if(session != null) {
				session.getClass();
			}
		
		}
		
		
		
	}
}
