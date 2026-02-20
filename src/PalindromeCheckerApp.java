

import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("   Palindrome Checker App - Use Case 4 ");
        System.out.println("=======================================");
        System.out.print("input:");
        String word = scanner.nextLine();
        char[] charArray = word.toCharArray();
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