package kr.or.kosa;

//사원 정의 
public class Emp { //Emp라는 클래스는 데이터 타입이다 (큰타입)
	
	public int number;
	private int empno;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		//전달하기 전에 검증 ...
		if(empno < 0) {
			this.empno = 0;
		}else {
			this.empno = empno;
		}
	} 
	
	public void print() {
		System.out.println("사원번호 : " + empno);
	}
	
}
