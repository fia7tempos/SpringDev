package net.developia.funk.jdbc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class EmpUpdateAction extends AbstractController {
	
	private EmpService empService;
	
	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse responce) throws Exception {
		try{
			DeptVO deptVO = new DeptVO();
			deptVO.setDeptno(Integer.parseInt(request.getParameter("deptno")));
			
			EmpVO empVO = new EmpVO();
			empVO.setEmpno(Integer.parseInt(request.getParameter("empno")));
			
			empVO.setEname(request.getParameter("ename"));
			empVO.setSal(Long.parseLong(request.getParameter("sal")));
			empVO.setDeptVO(deptVO);
			
			if(empService.updateEmp(empVO)>=1){
				ModelAndView mav = new ModelAndView("result");
				mav.addObject("msg","사원 수정 완료");
				mav.addObject("url","empList");
				return mav;
			}else{
				ModelAndView mav = new ModelAndView("result");
				mav.addObject("msg","사원 수정 실패");
				mav.addObject("url","javascript:history.back();");
				return mav;
			}
			
		}catch(Exception e){
			e.printStackTrace();
			ModelAndView mav = new ModelAndView("result");
			mav.addObject("msg","입력이 잘못되었습니다");
			mav.addObject("url","javascript:history.back();");
			return mav;
			
		}
		
		
	}

}
