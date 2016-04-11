package net.developia.funk.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("param")
public class ParamController {
	
	@RequestMapping(value = "iam", method=RequestMethod.GET)
	public void iamGet(){
		
	}
	@RequestMapping(value = "iam", method=RequestMethod.POST)
	public String iamPost(SlamDunk slamDunk, ModelMap model){
		model.addAttribute("msg","그래"+slamDunk.getTeam()+"의 난 "+slamDunk.getAge()+"세의 "+slamDunk.getName()+"! 포기를 모르는 남자지");
		return "param/iAm_action";
	}

}
