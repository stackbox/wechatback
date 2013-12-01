package org.stackbox.weixinback.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.stackbox.weixinback.entity.Admin;
import org.stackbox.weixinback.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired@Qualifier("adminService")
	private AdminService adminService;
	
	@RequestMapping(value={"/home","/index.*"})
	public String home() {
		 return "/index";
	}
	
	@RequestMapping(value={"/member/login"}, method=RequestMethod.POST)
	public String login(@ModelAttribute("admin") Admin admin, Model model, HttpSession session) {
		Admin resultAdmin = adminService.queryByNameAndPassword(admin.getAdminName(), admin.getPassword());
		
		System.out.println(admin.getAdminName());
		System.out.println(admin.getPassword());
		System.out.println("---");
		if(null != resultAdmin) {
			session.setAttribute("admin", resultAdmin);
			return "redirect:/dashboard";
		}
		return "redirect:/home";
	}
	
	@RequestMapping(value={"/member/logout"})
	public String logout(Model model, HttpSession session) {
		session.removeAttribute("admin");
		return "redirect:/home";
	}

}
