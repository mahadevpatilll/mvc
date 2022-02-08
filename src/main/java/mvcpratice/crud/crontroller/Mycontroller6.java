package mvcpratice.crud.crontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller
public class Mycontroller6 {

@RequestMapping("/modelview")
public String meth() {
	return "models";
	
}
@PostMapping("/clickme")
public ModelAndView meth1(String name) {
	ModelAndView mp = new ModelAndView();
	mp.addObject("key",name);
	mp.setViewName("viewpage");
	return mp;
	
}
	
	
}
