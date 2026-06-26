package collection;

import java.util.HashMap;
//in HashMap we can enter only single null value whenever we add new null value its data gets replaced, same goes with same name is Rahul is present 2 time the value assigned to it after gets assigned.  

public class HashMapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> obj = new HashMap<Integer, String>();
		
		obj.put(10000,"Sanket");
		obj.put(50000,"Rahul");
		obj.put(35000, "Mansi");
		obj.put(45000, "Sidd");
		
		System.out.println(obj);

	}

}
