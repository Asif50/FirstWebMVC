package in.ashokit.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DateController {

	public DateController() {
		System.out.println("Date Controller Constructor");
	}
	
	@GetMapping("/date")
	public ModelAndView datePage() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("date", new Date());
		mav.setViewName("index");
		return mav;
	}
	
}
