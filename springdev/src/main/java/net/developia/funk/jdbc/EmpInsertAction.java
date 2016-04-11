package net.developia.funk.jdbc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class EmpInsertAction extends AbstractController {
	private EmpService empService;
	
	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String ename = request.getParameter("ename");
		long sal = Long.parseLong(request.getParameter("sal"));
		int deptno = Integer.parseInt(request.getParameter("deptno"));
		
		DeptVO deptVO = new DeptVO();
		deptVO.setDeptno(deptno);
		
		EmpVO empVO = new EmpVO();
		empVO.setEname(ename);
		empVO.setSal(sal);
		empVO.setDeptVO(deptVO);
		
		try{
			empService.insertEmp(empVO);
			return new ModelAndView("redirect:empList");
		}catch(Exception e){
			e.printStackTrace();
			ModelAndView mav = new ModelAndView("result");
			mav.addObject("msg","입력 에러");
			mav.addObject("url","javascript:history.back();");
			return mav;
		}
		
	}
	

}
