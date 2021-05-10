package Project.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity 
@Table(name="jobSeekers")
@Data
public class JobSeeker { 

	@Id
    @GeneratedValue
    @Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identification_number")
	private String identificationNumber;
	
	@Column(name="birht_year")
	private int birthYear;

	
	public JobSeeker() {}
	
	public JobSeeker(int id, int userId, String firstName, String lastName, String identificationNumber,
			int birthYear) {
		super();
		this.id = id;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identificationNumber = identificationNumber;
		this.birthYear = birthYear;
	}

}
