import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		Product p1=new Product(1,"watch","black",2500);
		Product p2= new Product(2,"shoes","black",2000);
		Product p3= new Product(3,"tv","black",30000);
		Product p4 =new Product (4,"shirt","white",2500);
		Product p5 = new Product(5,"camera","black",2500);
		
		
		Set<Product> s1 = new HashSet<Product>();
		s1.add(p1);
		s1.add(p2);
		s1.add(p3);
		System.out.println(s1);
		
		
		Set<Product> s2 = new HashSet<Product>();
		s2.add(p4);
		s2.add(p5);
		
		System.out.println(s2);
		
		Customer c1 = new Customer(101,"Akash",76655441);
		c1.setProducts(s1);
		
		
		Customer c2= new Customer(102,"Raj",76655441);
		c2.setProducts(s2);
		
		Customer c3 = new Customer(103,"Sairaj",76655411);
		c3.setProducts(s1);

		session.save(c1);
		session.save(c2);
		session.save(c1);
	}

}
