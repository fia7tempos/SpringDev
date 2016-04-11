package net.developia.funk.jdbc;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class EmpUpdate extends AbstractController{
	private EmpService empService;
	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int empno = Integer.parseInt(request.getParameter("empno"));
		try{
			EmpVO empVO = new EmpVO();
			empVO.setEmpno(empno);
			empVO = empService.getEmployee(empVO);
			List<DeptVO> deptList = empService.getDeptList();
			ModelAndView mav = new ModelAndView("emp/emp_update");
			mav.addObject("empVO",empVO);
			mav.addObject("deptList",deptList);
			return mav;
		}catch(Exception e){
			e.printStackTrace();
			ModelAndView mav = new ModelAndView("result");
			mav.addObject("msg","사원 상세보기 오류");
			mav.addObject("url","empList");
			return mav;
		}
				
		
		
	}

}
