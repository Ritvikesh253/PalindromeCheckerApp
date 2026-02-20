// UseCase2PalindromeCheckerApp.java
import java.util.Scanner;

public class PalindromeCheckerApp {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("   Palindrome Checker App - Use Case 2 ");
        System.out.println("=======================================");
        System.out.print("Enter a word to check: ");


        String word = scanner.nextLine();

      ma
        if (isPalindrome(word)) {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a palindrome.");
        }

        System.out.println("---------------------------------------");
        System.out.println("Program exited successfully.");

        // Close scanner to avoid resource leak
        scanner.close();
    }

    // Helper method to check palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}