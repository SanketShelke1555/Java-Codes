package atm;

import java.util.Scanner;

public class Atmproject {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert Your Acc No: ");
        int n = sc.nextInt();
        
        int ac = n;

        switch (ac) {
        
            case 123456789:
            case 789456123:
            case 917206453:
                System.out.println("ATM Login Sucessful");
                
                Scanner option = new Scanner(System.in);
                System.out.print("Enter Your Choice:");
                int op = option.nextInt();
                
                switch (op) {
                
                    case 1:   // Withdrawal
                        Scanner withdrawl = new Scanner(System.in);
                        System.out.println("Enter Amount:");
                        int with = withdrawl.nextInt();    
                        
                        Scanner pin1 = new Scanner(System.in);
                        System.out.println("Enter Your Pin:");
                        int p1 = pin1.nextInt();
                        
                        int pi1 = p1;

                        switch (pi1) {
                            default:
                                if (pi1 == 1234||pi1==2545||pi1==7894) {
                                    int total = 500000;

                                    int newAm = total - with;
                                    total = newAm;
                                    
                                    System.out.println("Remaining Amount After Withdrawal: " + newAm);
                                }
                                else {
                                	
                                	System.out.println("Wrong Pin");
                                }
                                break;
                        }
                        break;
                        
                    case 2:  // Deposit
                        Scanner deposite = new Scanner(System.in);
                        System.out.print("Enter Amount to be Deposite:");
                        int depo = deposite.nextInt();
                        
                        Scanner pin2 = new Scanner(System.in);
                        System.out.println("Enter Your Pin:");
                        int p2 = pin2.nextInt();
                        
                        int pi2 = p2;
                        
                        switch (pi2) {
                            default:
                                if (pi2 == 2545|| pi2==1234||pi2==7894) {
                                    
                                    int total = 500000;   // same starting amount
                                    
                                    int newTotal = total + depo;   // deposit logic added
                                    total = newTotal;
                                    
                                    System.out.println("New Balance After Deposit: " + newTotal);
                                }
                                break;
                        }
                        break;
                        
                    default:
                        System.out.println("Invalid Option");
                        break;
                }

                break;

            default:
                System.out.println("Wrong ACC or Pin No.");
        }
    }
}
