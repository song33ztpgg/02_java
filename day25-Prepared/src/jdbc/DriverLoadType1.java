package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

/**
 * SCOTT 계정의 EMP 테이블의 내용을 조회하여 
 * 데이터베이스 접속을 테스트 하는 클래스 
 * -------------------------------------
 * 1.드라이버 로드 
 * 2.커넥션 맺기 
 * 3.쿼리 준비 
 * 4.쿼리 실행 
 * 5.결과 처리 
 * 6.자원 해제 
 * -------------------------------------
 *
 *
 * @author 304
 *
 */
public class DriverLoadType1 {
	
	private static final String URL = 
			"jdbc:oracle:thin:@//localhost:1521/XE";
	private static final String USER = "SCOTT";
	private static final String PASSWORD = "TIGER";
	
	public static void main(String[] args) {
		//DB 커넥션 정보를 static 상수로 선언 
//		 1.드라이버 로드 
		new OracleDriver();
//		 2.커넥션 맺기 
		Connection connection = null; 
		ResultSet result = null;
		Statement stmt = null;
		try 
		{ 
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			//3.쿼리 준비 
//			String sql = "SELECT e.empno" 
//						+" 	   , e.ename "
//						+"     , e.job" 
//						+"	   , e.sal" 
//						+"FROM emp e" 
//						+"ORDER BY e.ename"; 
//			
			String sql = "SELECT e.empno"
					+    "     , e.ename"
					+    "     , e.job"
					+    "     , e.sal"
					+    "  FROM emp e"
					+    " ORDER BY e.ename";

			
			stmt = connection.createStatement();
			//4.쿼리 실행
			result = stmt.executeQuery(sql);
			
			//결과셋의 컬럼이름 추출  
			ResultSetMetaData meta = result.getMetaData(); 
			String colEmpno = meta.getColumnName(1); 
			String colEname = meta.getColumnName(2); 
			String colJob = meta.getColumnName(3); 
			String colSal = meta.getColumnName(4);

			System.out.printf("%4s| %6s | %9s | %4s\n",colEmpno, colEname, colJob, colSal);
			System.out.println("-----------------------------------------");
			
			//5.결과 처리  : 반복수행 
			// SECECT 실행결과는 여러 행의 결과가 발생하는 것이 
			// 일반적이므로 각 행별 처리를 위해서는 반복처리가 필요 
			
			
			//데이터 포인터 한줄 가져옴 
			while(result.next()) { 
				//결과셋의 표 형태를 받는 result 변수에서 
				//next()를 호출해야 최초의 행으로 
				//결과셋 커서(cursor)가 이동 
				//result 변수는 커서가 이동된 행 1줄을 가리키게 됨 
				
				int empno  = result.getInt(1); 
				String ename = result.getString(2); 
				String job = result.getString(3); 
				int sal = result.getInt(4);
				
				System.out.printf("%4s | %6s | %9s | %4s\n",empno, ename , job , sal);
			}
			
			
		} catch(SQLException e) { 
			System.err.println("sql 구문 실행 오류" +e.getMessage());
			e.printStackTrace();
		} finally { 
			
			//6.자원해제  
			//자원해제 순서가 있음 =>오픈의 반대 순서 
			//오픈순서 : connection , stmt ,result 
			//해제순서 : result, stmt, connection
			try { 
			if(result != null) { 
				result.close();
			} 
			
			if(stmt != null) { 
				stmt.close(); 
			}
			
			if(connection != null) { 
				connection.close();
			}
			}catch(SQLException e) {
				System.err.println("자원해체시 오류 " +e.getMessage() ); 
				e.printStackTrace();
			}
			
		}

		
		
 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
} } 