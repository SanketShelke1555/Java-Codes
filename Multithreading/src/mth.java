
public class mth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1=Thread.currentThread();
		
		System.out.println(t1);
		
		t1.setName("My Thread");
		System.out.println(t1);
		
		t1.setPriority(4);
		System.out.println(t1);
		
		System.out.println("Max ="+Thread.MAX_PRIORITY);
		System.out.println("Max ="+Thread.MIN_PRIORITY);
		System.out.println("Max ="+Thread.NORM_PRIORITY);
	}

}
