package Project.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Project.hrms.business.abstracts.JobPositionService;
import Project.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {

	
	@Autowired
	private JobPositionService jobPositionService;

	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return this.jobPositionService.getAll();
	}
}