//package com.te.springmvc.controllers;
//
//import javax.servlet.http.HttpServletRequest;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.HttpServletBean;
//import org.springframework.web.servlet.ModelAndView;
//@Controller
//public class FristController {
//	@RequestMapping(path="/first", method=RequestMethod.GET)
//	public ModelAndView getFristPage() {
//		ModelAndView andVeiw = new ModelAndView();
//		andVeiw.addObject("name","Kavya");
//		andVeiw.setViewName("/WEB-INF/views/app.jsp");
//		//SetVeiw.setViewName("app");
//		return andVeiw;		
//	}
//	@GetMapping("/login")
//	@RequestMapping(path="/login", method=RequestMethod.GET)
//	public ModelAndView getLogin() {
//		ModelAndView andVeiw = new ModelAndView();
//		andVeiw.setViewName("/WEB-INF/views/login.jsp");
//	   return andVeiw;	
//	}
//	
//	@GetMapping("/login")
//	public String getFormData(HttpServletRequest request, ModelMap map)
//	{
//		 String username=request.getParameter("user");
//		 String password=request.getParameter("pwd");
//		map.addAttribute("user", "username");
//		map.addAttribute("pwd", "password");
//        return "home";
//		
//	}
//	
//	@PostMapping("/login")
//	public String getLoginPage()
//	{
//		return "loginpage";
//	}
//	
//	@PatchMapping("/Login")
//		public String getFormData(){
//			
//		return "home";
//	}
//	
//	@RequestMapping(path = "/search", method = RequestMethod.GET)
//	public ModelAndView getUserData(ModelAndView modelAndView) {
////		modelAndView.setViewName("/WEB-INF/views/user.jsp");
//		modelAndView.setViewName("userapp");
//		return modelAndView;
//	}
//
//	@GetMapping("/second")
//	public String getUser(ModelMap map) {
//		map.addAttribute("name", "Smith");
//		return "app"; // view name
//	}
//}
