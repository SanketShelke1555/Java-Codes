import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        // Uncomment the operation you want to perform

        // insert(factory);
        // read(factory);
        // update(factory);
        // delete(factory);

        factory.close();
    }

    // ================= INSERT =================
    public static void insert(SessionFactory factory) {

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Department dept = new Department();
        dept.setDeptId(101);
        dept.setDeptName("HR");

        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Sanket");
        e1.setEmail("sanket@gmail.com");
        e1.setSalary(50000);
        e1.setDepartment(dept);

        Employee e2 = new Employee();
        e2.setId(2);
        e2.setName("Rahul");
        e2.setEmail("rahul@gmail.com");
        e2.setSalary(45000);
        e2.setDepartment(dept);

        dept.setEmployees(Arrays.asList(e1, e2));

        session.save(dept);

        tx.commit();
        session.close();

        System.out.println("Data Inserted Successfully");
    }

    // ================= READ =================
    public static void read(SessionFactory factory) {

        Session session = factory.openSession();

        Department dept = session.get(Department.class, 101);

        if (dept != null) {
            System.out.println("Department ID : " + dept.getDeptId());
            System.out.println("Department Name : " + dept.getDeptName());

            for (Employee e : dept.getEmployees()) {
                System.out.println("----------------------");
                System.out.println("Employee ID : " + e.getId());
                System.out.println("Name : " + e.getName());
                System.out.println("Email : " + e.getEmail());
                System.out.println("Salary : " + e.getSalary());
            }
        } else {
            System.out.println("Department Not Found");
        }

        session.close();
    }

    // ================= UPDATE =================
    public static void update(SessionFactory factory) {

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Employee emp = session.get(Employee.class, 1);

        if (emp != null) {
            emp.setSalary(70000);
            emp.setEmail("newsanket@gmail.com");

            session.update(emp);

            System.out.println("Employee Updated");
        } else {
            System.out.println("Employee Not Found");
        }

        tx.commit();
        session.close();
    }

    // ================= DELETE =================
    public static void delete(SessionFactory factory) {

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Employee emp = session.get(Employee.class, 2);

        if (emp != null) {
            session.delete(emp);
            System.out.println("Employee Deleted");
        } else {
            System.out.println("Employee Not Found");
        }

        tx.commit();
        session.close();
    }
}