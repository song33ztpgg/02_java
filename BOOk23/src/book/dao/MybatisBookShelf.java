package book.dao;

/**
 * 데이터베이스에 저장된 도서정보를 
 * Mybatis를 사용하여 
 * 등록 수정 삭제 조회 하는 기능 구현 클래스 
 * 
 * 
 */

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.mybatis.client.MybatisClient;
import book.vo.Book;
import oracle.jdbc.pooling.Factory;

import static book.mybatis.client.MybatisClient.getFactory;

public class MybatisBookShelf implements BookShelf {
	/**
	 * Mybatis 의 커넥션인 SqlSession을 생성하는 
	 * SqlSessionFactory 변수 선언
	 */
	private SqlSessionFactory factory; 
	
	public MybatisBookShelf() {
		//factoty 변수를 1개의 인스턴스가 유지되도록 생성 
		//MybatisClient 클래스의 싱글턴 패턴이 적용된 
		//getFactoy() 스테틱 메소드를 사용한다
		factory = MybatisClient.getFactory();
	}
	
	@Override
	public int add(Book book) throws DuplicateException {
		return 0;
	}

	@Override
	public int set(Book book) throws NotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(Book book) throws NotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Book get(Book book) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		SqlSession Session = null; 
		List<Book> books = null;  
		
		//2 고기화 
		session = factory.openSession(); 
		try {
		books = session.selectList("book.mapper.getAllBooks");
		}finally { 
			if(sessopm != nul;) { 
				session.close();
			}
	}
	return null;
}
	@Override
	public List<Book> getBooksByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBooksByPrice(int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 매개변수로 전달된 book이 
	 * 이미 존재하는지 여부를 검사하는 메소드
	 * @param book 
	 * @return : 이미 존재하는경우 (true) 
	 * 			 책 정보가 존재하지 않는 경우 (false) 
	 * 
	 */
	private boolean isExists(Book book) { 
		//1.필요 객체 선언 
		boolean exists = false; 
		SqlSession session = null;
		
		//2.seeion 
		session = factory.openSession(); 
		
		//3.session 에서 쿼리 수행 
		try {
		Book foundBook = session.selectOne("book.mapper.isExists"); 
		
		if(foundBook != null) { 
			exists = true;			
		} finally { 
			if(session != null) {
				session.close();
			}
		  }
		}
		
		
		//4. session 닫기
		
		
		
	}
}
