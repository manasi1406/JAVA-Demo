//Multilevel INHERITANCE
import java.util.Scanner;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

  public void introduce(){
        System.out.println("Hello, my name is " + name + ".");
    }
}

class Emp extends Person{
    String designation;

    public Emp(String name, String designation) {
        super(name);
        this.designation = designation;
    }

    public void work(){
        System.out.println(name + " is working as a " + designation + ".");
    }
}

class Manager extends Emp {
    int teamSize;

    public Manager(String name, String designation, int teamSize) {
        super(name, designation);
        this.teamSize = teamSize;
    }

    void manageTeam() {
        String name = new String();
        System.out.println(name + " manages a team of " + teamSize + " people.");
    }

}

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter manager's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter manager's designation: ");
        String designation = scanner.nextLine();

        System.out.print("Enter manager's team size: ");
        int teamSize = scanner.nextInt();

        Manager manager = new Manager(name, designation, teamSize);
        manager.introduce();
        manager.work();
        manager.manageTeam();



    }
}
