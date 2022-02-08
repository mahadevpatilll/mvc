package mvcpratice.crud.crontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//@Controller
public class Mycontroller4 {

@GetMapping("/sessionn")
public String meth() {
	return "fun";
	
}

@PostMapping("/hello")
public String meth1(ModelMap mp,String name, HttpServletRequest req) {
	mp.addAttribute("key",name);
	HttpSession session = req.getSession();
	session.setAttribute("k", name);
	return "welcome";
	
}

@GetMapping("/session")
public String meth3(ModelMap mp,HttpServletRequest req) {
	HttpSession session = req.getSession(false);
	Object attribute = session.getAttribute("k");
	mp.addAttribute( "key",attribute);
	return "session";
	
}
	
}
