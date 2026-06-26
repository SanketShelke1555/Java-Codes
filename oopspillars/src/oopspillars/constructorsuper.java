package oopspillars;


class user2{
	
	user2(String name){
		
		System.out.println("Hello:"+name);

	}
}

class user3 extends user2{
	
	user3(String name1){
		super("Sanket");
		System.out.println("hi:"+name1);
			
		
	}
}
public class constructorsuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		user3 obj = new user3("Yash");
		
	}

}
