package sf.crom.service;

import java.util.Set;

import sf.crom.domain.UserDet;
import sf.crom.domain.security.UserRole;

public interface UserService {

	UserDet createUser(UserDet user, Set<UserRole> userRoles);
	
}
