package sf.crom.repository;

import org.springframework.data.repository.CrudRepository;

import sf.crom.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{

}
