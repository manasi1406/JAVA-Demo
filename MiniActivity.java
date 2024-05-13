import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MiniActivity {
    public static void main(String[] args) {
        String[] names = {"Amit", "Bhavya", "Chetan", "Deepak", "Ekta", "Farhan", "Gita", "Harsh", "Isha", "Jyoti"};

        // Count the number of names that have more than 5 characters.
        long countMoreThan5 = Arrays.stream(names)
                .filter(name -> name.length() > 5)
                .count();
        System.out.println("Number of names with more than 5 characters: " + countMoreThan5);

        // Find any name that has exactly 5 characters.
        String nameWithExactly5 = Arrays.stream(names)
                .filter(name -> name.length() == 5)
                .findAny()
                .orElse("No name found with exactly 5 characters.");
        System.out.println("Name with exactly 5 characters: " + nameWithExactly5);

        // Group the names by their first character.
        Map<Character, List<String>> groupedNames = Arrays.stream(names)
                .collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println("Names grouped by first character: " + groupedNames);

        // Sort the names in ascending order ignoring case, and then collect them into a list.
        List<String> sortedNames = Arrays.stream(names)
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
        System.out.println("Sorted names: " + sortedNames);
    }
}
