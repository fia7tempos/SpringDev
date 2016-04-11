package net.developia.funk.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("restful")
public class RestController {
	
	@RequestMapping(value="{name}")
	public String iam(@PathVariable String name, Model model){
		model.addAttribute("msg","그래 난 "+ name+" 포기....");
		return "hello";
		
	}
	@RequestMapping(value="want")
	public String iam2(Model model){
		model.addAttribute("msg","안선생님 농구를 포기하기 시러여....");
		return "hello";
		
	}
	@RequestMapping(value="want/{want}")
	public String iam2(@PathVariable String want, Model model){
		model.addAttribute("msg","안선생님 "+want+"를 포기하기 시러여....");
		return "hello";
		
	}
	@RequestMapping(value="want/{want}/{position}")
	public String iam2(@PathVariable String want,@PathVariable String position, Model model){
		model.addAttribute("msg",position+"을 하고싶습니다. <br/>안선생님 "+want+"를 포기하기 시러여....");
		return "hello";
		
	}

}
