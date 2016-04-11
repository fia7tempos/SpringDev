package net.developia.www.jdbc01;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmpDAOImpl implements EmpDAO {
	
	private JdbcTemplate jdbcTemplete = null;
	
	public void setJdbcTemplete(JdbcTemplate jdbcTemplete) {
		this.jdbcTemplete = jdbcTemplete;
	}
	
	@Override
	public List<EmpVO> getEmpList() throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append(" select e.empno,e.ename,e.sal,d.dname");
		sql.append(" from tb_emp e join tb_dept d ");
		sql.append(" on e.deptno = d.deptno");
		sql.append(" order by e.empno asc");
		
		RowMapper rowMapper = new RowMapper(){

			@Override
			public Object mapRow(ResultSet rs, int rownum) throws SQLException {
				DeptVO deptVO = new DeptVO();
				deptVO.setDname(rs.getString("dname"));
				
				EmpVO empVO = new EmpVO();
				empVO.setEmpno(rs.getInt("empno"));
				empVO.setEname(rs.getString("ename"));
				empVO.setSal(rs.getLong("sal"));
				empVO.setDeptVO(deptVO);
				
				return empVO;
			}
		};
		
		return jdbcTemplete.query(sql.toString(),rowMapper);
		
	}

	@Override
	public long getTotalSal() throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append(" select sum(sal) as total");
		sql.append(" from TB_EMP");
		
		return jdbcTemplete.queryForObject(sql.toString(), Long.class);
		
	}

	@Override
	public List<DeptVO> getDeptList() throws Exception {
		StringBuffer sql = new StringBuffer();
		sql.append(" select deptno,dname from tb_dept ");
		sql.append(" order by deptno ");
		RowMapper rowMapper = new RowMapper<DeptVO>() {

			@Override
			public DeptVO mapRow(ResultSet rs, int rownum) throws SQLException {
				DeptVO deptVO = new DeptVO();
				deptVO.setDeptno(rs.getInt("deptno"));
				deptVO.setDname(rs.getString("dname"));
				return deptVO;
			}
		};
		return jdbcTemplete.query(sql.toString(), rowMapper);
	}

	@Override
	public void insertEmp(EmpVO empVO) throws Exception {
		StringBuffer sql = new StringBuffer();
		sql.append(" insert into tb_emp(empno,ename,sal,deptno)");
		sql.append(" values(seq_emp.nextval, ?, ?, ?)");
		
		Object[] args = {
				empVO.getEname(),
				empVO.getSal(),
				empVO.getDeptVO().getDeptno()
		};
		
		jdbcTemplete.update(sql.toString(),args);
	}

	@Override
	public int deleteEmp(EmpVO empVO) throws Exception {
		StringBuffer sql = new StringBuffer();
		sql.append(" delete from tb_emp ");
		sql.append(" where empno = ?");
		
		return jdbcTemplete.update(sql.toString(),empVO.getEmpno());
	}

	@Override
	public EmpVO getEmployee(EmpVO oempVO) throws Exception {
		StringBuffer sql = new StringBuffer();
		sql.append(" select e.empno,e.ename,e.sal,e.deptno,d.dname from tb_emp e ");
		sql.append(" join tb_dept d on e.deptno=d.deptno where e.empno = ? ");
		
		RowMapper<EmpVO> rowMapper = new RowMapper<EmpVO>() {

			@Override
			public EmpVO mapRow(ResultSet rs, int rownum) throws SQLException {
				EmpVO empVO = new EmpVO();
				empVO.setEmpno(rs.getInt("empno"));
				empVO.setEname(rs.getString("ename"));
				empVO.setSal(rs.getLong("sal"));
				DeptVO deptVO = new DeptVO();
				deptVO.setDeptno(rs.getInt("deptno"));
				deptVO.setDname(rs.getString("dname"));
				empVO.setDeptVO(deptVO);
				
				return empVO;
			}
		};
		
		return jdbcTemplete.queryForObject(sql.toString(),rowMapper,oempVO.getEmpno());
	}

	@Override
	public int updateEmp(EmpVO empVO) throws Exception {
		StringBuffer sql = new StringBuffer();
		sql.append(" update tb_emp set ename=?,sal=?,deptno=?");
		sql.append(" where empno = ?");
		
		return jdbcTemplete.update(sql.toString(),empVO.getEname(),empVO.getSal(),empVO.getDeptVO().getDeptno(),empVO.getEmpno());
	}

}
