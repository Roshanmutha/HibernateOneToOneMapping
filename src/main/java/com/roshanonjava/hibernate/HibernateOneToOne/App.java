package com.roshanonjava.hibernate.HibernateOneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App {
	public static void main(String[] args) {
		System.out.println("Hibernate one to one (Annotation)");
		  System.out.println("Hibernate One-To-One example (Annotation)");
	         
	        SessionFactory sf = HibernateUtil.getSessionFactory();
	        Session session = sf.openSession();
	        session.beginTransaction();
	 
	       /* EmployeeDetail employeeDetail = new EmployeeDetail("10th Street", "LA", "San Francisco", "U.S.");
	         
	        Employee employee = new Employee("Nina", "Mayers", new Date(121212),
	                "114-857-965");
	        employee.setEmployeeDetail(employeeDetail);
	        employeeDetail.setEmployee(employee);
	         
	         
	        session.save(employee);
	 
	         
	        List<Employee> employees = session.createQuery("from Employee").list();
	        for (Employee employee1 : employees) {
	            System.out.println(employee1.getFirstname() + " , "
	                    + employee1.getLastname() + ", "
	                    + employee1.getEmployeeDetail().getState());
	        }*/
	        
	        PersonDetail personDetail=new PersonDetail();
	        personDetail.setJob("Softare Engg");
	        personDetail.setZipcode("411014");
	        Person person= new Person();
	        person.setPersonName("Roshankumar");
	        person.setPersonDetail(personDetail);
	        personDetail.setPerson(person);
	        session.save(person);
	        session.getTransaction().commit();
	        session.close();
	}
}
