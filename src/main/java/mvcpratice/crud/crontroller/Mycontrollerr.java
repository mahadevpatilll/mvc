package mvcpratice.crud.crontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
public class Mycontrollerr {

	@RequestMapping("/hello")
	public String meth() {
		return "login";

	}

	@PostMapping("/details")
	public String meth1(HttpServletRequest req) {
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		if(name.equals("mahadev")) {
		//if (name.isEmpty()) {
			return "failure";
		} else {
			return "success";
		}

	}
	
	
	

}
