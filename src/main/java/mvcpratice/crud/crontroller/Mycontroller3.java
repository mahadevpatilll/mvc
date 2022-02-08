package mvcpratice.crud.crontroller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
public class Mycontroller3 {

	@RequestMapping("/cook")
	public String meth() {
		return "details";
		
	}
	
	@PostMapping("/details")
	public String meth1(String name,ModelMap mp,HttpServletResponse res) {
		mp.addAttribute("key",name);
		Cookie cookie = new Cookie("keyy", name);
		res.addCookie(cookie);
		return "info";
		
	}
	
	@GetMapping("/inbox")
	public String inbox(ModelMap mp,@CookieValue String keyy) {
		mp.addAttribute("k",keyy);
		
		return "cookie1";
		
	}
	
	
}
