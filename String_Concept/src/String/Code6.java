package String;

public class Code6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder s1 = new StringBuilder("Sanket");
		
		s1.append(" Atul");
		
		System.out.println(s1);
		
		s1.append(" Shelke");
		
		System.out.println(s1);
		
		System.out.println(s1.insert(5, "PHP"));
		
		System.out.println(s1.delete(6, 9));
		
		System.out.println(s1.replace(0, 7, ""));
		
		System.out.println(s1.reverse());
	}

}
