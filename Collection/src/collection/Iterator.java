package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList obj = new ArrayList();
		
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(50);
		obj.add(60);
		obj.add(90);
		
		for( int i=0;i<obj.size();i++) {
			
			System.out.println(obj.get(i));
		}
		System.out.println("iterator using iterator");
		java.util.Iterator it = obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("Iterator using listiterator");
		ListIterator li=obj.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("Iterator using preivous");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
	}

}
