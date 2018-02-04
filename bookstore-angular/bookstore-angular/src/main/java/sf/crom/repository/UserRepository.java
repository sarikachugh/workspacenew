package sf.crom.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import sf.crom.domain.UserDet;

public interface UserRepository extends CrudRepository<UserDet, Long> {
	UserDet findByUsername(String username);
	UserDet findByEmail(String email);
	List<UserDet> findAll();

}
