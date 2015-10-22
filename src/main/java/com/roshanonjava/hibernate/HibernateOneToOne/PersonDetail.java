package com.roshanonjava.hibernate.HibernateOneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * @author roshankumarm
 * 
 * @OneToOne(mappedBy = "person", cascade = CascadeType.ALL) Person has normal @GeneratedValue
 *                    where as persondetail will have @GenericGenerator created
 *                    with strategy="foreign" and value is person.
 * 
 * @GenericGenerator(name = "gen", strategy = "foreign", parameters =
 *                        @Parameter(name = "property", value = "person")) Here
 *                        when you persist person then person id will be
 *                        generated.When we go for persondetail persist then
 *                        Genric genrator indicate that we need to use person id
 *                        of person entity as primary key for persondetail
 *                        object.
 *
 */
@Entity
@Table(name = "person_detail")
public class PersonDetail {

	@Id
	@Column(name = "personDetailPK")
	@GeneratedValue(generator = "gen")
	@GenericGenerator(name = "gen", strategy = "foreign", parameters = @Parameter(name = "property", value = "person"))
	private int personDetailPK;
	@Column
	private String job;
	@Column
	private String zipcode;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getPersonDetailPK() {
		return personDetailPK;
	}

	public void setPersonDetailPK(int personDetailPK) {
		this.personDetailPK = personDetailPK;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public PersonDetail() {
		// TODO Auto-generated constructor stub
	}

}
