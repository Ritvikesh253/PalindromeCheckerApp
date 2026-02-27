import java.util.Scanner;

/**
 * UC10 - Case-Insensitive and Space-Ignored Palindrome Checker.
 * Version: 1.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("  Palindrome Checker App - Use Case 10  ");
        System.out.println("========================================");
        System.out.print("Input: ");

        String input = scanner.nextLine();
        boolean result = isNormalizedPalindrome(input);

        if (result) {
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Result: It is not a Palindrome");
        }

        scanner.close();
    }

    /**
     * Normalizes text by removing spaces and lowercasing,
     * then checks palindrome using two pointers.
     */
    public static boolean isNormalizedPalindrome(String text) {
        String normalized = text.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
