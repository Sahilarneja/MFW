package springmvc.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	//request mapping annotation (http servlet)
	@RequestMapping(path="/home",method=RequestMethod.GET)
public String home(Model model) {
		//creating  model object
		System.out.println("This is home url");
		model.addAttribute("name","Sahil");
		model.addAttribute("id",376);
	return "index";
}
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is About url");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		//creating model and view object
		System.out.println("This is HelpController ");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name","Hardik");
		modelAndView.addObject("id",0001);
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time", now);
		return modelAndView;
	}
}
