import day13.*;
import java.util.Scanner;

import static day13.addEmployee.addEmployee;
import static day13.addEmployee.displayEmployee;


public class CompanyProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1.Add a new employee");
        System.out.println("2.Display employee details");
        System.out.println("3.Find Even Number");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addEmployee();
                break;
            case 2:
                displayEmployee();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}


