package oopspillars;

public class testthird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int sum = 0;

        for (int num = 1; num <= 50; num++) {
            
            int count = 0;

         
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) { 
                sum = sum + num;
            }
        }

        System.out.println("Sum of prime numbers from 1 to 50 = " + sum);
    }
}

	
