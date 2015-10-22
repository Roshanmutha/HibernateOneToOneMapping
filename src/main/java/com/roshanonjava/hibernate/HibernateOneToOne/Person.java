package com.roshanonjava.hibernate.HibernateOneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * This class represents one to one relashionships. Here person and
 * persondetails are two entities.
 * 
 * Person does not have information of FK table.Here you link 2 tables together,
 * only 1 of those tables has a foreign key constraint to the other one.
 * 
 * MappedBy allows you to still link from the table not containing the
 * constraint to the other table.
 * 
 * Person has normal @GeneratedValue where as persondetail will have @GenericGenerator created with strategy="foreign"
 * 
 * @author roshankumarm
 *
 */
@Entity
@Table(name = "person")
public class Person {
	@Id
	@Column(name = "person_id")
	@GeneratedValue
	private int personId;

	@Column(name = "name")
	private String personName;

	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	private PersonDetail personDetail;

	public PersonDetail getPersonDetail() {
		return personDetail;
	}

	public void setPersonDetail(PersonDetail personDetail) {
		this.personDetail = personDetail;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

}
