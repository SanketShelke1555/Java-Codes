import java.sql.SQLException;

public class StudentMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(16,"Manisha",87);
		StudentDAQ s2 = new StudentDAQ();
		Student s3 = new Student(16);
		
		
		s2.connect();
		s2.insertdata(s1);
		
	}

}
