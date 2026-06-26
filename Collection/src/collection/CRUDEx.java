package collection;

import java.util.LinkedList;
import java.util.Scanner;

public class CRUDEx {

    public static void main(String[] args) {

        LinkedList<String> obj = new LinkedList<>();

        obj.add("Apple");
        obj.add("Mango");
        obj.add("Grapes");
        obj.add("Banana");

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:
                System.out.print("Enter Fruit Name: ");
                String addFruit = sc.nextLine();
                obj.add(addFruit);
                System.out.println("Fruit Added Successfully!");
                break;

            case 2:
                System.out.print("Enter Fruit To Remove: ");
                String removeFruit = sc.nextLine();

                if (obj.remove(removeFruit)) {
                    System.out.println("Fruit Removed Successfully!");
                } else {
                    System.out.println("Fruit Not Found!");
                }
                break;

            case 3:
                System.out.print("Enter Old Fruit Name: ");
                String oldFruit = sc.nextLine();

                System.out.print("Enter New Fruit Name: ");
                String newFruit = sc.nextLine();

                int index = obj.indexOf(oldFruit);

                if (index != -1) {
                    obj.set(index, newFruit);
                    System.out.println("Fruit Updated Successfully!");
                } else {
                    System.out.println("Fruit Not Found!");
                }
                break;

            case 4:
                System.out.println("Current List: " + obj);
                break;

            case 5:
                System.out.println("Thank You!");
                break;

            default:
                System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}