package net.developia.funk.jdbc;

import java.io.Serializable;

public class EmpVO implements Serializable {
	private int empno;
	private String ename;
	private long sal;
	private DeptVO deptVO;
	
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
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	public DeptVO getDeptVO() {
		return deptVO;
	}
	public void setDeptVO(DeptVO deptVO) {
		this.deptVO = deptVO;
	}
	
	@Override
	public String toString() {
		return "EmpVO [empno=" + empno + ", ename=" + ename + ", sal=" + sal + ", deptVO=" + deptVO + "]";
	}
	
	
	
	

}
