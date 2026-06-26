

class I extends Thread
{
	public void run()
	{
		for ( int i=1;i<3;i++);
		System.out.println("Hello Student");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class interrupyex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I t1=new I();
		t1.start();
		t1.interrupt();

	}

}
