import java.util.Scanner;

public class FirstPalindrom
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: words = ");
        String input = scanner.nextLine();
        String[] words = extractWords(input);


        String firstPalindrome = findFirstPalindrome(words);
        if (firstPalindrome == null)
        {
            System.out.println("\" \"");
        }
        else
        {
            System.out.println(firstPalindrome);
        }

        scanner.close();
    }


    public static String[] extractWords(String input)
    {
        input = input.substring(input.indexOf('[') + 1, input.lastIndexOf(']'));
        return input.split(",\\s*");
    }


    public static String findFirstPalindrome(String[] words)
    {
        for (String word : words)
        {
            if (isPalindrome(word))
            {
                return word;
            }
        }
        return null;
    }


    public static boolean isPalindrome(String str)
    {
        int left = 0;
        int right = str.length() - 1;
        while (left < right)
        {
            if (str.charAt(left++) != str.charAt(right--))
            {
                return false;
            }
        }

        return true;
}
}