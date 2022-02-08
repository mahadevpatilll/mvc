package mvcpratice.crud.daolayer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import mvcpratice.crud.model.Student;

@Component
public class Daolayerr {

	public void insert(Student st) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gym");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(st);
		transaction.commit();

	}

	public Student getone(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gym");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Student find = em.find(Student.class, id);
		return find;
	}
	
	
	public List<Student> getall() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gym");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		String q="from Student";
		transaction.begin();
		Query createQuery = em.createQuery(q);
		
		List<Student> resultList = createQuery.getResultList();
return resultList;
		
	}

	public void update(int id, String name, double sal) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gym");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Student find = em.find(Student.class, id);
		find.setName(name);
		find.setSal(sal);
		transaction.commit();
		
	}

	public void deletee(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gym");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Student find = em.find(Student.class, id);
		em.remove(find);
		transaction.commit();
		

	}

}
