import java.util.Scanner;

/**
 * UC11 - Object-Oriented Palindrome Service.
 * Version: 1.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeCheckerService palindromeService = new PalindromeCheckerService();

        System.out.println("========================================");
        System.out.println("  Palindrome Checker App - Use Case 11  ");
        System.out.println("========================================");
        System.out.print("Input: ");

        String input = scanner.nextLine();
        boolean result = palindromeService.checkPalindrome(input);

        if (result) {
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Result: It is not a Palindrome");
        }

        scanner.close();
    }

    /**
     * Encapsulated palindrome service class.
     * Single responsibility: check whether text is palindrome.
     */
    static class PalindromeCheckerService {
        public boolean checkPalindrome(String text) {
            int left = 0;
            int right = text.length() - 1;

            while (left < right) {
                if (text.charAt(left) != text.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }
    }
}
