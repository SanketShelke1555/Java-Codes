
public class deadlockthread extends Thread {
	
	static Thread mainThread;
	
	public void run()
	{
		System.out.println("Child Thread waiting for main thread completion");
	try {
		
		mainThread.join();
		
	}
	catch(InterruptedException e) {
		
		System.out.println("Child thread execution completes");
	}
	}
	
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		deadlockthread.mainThread = Thread.currentThread();
		
		deadlockthread thread = new deadlockthread();
		
		thread.start();
		System.out.println("Main thread waiting for child thread completion");

		
		thread.join();
		System.out.println("Main thread execution completes");
	}

}
