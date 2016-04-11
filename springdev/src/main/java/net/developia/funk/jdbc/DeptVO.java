package net.developia.funk.jdbc;

import java.io.Serializable;

public class DeptVO implements Serializable {
	private int deptno;
	private String dname;
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	@Override
	public String toString() {
		return "EmpVO [deptno=" + deptno + ", dname=" + dname + "]";
	}
}
