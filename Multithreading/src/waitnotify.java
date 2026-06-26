public class waitnotify {

    class Bankex {

        int balance;

        Bankex(int balance) {
            this.balance = balance;
        }

        synchronized void withdraw(int wamount) throws InterruptedException {

            while (wamount > balance) {
                System.out.println("Wait till depositing the sufficient amount");
                wait();
            }

            this.balance = this.balance - wamount;
            System.out.println("Balance after withdrawal :" + this.balance);
        }

        synchronized void deposit(int damount) {

            System.out.println("Amount deposited:");
            this.balance = this.balance + damount;
            System.out.println(this.balance);
            notify();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        waitnotify obj = new waitnotify();     
        Bankex b1 = obj.new Bankex(5000);        

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    b1.withdraw(9000);
                } catch (InterruptedException e) {
                    e.printStackTrace();       
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                b1.deposit(5000);
            }
        });
 
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
 