package sf.crom.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import sf.crom.domain.UserDet;
import sf.crom.repository.UserRepository;

@Service
public class UserSecurityService implements UserDetailsService {
	
	private static final Logger Log = LoggerFactory.getLogger(UserSecurityService.class);

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDet user = userRepository.findByUsername(username);
		if(null == user) {
			Log.warn("Username {} not found", username);
			throw new UsernameNotFoundException("Username "+username+" not found");
		}
		return user;
	}
	
	
}
