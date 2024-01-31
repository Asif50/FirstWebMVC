package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/c1")
public class WelcomController {

	public WelcomController() {
		System.out.println("Welcome Controller Constructor");
	}
	
	@GetMapping("/index")
	public ModelAndView welcomePage() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Hello, Welcome to AshokIt");
		mav.setViewName("index");
		return mav;
	}
	
}
