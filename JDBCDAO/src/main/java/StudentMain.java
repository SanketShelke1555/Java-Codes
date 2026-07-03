import java.sql.SQLException;

public class StudentMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(6,"Manu",40); //to insert new record.
		Student s2=new Student(2); //to delete,update,display.
		
		StudentDAO dao=new StudentDAO();
		
		
		dao.connect();
//		dao.insertStudent(s1);
//		dao.deleteStudent(s2);
//		dao.updateStudent(s3);
		dao.displaystudent(s2);
		
		
	}

}
