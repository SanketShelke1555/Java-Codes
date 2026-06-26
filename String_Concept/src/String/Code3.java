package String;

public class Code3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "Sanket Atul Shelke";
		
		System.out.println("Original String:"+s1);
		
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(5, 7));
		System.out.println(s1.subSequence(0, 5));
		
		char a='A';
		String s2 = String.valueOf(a);
		
		System.out.println(s2);
		System.out.println(s2.getClass().getSimpleName());
	}

}
