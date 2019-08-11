package jdbc;

public class ConnectionInfo {

	// DB 커넥션 정보를 static 상수로 선언
	
	public static final String URL = "jdbc:oracle:thin:@//localhost:1521/XE";// 127.0.1은 데스크탑 위치 , 1521 은 오라클 포트 번호
	public static final String MYSQL_URL = "jdbc:mysql://localhost:3306/emp?serverTimezone=Asia/Seoul";
	public static final String USER = "SCOTT";
	public static final String PASSWORD = "TIGER";
	public static final String DIRVER = "oracle.jdbc.OracleDriver";
	public static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";

}
