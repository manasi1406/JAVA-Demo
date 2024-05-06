import java.util.ArrayList;
import java.util.Scanner;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (enter -1 to stop):");
        int num;
        while ((num = scanner.nextInt()) != -1) {
            numbers.add(num);
        }
        System.out.println("Numbers are:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}

