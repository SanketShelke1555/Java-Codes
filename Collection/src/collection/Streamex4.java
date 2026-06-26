package collection;

import java.util.Arrays;
import java.util.List;

public class Streamex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		numbers.stream().map(i->i*i).forEach(System.out::println);

	}

}
