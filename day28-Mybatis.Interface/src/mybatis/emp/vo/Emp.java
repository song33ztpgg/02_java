package mybatis.emp.vo;
/**
 * EMP 테이블의 컬럼명과 같은 
 * 맴버변수 이름을 갖는 
 * vo 클래스 정의
 * ----------------------------
 * private 맴버 변수
 * 기본생성자
 * 접근자/ 수정자
 * equals % hashCode <== empno 로 작성
 * toString
 * ----------------------------
 * @author Administrator
 *
 */
public class Emp {
	private int empno;
	private String ename;
	private String job;


	private int mgr;
	private String hiredate;
	private int sal;
	private int comm;		
	private int deptno;
	
	// 기본생성자
	public Emp() {
		
		super();
	}
	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hierdate) {
		this.hiredate = hierdate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	// equals & hashCoode 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empno;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (empno != other.empno)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "직원 정보 [empno=\t" + empno + ", ename=\t" + ename + ", job=" + job + ", mgr=" + mgr + ", hierdate=" + hiredate
				+ ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
	}
	
	
	
}
