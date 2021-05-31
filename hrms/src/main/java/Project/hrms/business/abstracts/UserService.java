package Project.hrms.business.abstracts;

import java.util.List;

import Project.hrms.core.utilities.results.DataResult;
import Project.hrms.core.utilities.results.Result;
import Project.hrms.entities.abstracts.User;

public interface UserService {
	DataResult<List<User>> getAll();
	Result add(User user); 
}
