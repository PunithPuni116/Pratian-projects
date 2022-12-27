import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestMain {

	public static void main(String[] args) {
		
		Address address1 = new Address(1L,"ABC","Bangalore",123456L);
		Address address2 = new Address(2L,"ABCD","Chennai",451234L);
		Address address3 = new Address(3L,"ABCDE","Mumbai",211234L);
		Address address4 = new Address(4L,"ABCDEF","Delhi",12345632L);
		
		Address address = new Address();
		address.setId(5L);
		address.setCity("Address");
		address.setPincode(999999L);
		address.setStreetName("A");
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		
		session.save(address);
		session.save(address1);
		session.save(address2);
		session.save(address3);
		session.save(address4);
		tx.commit();
		

	}

}
