

class x extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread 1="+i);
			Thread.yield();
		}
	}
}

class y extends Thread{
	
	public void run() {
		
		for(int i=11;i<=55;i++)
		{
			
			System.out.println("Thread 2="+i);
		}
	}
}
public class yeildmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x t2=new x();	
		y t1=new y();
			t1.start();
			t2.start();
			
	}

}
