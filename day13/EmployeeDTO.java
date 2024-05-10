package day13;
import java.util.Scanner;
public class EmployeeDTO {
     String name;
     int id;

     String department;
     double salary;

    public EmployeeDTO(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public EmployeeDTO() {
       String name;
       int id;
       String department;
       double salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}







