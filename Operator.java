//The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'.
public class Operator {
        public static void main(String[] args) {
            int totalStudents = 90;
            int totalBoys = 45;
            int boysWithGradeA = 20;

            // Calculate total students with grade 'A'
            double totalGradeA = totalStudents * 0.5;

            // Calculate total girls with grade 'A'
            double girlsWithGradeA = totalGradeA - boysWithGradeA;

            System.out.println("Total girls with grade 'A': " + (int) girlsWithGradeA);
        }
    }


