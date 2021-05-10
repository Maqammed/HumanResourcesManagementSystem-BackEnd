package Project.hrms.business.abstracts;

import java.util.List;

import Project.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	List<JobSeeker> getAll();
}