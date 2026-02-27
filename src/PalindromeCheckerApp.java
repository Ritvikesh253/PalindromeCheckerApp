import java.util.Scanner;

/**
 * UC9 - Recursive Palindrome Checker.
 * Version: 1.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("  Palindrome Checker App - Use Case 9  ");
        System.out.println("=======================================");
        System.out.print("Input: ");

        String input = scanner.nextLine();
        boolean result = isPalindromeRecursive(input, 0, input.length() - 1);

        if (result) {
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Result: It is not a Palindrome");
        }

        scanner.close();
    }

    /**
     * Recursively compares start and end characters.
     * Base condition stops recursion when pointers meet/cross.
     */
    public static boolean isPalindromeRecursive(String text, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (text.charAt(left) != text.charAt(right)) {
            return false;
        }

        return isPalindromeRecursive(text, left + 1, right - 1);
    }
}
