package net.developia.funk.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("mvc")
public class AnnoController {
	
	@RequestMapping("hello")
	public void helloAnno(ModelMap model){
		model.addAttribute("msg","자동으로 전달");
		//new ModelAndView("hello","msg","hello Annotation");
	}
	@RequestMapping("hello2")
	public ModelAndView helloAnno(){
		return new ModelAndView("hello","msg","hello Annotation2");
	}
	
	@RequestMapping("hello3")
	public String helloAnno3(ModelMap model){
		model.addAttribute("msg","333자동으로 전달");
		return "mvc/hello";
		//new ModelAndView("hello","msg","hello Annotation");
	}

}
