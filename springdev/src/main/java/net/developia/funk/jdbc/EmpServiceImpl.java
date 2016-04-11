package net.developia.funk.jdbc;

import java.util.List;

public class EmpServiceImpl implements EmpService {
	private EmpDAO empDAO;
	
	public void setEmpDAO(EmpDAO empDAO) {
		this.empDAO = empDAO;
	}

	@Override
	public List<EmpVO> getEmpList() throws Exception {
		return empDAO.getEmpList();
	}

	@Override
	public long getTotalSal() throws Exception {		
		return empDAO.getTotalSal();
	}

	@Override
	public List<DeptVO> getDeptList() throws Exception {		
		return empDAO.getDeptList();
	}

	@Override
	public void insertEmp(EmpVO empVO) throws Exception {
		empDAO.insertEmp(empVO);		
	}

	@Override
	public int deleteEmp(EmpVO empVO) throws Exception {
		return empDAO.deleteEmp(empVO);
		
	}

	@Override
	public EmpVO getEmployee(EmpVO empVO) throws Exception {
		return empDAO.getEmployee(empVO);
	}

	@Override
	public int updateEmp(EmpVO empVO) throws Exception {
		
		return empDAO.updateEmp(empVO);
	}
	
}
