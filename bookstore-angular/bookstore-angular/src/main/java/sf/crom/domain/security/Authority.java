package sf.crom.domain.security;

import java.io.Serializable;
import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority, Serializable {
	
	private static final long serialVersionUId = 123123L;

	private final String authority;
	
	public Authority(String Authority) {
			this.authority = Authority;	
	}
	
	@Override
	public String getAuthority() {
		return authority;
	}

}
