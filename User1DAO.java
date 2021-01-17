package user;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class User1DAO {

	public void addUser(String mobno, String password, String email, String AddL1, String AddL2, String City,
			String PinCode) {
		User1 u1 = new User1(mobno, password, email, AddL1, AddL2, City, PinCode);
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.save(u1);
		t.commit();
		session.close();
		System.out.println("User Saved");
	}

}
