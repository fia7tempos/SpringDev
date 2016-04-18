package net.developia.funk.memo;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("memo")
public class MemoController {
	
	@Autowired
	public MemoService memoService;
	
	private static Logger logger = org.slf4j.LoggerFactory.getLogger(MemoController.class);
	
	@RequestMapping(value = "insert", method=RequestMethod.GET)
	public void insert(){
	}
	@RequestMapping(value = "insert", method=RequestMethod.POST)
	public ModelAndView insert(@Valid MemoVO memoVO, BindingResult br){
		//logger.info(memoVO.toString());
		ModelAndView mav = new ModelAndView();
		mav.addObject("memoVO",memoVO);
		
		if(!br.hasErrors()){
			try {
				memoService.insertMemo(memoVO);
				mav.setViewName("redirect:list");				
				return mav;
			} catch (Exception e) {
				e.printStackTrace();
				mav.setViewName("result");
				mav.addObject("msg",e.getMessage());
				mav.addObject("url","list");
				return mav;
			}
		}else{
			mav.setViewName("memo/insert");
			return mav;
		}
	}
	@RequestMapping(value = "update", method=RequestMethod.POST)
	public ModelAndView update(@Valid MemoVO memoVO, BindingResult br){
		//logger.info(memoVO.toString());
		ModelAndView mav = new ModelAndView();
		mav.addObject("memoVO",memoVO);
		
		if(!br.hasErrors()){
			try {
				memoService.updateMemo(memoVO);
				mav.setViewName("redirect:list");				
				return mav;
			} catch (Exception e) {
				e.printStackTrace();
				mav.setViewName("result");
				mav.addObject("msg",e.getMessage());
				mav.addObject("url","javascript:history.back();");
				return mav;
			}
		}else{
			mav.setViewName("memo/view?no="+memoVO.getNo());
			return mav;
		}
	}
	
	@RequestMapping(value = "list")
	public void list(Model model){
		try {
			List<MemoVO> memoList = memoService.getMemoList();
			model.addAttribute("memoList",memoList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "view")
	public void view(long no, Model model){
		
		
		try{
			MemoVO memoVO = memoService.getMemo(no);
			model.addAttribute("memoVO",memoVO);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	@RequestMapping(value = "delete", method=RequestMethod.GET)
	public void delete(long no, Model model){
			model.addAttribute("no",no);
	}
	
	@RequestMapping(value = "delete", method=RequestMethod.POST)
	public ModelAndView delete(@Valid MemoVO memoVO, BindingResult br){
		//logger.info(memoVO.toString());
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("memoVO",memoVO);
		
			try {
				memoService.deleteMemo(memoVO);
				mav.setViewName("redirect:list");				
				return mav;
			} catch (Exception e) {
				e.printStackTrace();
				mav.setViewName("result");
				mav.addObject("msg",e.getMessage());
				mav.addObject("url","javascript:history.back();");
				return mav;
			}
	}

}
