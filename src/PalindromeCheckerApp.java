

import java.util.Scanner;

public class PalindromeCheckerApp {

    // main method: entry point of the application
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("   Palindrome Checker App - Use Case 4 ");
        System.out.println("=======================================");
        System.out.print("input:");

        // Take input from user
        String word = scanner.nextLine();

        // Convert string to character array
        char[] charArray = word.toCharArray();

        // Two-pointer approach
        int left = 0;
        int right = charArray.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Is a palindrome?:True");
        } else {
            System.out.println("Is a palindrome?:False");
        }

        System.out.println("---------------------------------------");
        System.out.println("Program exited successfully.");

        scanner.close();
    }
}