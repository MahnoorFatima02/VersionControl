import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();

        String filteredString = filterInput(input);

        // comparing input string and its reverse string
        boolean isPalindrome = checkPalindrome(filteredString);
        if (isPalindrome) {
            System.out.println("The input \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The input \"" + input + "\" is not a palindrome.");
        }
    }

    // filters string to lower case and removing extra characters
    public static String filterInput(String input) {
        input = input.toLowerCase();
        input = input.replaceAll("[,!]","");
        return input;
    }

    // check if the input is palindrome
    public static boolean checkPalindrome(String input) {
        String reversedInput = reverseStringCharacters(input);
        return input.equals(reversedInput);
    }

    // returns a new string from reversing characters of existing one
    public static String reverseStringCharacters(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}