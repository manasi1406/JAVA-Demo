package day13;


import java.util.Scanner;

public class addEmployee {
    public static void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Information:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();

       var employee = new EmployeeDTO(name, id, department, salary);
        System.out.println("Employee added");
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Salary: " + employee.getSalary());
    }


    public static void displayEmployee() {
        EmployeeDTO employee = new EmployeeDTO();
        System.out.println("Employee Information:");
        System.out.println("Name: " + employee.getName());
        System.out.println("ID:"+ employee.getId());
        System.out.println("Department:" + employee.getDepartment());
        System.out.println("Salary:" + employee.getSalary());
    }
}


