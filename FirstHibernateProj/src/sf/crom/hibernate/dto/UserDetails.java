package sf.crom.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.SelectBeforeUpdate;
import org.hibernate.annotations.Type;

import javax.persistence.JoinColumns;

@Entity    /*(name="USER_DETAILS")   */       //treat this model class as entity we havae already mention this class in config xml file
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@NamedQuery(name="UserDetails.byId", query="from UserDetails where userId = ?")
//@NamedNativeQuery(name="UserDetails.byName", query="select * from user_details where username=? ", resultClass=UserDetails.class)
@SelectBeforeUpdate
//@Table (name="USER_DETAILS")
public class UserDetails {
	
	//@Column (name="USER_ID") //fields specific annotation can be write on the getter method as well with print output from getters
          //Auto --hibernate decision to pick strategy of generating primary key values that can be identity, sequence, table depending upon the databases the application is connecting to.
	//sequence - maintain depending on add sequence or next val of sequence int the database
	//identity - identity column is maintained with primary key is set on it, depending upon database supporting feature or not 
	//table - create seperate table with eache record has uniques primary key so hibernate create the table an generate the primary key record
	@Id @GeneratedValue (strategy=GenerationType.AUTO)      //treat this field user id values as primary key for this entity class
	private int userId;
	/*@EmbeddedId
	private LoginName userId;*/
	//@Column (name="USER_NAME")    to set field name
	                                     //@Basic ()
	//@Transient
	private String userName;             //Can be done transient as transient String userName for not saving or persisting any field into the database
	//@OneToMany(mappedBy="user")
	/*@JoinTable(name="USER_VEHICLE", joinColumns=@JoinColumn(name="USER_ID"),
				inverseJoinColumns=@JoinColumn(name="VEHICLE_ID"))*/
	//@ManyToMany(mappedBy="userList")
	/*@OneToMany(cascade=CascadeType.PERSIST)
	private Collection<Vehicle> vehicle = new ArrayList<Vehicle>();*/
	
	
	/*@OneToOne
	@JoinColumn(name="VEHICLE_ID")
	private Vehicle vehicle;*/
	//@ElementCollection(fetch=FetchType.EAGER)
	//@JoinTable(name="USER_ADDRESS", 
	//			joinColumns= @JoinColumn(name="USER_ID"))
	//@GenericGenerator(name="hilo-gen", strategy="hilo")
	//@GenericGenerator(name="sequence", strategy="sequence")
	//@GenericGenerator(name="hilo-gen", strategy="increment")
	//@CollectionId(columns = { @Column(name="ADDRESS_ID") }, generator = "hilo-gen", type = @Type(type="long"))
	//private Collection<Address> listOfAddresses = new ArrayList<Address>();
	/*private Set<Address> listOfAddresses = new HashSet<Address>();*/ 
	/*@Embedded
	private Address address;*/
	/*@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="street", column=@Column(name="HOME_STREET_NAME")),
	@AttributeOverride(name="city", column=@Column(name="HOME_CITY_NAME")),
	@AttributeOverride(name="state", column=@Column(name="HOME_STATE_NAME")),
	@AttributeOverride(name="pincode", column=@Column(name="HOME_PINCODE_NAME"))})
	private Address homeAddress;
	
	@Embedded
	private Address officeAddress;*/
	
	/*@Temporal (TemporalType.DATE)        //Date in format like date only time or timestamp bidefault it is timestamp without mentioning of annotations
	private Date joinedDate;
	private String Address;*/
	//@Lob        //choose either clob or blob dep on the field datatype     //Large Object 2 types Blob - byte large object, Clob -char large objects  ...lot of lines of description exceed to bidefult allocation 255.
	/*private String description;
	
	
	
	
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}*/
	
	
	
	
	/*public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}*/
	/*public Collection<Address> getListOfAddresses() {
		return listOfAddresses;
	}
	public void setListOfAddresses(Collection<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}*/
	public int getUserId() {
		return userId;
	}
	/*public Collection<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}*/
	/*public Set<Address> getListOfAddresses() {
		return listOfAddresses;
	}
	public void setListOfAddresses(Set<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}*/
	/*public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}*/
	/*public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}*/
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName; /*+ " from getter"*/
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}