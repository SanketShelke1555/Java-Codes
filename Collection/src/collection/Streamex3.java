package collection;

import java.util.Arrays;
import java.util.List;

public class Streamex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Sanket","Mansi","Rohit","Vedant","Tanmay","Mugdha");
		
		System.out.println("Names staring with M: ");
		
		names.stream().filter(e->e.startsWith("M")).forEach(System.out::println);
		
		System.out.println("Ends with i: ");
		
		names.stream().filter(e->e.endsWith("i")).forEach(System.out::println);

		
		System.out.println("Contains ank: ");
		
		names.stream().filter(e->e.contains("an")).forEach(System.out::println);
	}

}
