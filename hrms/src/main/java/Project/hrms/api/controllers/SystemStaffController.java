package Project.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Project.hrms.business.abstracts.SystemStaffService;
import Project.hrms.entities.concretes.SystemStaff;

@RestController
@RequestMapping("/api/systemstaffcontrollers")
public class SystemStaffController {
	
	private SystemStaffService systemStaffService;

	@Autowired
	public SystemStaffController(SystemStaffService systemStaffService) {
		super();
		this.systemStaffService = systemStaffService;
	}
	
	@GetMapping("/getall")
	public List<SystemStaff> getAll(){
		return this.systemStaffService.getAll();
	}
	
}
