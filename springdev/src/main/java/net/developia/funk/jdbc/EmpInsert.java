package net.developia.funk.jdbc;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class EmpInsert extends AbstractController{
	
	private EmpService empService;

	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<DeptVO> deptList = empService.getDeptList();
		ModelAndView mav = new ModelAndView("emp/emp_insert");
		mav.addObject("deptList",deptList);
		return mav;
	}
	
}
