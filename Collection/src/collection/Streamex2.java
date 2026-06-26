package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		create a blank stream
		
		Stream<Object> emptyStream=Stream.empty();
		
		
//		create strem using array
		
		String names[] = {"Sanket","Mansi","Rohit","Vedant"};
		
		Stream<String> nm = Stream.of(names);
		
		nm.forEach(e->{
			System.out.println(e);
		});

		
//		Strem using streambuilder
		
		Stream<Object> streambuilStream= Stream.builder().build();
		
		
//		Stream on anonymous array
		
		IntStream stream = Arrays.stream(new int[] {3,4,5,6,2,1});
		stream.forEach(e->System.out.println(e));
		
		
		
//		Stream on collection
		
		List<Integer> l1= new ArrayList<>();
		l1.add(11);
		l1.add(12);
		l1.add(23);
		
		Stream<Integer> s1=l1.stream();
		
		s1.forEach(e->System.out.println(e));
	}

}
