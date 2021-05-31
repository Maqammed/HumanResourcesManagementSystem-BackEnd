package Project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Project.hrms.business.abstracts.SystemStaffService;
import Project.hrms.dataAccess.abstracts.SystemStaffDao;
import Project.hrms.entities.concretes.SystemStaff;

@Service
public class SystemStaffManager implements SystemStaffService{

	private SystemStaffDao systemStaffDao;
	
	@Autowired
	public SystemStaffManager(SystemStaffDao systemStaffDao) {
		super();
		this.systemStaffDao = systemStaffDao;
	}

	@Override
	public List<SystemStaff> getAll() {
		return this.systemStaffDao.findAll();
	}

}
