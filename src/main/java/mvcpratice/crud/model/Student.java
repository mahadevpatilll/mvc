package mvcpratice.crud.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
private int id;
private String name;
private double sal;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", sal=" + sal + "]";
}

	
	
	
}
