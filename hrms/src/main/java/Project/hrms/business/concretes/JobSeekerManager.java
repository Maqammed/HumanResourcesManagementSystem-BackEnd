package Project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Project.hrms.business.abstracts.JobSeekerService;
import Project.hrms.core.utilities.results.DataResult;
import Project.hrms.core.utilities.results.Result;
import Project.hrms.core.utilities.results.SuccessDataResult;
import Project.hrms.core.utilities.results.SuccessResult;
import Project.hrms.dataAccess.abstracts.JobSeekerDao;
import Project.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public DataResult<List<JobSeeker>>getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"Listelendi !");
				
	}

	@Override
	public Result register(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("Is arayan eklendi !");
	}

}
