package Project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Project.hrms.entities.abstracts.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
