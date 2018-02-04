package sf.crom.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
/*@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)*/
/*@Inheritance(strategy=InheritanceType.SINGLE_TABLE)*/   //Default single table strategy , not mandatory to use this annotation
/*@DiscriminatorColumn(name="VEHICLE_TYPE",                 //single table strategy configuation
				discriminatorType=DiscriminatorType.STRING)*/
public class Vehicle {
	@Id @GeneratedValue /*(strategy=GenerationType.AUTO)*/
	private int vehicleId;
	private String vehicleName;
	//@ManyToOne
	//@JoinTable(joinColumns=@JoinColumn(name="USER_ID_REF"))
	//@JoinColumn(name="USER_ID")
	//@NotFound(action=NotFoundAction.IGNORE)
	//private UserDetails user;
	/*@ManyToMany
	@JoinTable(name="VEHICLE_USER", joinColumns=@JoinColumn(name="VEHICLE_ID"),
			inverseJoinColumns=@JoinColumn(name="USER_ID"))
	private Collection<UserDetails> userList = new ArrayList<UserDetails>();*/
	
	
	
	/*public Collection<UserDetails> getUserList() {
		return userList;
	}
	public void setUserList(Collection<UserDetails> userList) {
		this.userList = userList;
	}*/
	/*public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}*/
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	
	
}
