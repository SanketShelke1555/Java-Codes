package String;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Code5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiner sj1 = new StringJoiner(",","[","]");
		
		sj1.add("A");
		sj1.add("B");
		sj1.add("C");
		System.out.println(sj1);
		
		
		
		StringJoiner sj2 = new  StringJoiner(":");
		
		sj2.add("P");
		sj2.add("Q");
		System.out.println(sj2);
		
		
		sj1.merge(sj2);
		System.out.println(sj1);
		
		
		
		StringTokenizer st = new StringTokenizer("Welcome back to my studyroom");
		
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
		}
		
		

	}

}
