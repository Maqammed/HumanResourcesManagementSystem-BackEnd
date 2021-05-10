package Project.hrms.business.abstracts;

import java.util.List;

import Project.hrms.entities.concretes.Employer;

public interface EmployerService {
	List<Employer> getAll();
}