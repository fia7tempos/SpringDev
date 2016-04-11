package net.developia.funk.jdbc;

import java.util.List;

public interface EmpDAO {

	List<EmpVO> getEmpList() throws Exception;

	long getTotalSal() throws Exception;

	List<DeptVO> getDeptList() throws Exception;

	void insertEmp(EmpVO empVO) throws Exception;

	int deleteEmp(EmpVO empVO) throws Exception;

	EmpVO getEmployee(EmpVO empVO) throws Exception;

	int updateEmp(EmpVO empVO) throws Exception;

}
