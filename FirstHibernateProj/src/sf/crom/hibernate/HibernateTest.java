package sf.crom.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import sf.crom.hibernate.dto.Address;
import sf.crom.hibernate.dto.FourWheeler;
import sf.crom.hibernate.dto.TwoWheeler;
import sf.crom.hibernate.dto.UserDetails;
import sf.crom.hibernate.dto.Vehicle;

public class HibernateTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//UserDetails user = new UserDetails();     //save user need to read configuration configure d/base  by create build session factory object 
		                                          //create session from the session factory object
		                                          //open session and to save the objects we can do lot of save of number of object in one transaction by open transaction
		//user.setUserId(1);
		/*user.setUserName("First User");*/
		
		/*UserDetails user = new UserDetails();
		user.setUserName("Test User");  */               //transient object before handing over to hibernate for save, the object is called as transient object
		
		
		/*Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");
		
		TwoWheeler bike = new TwoWheeler();
		bike.setVehicleName("Bike");
		bike.setSteeringHandle("Bike Steering Handle");
		
		FourWheeler car = new FourWheeler();
		car.setVehicleName("Porsche");
		car.setSteeringWheel("Porsche Steering Wheel");*/
		
		
		/*Vehicle vehicle2 = new Vehicle(); 
		vehicle2.setVehicleName("Jeep");*/
		
		/*user.getVehicle().add(vehicle);   //One To Many
		user.getVehicle().add(vehicle2);*/
		
		/*user.setVehicle(vehicle);*/    //One To One
		
		/*vehicle.setUser(user);        //Many To One
		vehicle2.setUser(user);*/
		
		/*vehicle.getUserList().add(user);   //Many To Many
		vehicle2.getUserList().add(user);*/
				
		
		/*Address addr1 = new Address();
		addr1.setStreet("First Street");
		addr1.setCity("First City");
		addr1.setState("First State");
		addr1.setPincode("121001");
		
		Address addr2 = new Address();
		addr2.setStreet("Second Street");
		addr2.setCity("Second City");
		addr2.setState("Second State");
		addr2.setPincode("121002");
		
		user.getListOfAddresses().add(addr1);
		user.getListOfAddresses().add(addr2);
		*/
		/*UserDetails user2 = new UserDetails();
		user2.setUserName("Second User");*/
		
		/*Address addr = new Address();
		addr.setStreet("Street Name");
		addr.setCity("City Name");
		user.setHomeAddress(addr);*/
		
		/*user.setAddress(addr);*/
		
		/*Address addr2 = new Address();
		addr.setStreet("Second Street Name");
		addr.setCity("Second City Name");
		user.setOfficeAddress(addr2);	*/	
		
		/*user.setAddress("First Users's address");
		user.setJoinedDate(new Date());
		user.setDescription("Description of the user goes here");*/
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();    //creater once per application expensive object
		Session session = sessionFactory.openSession();
		session.beginTransaction();           //transaction begin
		//String minUserId = " 5 or 1 = 1";     //int minUserId = 5;
		//String minUserId = "5";
		//String userName = "User 9";
		//Query query = session.createQuery("from UserDetails");   /*where userId > 5*/
		/*Query query = session.createQuery("select userName from UserDetails");*/
		//Query query = session.createQuery("from UserDetails where userId > ? and userName = ?");
		//Query query = session.createQuery("from UserDetails where userId > :userId and userName = :userName");
		//Query query = session.getNamedQuery("UserDetails.byId");
		//Query query = session.getNamedQuery("UserDetails.byName");
		//query.setString(0, "User 9");
		/*UserDetails exampleUser =  new UserDetails();
		//exampleUser.setUserId(5);
		exampleUser.setUserName("User 0%");*/
		
		/*Example example = Example.create(exampleUser).enableLike();   excludeProperty("userName")
		Criteria criteria = session.createCriteria(UserDetails.class)
							.add(example);*/
							//.addOrder(Order.desc("userId")); 
				//.setProjection(Projections.count("userId"));
				            //.setProjection(Projections.max("userId"));
				            //.setProjection(Projections.property("userId"));
		//criteria.add(Restrictions.or(Restrictions.between("userId", 1, 5), Restrictions.between("userId", 7, 10)));
		
		/*add(Restrictions.like("userName", "%User 8%"))  //bidefault and operation takes place with chain restrictions
  		.add(Restrictions.between("userId", 5, 9));*/ 
		//criteria.add(Restrictions.gt("userId", 5));    //.add(Restrictions.eq("userName", "User 9"))
		
		//query.setInteger("userId", Integer.parseInt(minUserId));
		//query.setString("userName", userName);
		/*query.setInteger(0, Integer.parseInt(minUserId));
		query.setString(1, userName);*/
		//Query query = session.createQuery("select new map(userId, userName) from UserDetails"); 
		/*Query query = session.createQuery("select max(userId) from UserDetails");*/
		/*query.setFirstResult(5);
		query.setMaxResults(4);*/
		/*List<UserDetails> users = (List<UserDetails>) criteria.list();*/
		//List<UserDetails> users = (List<UserDetails>) query.list();
		//List<String> userNames = (List<String>) query.list();
		
	/*UserDetails user = (UserDetails) session.get(UserDetails.class, 1);*/
		
		Query query = session.createQuery("from UserDetails user where user.userId= 1");
		query.setCacheable(true);
		List users = query.list();
	
	//user.setUserName("Updated User");
	//UserDetails user2 = (UserDetails) session.get(UserDetails.class, 1);
	
	session.getTransaction().commit();  //close the transaction
    session.close();
    
    Session session2 = sessionFactory.openSession();
	session2.beginTransaction();    
	
	/*UserDetails user2 = (UserDetails) session2.get(UserDetails.class, 1);*/
	
	Query query2 = session2.createQuery("from UserDetails user where user.userId= 1");
	query2.setCacheable(true);
	users = query2.list();
		
		/*UserDetails user = (UserDetails) session.get(UserDetails.class, 1);*/
		
		//user.setUserName("Updated User");
		/*session.save(user);                         //persistent object tracks the object till transaction close or session close and reflect the changes the lasted (most updated updates) made to the object and track same into to database accordingly (avoid unnecessary updates, the latest changes made to the object will be onlu updated into the database).
		user.setUserName("Updated User Again");
		user.setUserName("Updated User2");*/
		//session.persist(user);                  //save the object
		/*session.save(vehicle);
		session.save(vehicle2);*/
		/*session.save(vehicle);
		session.save(bike);
		session.save(car);*/
		/*for (int i=0; i<10; i++) {
			UserDetails user = new UserDetails();
			user.setUserName("User " + i);
			session.save(user);                   //create new 10 objects hers (C of crud)
		}*/
		/*UserDetails user = (UserDetails) session.get(UserDetails.class, 5);
		user.setUserName("Updated User");
		session.update(user);*/
		/*session.delete(user);*/
		/*System.out.println("User name pulled up is: " + user.getUserName());*/
		session2.getTransaction().commit();  //close the transaction
        session2.close();             //Dteach object the hibernate is not going to track the object anymore, not persisted into the database, it means the onject was persisted and tracked by hibernate befor but now session has been closed so it no longer will be tracked by hibernate
        /*for (String u: userNames)
			System.out.println(u);*/
        
        /*for (UserDetails u: users)
			System.out.println(u.getUserName());*/
		
        //System.out.println("Size of list result = " + users.size());
        //user.setUserName("Updated User after session closed");
        /*user.setUserName("Changed name");*/
        
        /*session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(user);*/
		//user.setUserName("Change after update");
		/*session.getTransaction().commit();
		session.close();*/
        /*System.out.println("User name pulled up is: " + user.getUserName());*/
        /*session.save(user2);*/
		//for fetching the object again from the database which is inserted earlier by the session via session factory object which would not 
		//   initialize again or instantiate again in for the same application
		
		//create a new session for fetching the same object saved / persist earlier into the d/base
	    /*session=null;
        user = null;
        
        session = sessionFactory.openSession();
		session.beginTransaction();
		user = (UserDetails) session.get(UserDetails.class, 1);
		session.close();
		System.out.println(user.getListOfAddresses().size()); */    //fetching the data when only accessing it is the lazy fetch..it only get the first level member variable data and fetch the list when only access it, default behaviour it doesn not intializes the list only first level variable
		//System.out.println("User Name retreived is 123 " + user.getUserName().trim()+" "+user.getAddress());
		//session.getTransaction().commit();  //close the transaction
		//session.close();
        	
	}
}

