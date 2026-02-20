/**
 * PalindromeCheckerApp - A console application for checking palindromes.
 * Version: 1.0
 * This application demonstrates basic palindrome checking functionality.
 */
public class PalindromeCheckerApp {
    /**
     * Main method - entry point of the application.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // UC1 – Application Entry & Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");

        // UC2 – Hardcoded Palindrome Check
        String hardcodedWord = "radar";
        System.out.println("Hardcoded Word : " + hardcodedWord);
        if (isPalindrome(hardcodedWord)) {
            System.out.println("Result : It is a Palindrome");
        } else {
            System.out.println("Result : It is not a Palindrome");
        }
    }

    /**
     * Checks if a given string is a palindrome.
     * @param str the string to check
     * @return true if the string is a palindrome, false otherwise
     */
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
