package book.mybatis.client;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Mybatis 의 커넥션인 세션을 생성하는 
 * SqlSeesionDactory 클래스 인스턴스를 
 * 생성하고 생성한 인스턴스를 
 * 싱글턴(Singleton)으로 관리하는 클래스
 * ------------------------------------- 
 * 싱글턴: 디자인 패턴 
 * 
 *  어떤 인스턴스를 프로그램이 실행되는 동안 
 *  단 한개로 유지하는 기법 
 * 1.싱글턴으로 유지할 타인의 변수를 public static 하게 선언 
 * 2.생성자를 private 변경 
 * 3.싱글턴으로 유지할 타입을 리턴하느 public static 메소드 
 * 	 getInstance()등을 선언하고 
 * 	 이 메소드 내부에서만 생성자 호출을 하도록 구성
 * 
 * @author Administrator
 *
 */
public class MybatisClient {
	//싱글턴으로 관리할 타입(SqlSessionFactory)dml 
	//static 변수를 선언
//	public static SqlSessionFactory factory;
	private static SqlSessionFactory factory; 
	
	//2.싱글턴으로 관히랄 변수를 초기화 
	private MybatisClient() { 
		//mybatis-config.xml 파일을 InputStream으로 읽어서 
		//SqlSessionFactory 생성 
		String resource = "mybatic-config.xml"; 
		InputStream in = null; 
		
		try { 
			in = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(in); 
			
		} catch (IOException e) { 
			System.err.println("my baits 설정 읽기 오류"); 
			e.printStackTrace();
		}
	}
		
		//3.싱글턴으로 관리할 타입 sqlSeesionFatory을 리턴하는 
		//static 메소드 getFatocyr)	선언 
		public static SqlSessionFactory getFactory(){ 
			if(factory == null ) { 
				new MybatisClient();
			}
			return factory;
		}	
	}

