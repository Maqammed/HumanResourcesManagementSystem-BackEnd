package Project.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity 
@Table(name="employers")
@Data
public class Employer {

	@Id
    @GeneratedValue
    @Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private int userId; 
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="website")
	private String website;
	
	@Column(name="phone_number")
	private String phoneNumber;

	public Employer() {}

	public Employer(int id, int userId, String companyName, String website, String phoneNumber) {
		super();
		this.id = id;
		this.userId = userId;
		this.companyName = companyName;
		this.website = website;
		this.phoneNumber = phoneNumber;
	}
	
	
}
