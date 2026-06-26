package String;

public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = String.format("%d", 102);
		System.out.println(s1);
		System.out.println(s1.getClass().getName());
		System.out.println(s1.getClass().getSimpleName());
	
		String s2 = String.format("%s", "welcome Student");
		System.out.println(s2);
		System.out.println(s2.getClass().getName());
		System.out.println(s2.getClass().getSimpleName());
		
		String s3 = String.format("%f", 102.35);
		String s4 = String.format("%c", 'A');
		System.out.println(s3);
		System.out.println(s3.getClass().getName());
		System.out.println(s3.getClass().getSimpleName());
		
		System.out.println(s4.getClass().getName());
		System.out.println(s4.getClass().getSimpleName());
		
		
	}

}
