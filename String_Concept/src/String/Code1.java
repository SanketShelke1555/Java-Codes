package String;

public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1 = "Hi Student";
		String str2 = "Hi Student";
		
		System.out.println("Memory="+(str1==str2));
		
		System.out.println("Data="+str1.equals(str2));
		
		String str3 = new String("Hi Student");
		System.out.println("Memory="+(str1==str3));
		
		System.out.println("Data="+str1.equals(str3));
		
		System.out.println(str2.toUpperCase());
		
		System.out.println(str3.toLowerCase());
		
		System.out.println(str2.length());
		
		System.out.println(str1.concat(str3));
		
		String str5="Hello";
		
		System.out.println(str1.compareTo(str5));
		
		System.out.println(str1.endsWith("t"));
		
		System.out.println(str1.contains("student"));
		
		System.out.println(str1.indexOf("d"));
		
		System.out.println(str1.replaceAll("s", "S"));
		
		System.out.println(str1.charAt(5));
	}

}
