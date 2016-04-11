package net.developia.funk.jdbc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class EmpDelete extends AbstractController{
	private EmpService empService;
	
	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		try{
			int empno = Integer.parseInt(request.getParameter("empno"));
			EmpVO empVO = new EmpVO();
			empVO.setEmpno(empno);
			if(empService.deleteEmp(empVO)>0){
				ModelAndView mav = new ModelAndView("result");
				mav.addObject("msg","암살 성공");
				mav.addObject("url","empList");
				return mav;				
			}else{
				ModelAndView mav = new ModelAndView("result");
				mav.addObject("msg","서버 에러");
				mav.addObject("url","javascript:history.back();");
				return mav;				
			}
			
		}catch(Exception e){
			e.printStackTrace();
			ModelAndView mav = new ModelAndView("result");
			mav.addObject("msg","입력 에러");
			mav.addObject("url","javascript:history.back();");
			return mav;
		}
		
	}

}
