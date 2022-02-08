package mvcpratice.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import mvcpratice.crud.daolayer.Daolayerr;
import mvcpratice.crud.model.Student;

//@Service
@Component
public class Servicelayerr {
	@Autowired
	Daolayerr dao;

	public void insert(Student st) {
		if (st != null) {
			dao.insert(st);
		}

	}

	public Student getone(int id) {
		if (id < 0) {
			throw new RuntimeException();
		}
		Student find = dao.getone(id);
		return find;

	}
	
	public List<Student> getall() {
		List<Student> getall = dao.getall();
		return getall;
	}

	public void update(int id, String name, double sal) {
		if(id<0) {
			throw new RuntimeException();
		}
		
		dao.update(id,name,sal);
		
		
	}

	public void deleted(int id) {
if(id==0) {
	throw new RuntimeException();
		
	}
	dao.deletee(id);
	
	
	
}
}