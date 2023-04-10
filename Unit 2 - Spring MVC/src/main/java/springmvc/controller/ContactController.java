package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	@RequestMapping("/contact")
public String showForm() {
	
	return "contact";
}
	/* MODEL.ADDATTRIBURE & REQUESTMAPPING & REQUESTPARAM*/
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(@RequestParam("name")String name, @RequestParam("email")String email,
			@RequestParam("message")String message, Model model) {
		System.out.println("Customer name is: "+name);
		System.out.println("Customer email is: "+email);
		System.out.println("Customer message is: "+message);
		
	model.addAttribute("name", name);
	model.addAttribute("email",email);
	model.addAttribute("message", message);
		return "success";
	}
	
	
	//ModelAttribute
//	@RequestMapping(path="/processform", method=RequestMethod.POST)
//	public String handleform(@ModelAttribute User user,Model model) {
//		System.out.println(user);
//		return "success";
//	}
}
