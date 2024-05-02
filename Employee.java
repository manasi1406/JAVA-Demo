//single Inheritance
import java.util.Scanner;
class Employee {
    String Name;
    int Age;
    public Employee(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }
    public void Introduce(){
        System.out.println("Hii My Name is " + Name + " And I am "+ Age +" Years old");
    }
}
class Trainee extends Employee{
    String Technology;

    public Trainee(String Name, int Age,String Technology) {
        super(Name, Age);
        this.Technology=Technology;
    }
    public void work(){
        System.out.println("And I worked on "   + Technology + " Technology");
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Trainee's name : ");
        String Name = sc.nextLine();
        System.out.println("Enter the Trainee's Age : ");
        int Age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Trainee's Technology : ");
        String Technology = sc.nextLine();
        Trainee T = new Trainee(Name, Age, Technology);
        T.Introduce();
        T.work();



    }
}
        