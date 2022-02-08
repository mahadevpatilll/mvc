package mvcpratice.crud.crontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mvcpratice.crud.model.Student;
import mvcpratice.crud.service.Servicelayerr;

//@Controller
public class Mycontroller {
	@Autowired
	Servicelayerr sl;

	@RequestMapping("/crud")
	public String meth() {
		return "insert";

	}

	@PostMapping("/insert")
	public String insertt(Student st) {
		sl.insert(st);
		return "success";
	}

	@RequestMapping("/retrive")
	public String getone() {
		return "getone";

	}

	@PostMapping("/getone")
	public String meth1(ModelMap mp, int id) {
		Student getone = sl.getone(id);
		mp.addAttribute("key", getone);

		return "success";
		}
	
	
	@RequestMapping("/getall")

	public String getall1() {
		return "getall";
		
	}
	@PostMapping("/fetchall")
		public String getall2(ModelMap mp) {
		List<Student> getall = sl.getall();
		mp.addAttribute("key",getall);
		
			return "getallop";
			
		}
	
	@GetMapping("/update")
	public String up() {
		return "updatee";
		
	}
	@PostMapping("/updateee")
	public String updatee(int id,String name,double sal) {
		sl.update(id,name,sal);
		
		return "updatesuccess";
		
	}
	
	@GetMapping("/delete")
	public String meth1() {
		return "deletepage";
		
	}
	@PostMapping("/deleting")
	public String hh(int id) {
		sl.deleted(id);
		return "deleted";
		
		
	}
	
	}

