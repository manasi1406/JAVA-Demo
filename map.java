import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class map{
        public static void main(String[] args) {
            Map<String, Integer> studentScores = new HashMap<>();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter student names and CGPA\n");
            while (true) {
                String input = scanner.nextLine();
                if (input.equals("exit")) {
                    break;
                }
                String[] parts = input.split(" ");
                if (parts.length == 2) {
                    String name = parts[0];
                    int CGPA = Integer.parseInt(parts[1]);
                    studentScores.put(name, CGPA);
                } else {
                    System.out.println("Not a valid input");
                }
            }
            System.out.println("Student CGPA:");
            for(Map.Entry<String, Integer> entry: studentScores.entrySet()) {
                System.out.println(entry.getKey() + "'s CGPA: " + entry.getValue());
            }
        }
    }


