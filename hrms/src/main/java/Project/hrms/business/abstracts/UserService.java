package Project.hrms.business.abstracts;

import java.util.List;

import Project.hrms.entities.concretes.User;

public interface UserService {
	List<User> getAll();
}
