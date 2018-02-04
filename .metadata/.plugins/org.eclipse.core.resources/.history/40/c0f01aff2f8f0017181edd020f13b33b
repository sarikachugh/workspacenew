package sf.crom.service.impl;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sf.crom.domain.UserDet;
import sf.crom.domain.security.UserRole;
import sf.crom.repository.RoleRepository;
import sf.crom.repository.UserRepository;
import sf.crom.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Transactional
	public UserDet createUser(UserDet user, Set<UserRole> userRoles) {
		UserDet localUser = userRepository.findByUsername(user.getUsername());
		
		if(localUser != null) {
			LOG.info("User with username {} already exist. Nothing will be done. ", user.getUsername());
		} else {
			/*for (UserRole ur : userRoles) {
				roleRepository.save(ur.getRole());
			}*/
			
			user.getUserRoles().addAll(userRoles);
			
			localUser = userRepository.save(user);
		}
			
			return localUser;
	}
	
	
	
}
