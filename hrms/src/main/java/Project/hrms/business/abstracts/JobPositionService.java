package Project.hrms.business.abstracts;

import java.util.List;

import Project.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}