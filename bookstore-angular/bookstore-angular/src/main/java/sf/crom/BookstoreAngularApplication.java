package sf.crom;


import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sf.crom.config.SecurityUtility;
import sf.crom.domain.UserDet;
import sf.crom.domain.security.Role;
import sf.crom.domain.security.UserRole;
import sf.crom.service.UserService;

@SpringBootApplication
public class BookstoreAngularApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreAngularApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		UserDet user1 = new UserDet();
		user1.setFirstName("John");
		user1.setLastName("Adams");
		user1.setUsername("j");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("p"));
		user1.setEmail("JAdams@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setRoleId(12);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));
		
		userService.createUser(user1, userRoles);
		userRoles.clear();
				
		
		UserDet user2 = new UserDet();
		user2.setFirstName("Admin");
		user2.setLastName("Admin");
		user2.setUsername("admin");
		user2.setPassword(SecurityUtility.passwordEncoder().encode("p"));
		user2.setEmail("Admin@gmail.com");
		Role role2 = new Role();
		role2.setRoleId(2);
		role2.setName("ROLE_ADMIN");
		userRoles.add(new UserRole(user2, role2));
		
		userService.createUser(user2, userRoles);
		
	}
}
