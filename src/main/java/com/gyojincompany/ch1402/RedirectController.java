package com.gyojincompany.ch1402;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	
	@RequestMapping("/studentConfirm")
	public String studentRedirect(HttpServletRequest request, Model model) {
		
		String id = request.getParameter("id");
		if(id.equals("tiger")) {
			model.addAttribute("id", id);
			return "redirect:studentOk";
		}
		model.addAttribute("id", "FAIL!!");
		return "redirect:studentNg";
	}
	
	@RequestMapping("/studentOk")
	public String studentOk() {
		
		return "studentOk";
	}
	
	@RequestMapping("/studentNg")
	public String studentNg() {
		
		return "studentNg";
	}
	
	@RequestMapping("/student1")
	public String student1() {
		
		return "redirect:http://localhost:8888/ch1402/test.jsp";
	}
	
	
	

}
