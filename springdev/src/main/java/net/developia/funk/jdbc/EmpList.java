package net.developia.funk.jdbc;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


public class EmpList extends AbstractController {
	
	private EmpService empService;
	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			List<EmpVO> list = empService.getEmpList();
			long totalSal = empService.getTotalSal();
			ModelAndView mav = new ModelAndView("emp/emp_list");
			mav.addObject("list",list);
			mav.addObject("totalSal",totalSal);
			return mav;
		} catch (Exception e) {
			e.printStackTrace();
			ModelAndView mav = new ModelAndView("result");
			mav.addObject("msg","시스템 오류가 발생했습니다.");
			mav.addObject("url","index.jsp");
			return mav;
		}
		
		
	}

}
