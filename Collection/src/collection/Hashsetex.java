package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashsetex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet obj= new HashSet();
		 
		obj.add("Sanket");
		obj.add("Mansi");
		obj.add("Python");
		obj.add("MySQL");
		
		
		System.out.println(obj);
		
		Set courses = new HashSet(obj);
		
		
		courses.add("Java");
		courses.add("Python");
		courses.add("DSA");
		courses.add("C");
		courses.add("Mongo");
		courses.add("MySQL");
		
		
		System.out.println(courses);
		List next = new ArrayList(courses);
		
		next.add("Python");
		System.out.println(next);
	
	}

}
