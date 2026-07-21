import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class test {

    public static void main(String[] args) {

        SessionFactory factory = HibernateUtil.getSessionFactory();

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();


        Laptop lap = new Laptop();
        lap.setLid(101);
        lap.setName("Dell");
        lap.setCost(60000);

        // Employee Object
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("Sanket");
        emp.setEmail("sanket@gmail.com");
        emp.setSalary(50000);

        // One-to-One Mapping
        emp.setLap(lap);
        lap.setEmp(emp);

        session.save(lap);
        session.save(emp);

        tx.commit();

        session.close();
        factory.close();

        System.out.println("Data Saved Successfully...");
    }
}