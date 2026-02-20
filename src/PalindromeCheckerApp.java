public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker App!");

        // UC2: Hardcoded palindrome check
        String hardcodedString = "radar";
        if (isPalindrome(hardcodedString)) {
            System.out.println(hardcodedString + " is a palindrome.");
        } else {
            System.out.println(hardcodedString + " is not a palindrome.");
        }
    }

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
