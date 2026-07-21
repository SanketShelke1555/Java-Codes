import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Studentmain {

    public static void main(String[] args) {

        SessionFactory factory = HibernateUtil.getSessionFactory();

        Session session = factory.openSession();

        // Uncomment the method you want to execute

        // InsertData(session);
        // GetDataBYHQL(session);
        UpdateDataBYHQL(session);
        // DeleteDataBYHQL(session);

        session.close();
        factory.close();
    }

    // Insert Data
    public static void InsertData(Session session) {

        Scanner sc = new Scanner(System.in);

        Transaction tx = session.beginTransaction();

        Employee emp = new Employee();

        System.out.println("Enter Id:");
        emp.setId(sc.nextInt());

        System.out.println("Enter Name:");
        emp.setName(sc.next());

        System.out.println("Enter Salary:");
        emp.setSalary(sc.nextDouble());

        System.out.println("Enter Email:");
        emp.setEmail(sc.next());

        session.save(emp);

        tx.commit();

        System.out.println("Employee Record Saved Successfully...");
    }

    // Display Data
    public static void GetDataBYHQL(Session session) {

        Query<Employee> query = session.createQuery("from Employee", Employee.class);

        List<Employee> li = query.getResultList();

        for (Employee emp : li) {

            System.out.println("ID : " + emp.getId());
            System.out.println("Name : " + emp.getName());
            System.out.println("Salary : " + emp.getSalary());
            System.out.println("Email : " + emp.getEmail());
            System.out.println("------------------------");
        }
    }

    // Update Data
    public static void UpdateDataBYHQL(Session session) {

        Scanner sc = new Scanner(System.in);

        Transaction tx = session.beginTransaction();

        String hql = "update Employee set name=?0,email=?1 where id=?2";

        Query<?> query = session.createQuery(hql);

        System.out.println("Enter Id which you have to update:");
        query.setParameter(2, sc.nextInt());

        System.out.println("Enter New Name:");
        query.setParameter(0, sc.next());

        System.out.println("Enter New Email:");
        query.setParameter(1, sc.next());

        int i = query.executeUpdate();

        tx.commit();

        if (i > 0)
            System.out.println("Data Updated Successfully...");
        else
            System.out.println("Employee Not Found...");
    }

    // Delete Data
    public static void DeleteDataBYHQL(Session session) {

        Scanner sc = new Scanner(System.in);

        Transaction tx = session.beginTransaction();

        String hql = "delete from Employee where id=?0";

        Query<?> query = session.createQuery(hql);

        System.out.println("Enter Id to Delete:");
        query.setParameter(0, sc.nextInt());

        int i = query.executeUpdate();

        tx.commit();

        if (i > 0)
            System.out.println("Data Deleted Successfully...");
        else
            System.out.println("Employee Not Found...");
    }
}