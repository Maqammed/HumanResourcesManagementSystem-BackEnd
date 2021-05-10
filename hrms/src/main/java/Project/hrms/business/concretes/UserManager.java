package Project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Project.hrms.business.abstracts.UserService;
import Project.hrms.dataAccess.abstracts.UserDao;
import Project.hrms.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userDao.findAll();
	}

}
