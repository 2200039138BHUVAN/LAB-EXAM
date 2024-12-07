package com.klu.springmvchibernate;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Hibernate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate3.HibernateTemplate; 

public class DAO {
	HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	//method to save Student  
	public void saveStudent(Student s){  
	    template.save(s);  
	}  
	//method to update Student  
	public void updateStudent(Student s){  
	    template.update(s);  
	}  
	//method to delete Student  
	public void deleteStudent(Student s){  
	    template.delete(s);  
	}  
	//method to return one Student of given id  
	public Student getById(int id){  
	    Student s=(Student)template.get(Student.class,id);  
	    return s;  
	}  
	//method to return all Students  
	public List<Student> getStudents(){  
	    List<Student> list=new ArrayList<Student>();  
	    list=template.loadAll(Student.class);  
	    return list;  
	}  
	
}

