package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		normal code for getting even no
		
		List<Integer> l1= Arrays.asList(7,8,9,4,6,5,3,2,1);
		
		List<Integer> l2 = new  ArrayList<>();
		
		
		for(int i:l1) {
			
			if(i%2==0) {
				
				l2.add(i);
			}
		}
		
//		with streamAPI code using lambda 
		
		System.out.println("Even list:"+l2);
		
		List<Integer> l3 = Arrays.asList(7,8,9,6,5,4,1,2,3);
		
		System.out.println("Even List:");
		
		l3.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
		
//		with stream and store in another list
		
		List<Integer> l4= Arrays.asList(3,2,5,1,6,4,8,9,7);
		
		List<Integer> l5=l4.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		System.out.println("Even List:"+l5);
	}

}
