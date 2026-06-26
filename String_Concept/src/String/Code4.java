package String;

public class Code4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		
		
		System.out.println(sb.append("Programming"));
		
		System.out.println(sb.insert(5, " PHP "));
		
		System.out.println(sb.delete(5, 9));
		
		System.out.println(sb.replace(0, 4, "HTML"));
		
		System.out.println(sb.reverse());
		
		sb.setLength(2);
		System.out.println(sb);
	}

}
