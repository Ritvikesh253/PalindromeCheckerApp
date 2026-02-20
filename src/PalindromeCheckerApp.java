import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;

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

        // UC3: User input palindrome check
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String userInput = scanner.nextLine();
        if (isPalindrome(userInput)) {
            System.out.println(userInput + " is a palindrome.");
        } else {
            System.out.println(userInput + " is not a palindrome.");
        }
        scanner.close();

        // UC4 – Character Array Based Palindrome Check
        String uc4Word = "level";
        System.out.println("UC4 - Character Array Check for: " + uc4Word);
        if (isPalindromeCharArray(uc4Word)) {
            System.out.println("Result: It is a Palindrome (using char array)");
        } else {
            System.out.println("Result: It is not a Palindrome (using char array)");
        }

        // UC5 – Stack-Based Palindrome Checker
        String uc5Word = "civic";
        System.out.println("UC5 - Stack-Based Check for: " + uc5Word);
        if (isPalindromeStack(uc5Word)) {
            System.out.println("Result: It is a Palindrome (using stack)");
        } else {
            System.out.println("Result: It is not a Palindrome (using stack)");
        }

        // UC6 – Queue + Stack Based Palindrome Check
        String uc6Word = "deed";
        System.out.println("UC6 - Queue + Stack Check for: " + uc6Word);
        if (isPalindromeQueueStack(uc6Word)) {
            System.out.println("Result: It is a Palindrome (using queue and stack)");
        } else {
            System.out.println("Result: It is not a Palindrome (using queue and stack)");
        }

        // UC7 – Deque-Based Optimized Palindrome Checker
        String uc7Word = "kayak";
        System.out.println("UC7 - Deque-Based Check for: " + uc7Word);
        if (isPalindromeDeque(uc7Word)) {
            System.out.println("Result: It is a Palindrome (using deque)");
        } else {
            System.out.println("Result: It is not a Palindrome (using deque)");
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

    /**
     * UC4: Checks if a given string is a palindrome using char array and two-pointer technique.
     * @param str the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindromeCharArray(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * UC5: Checks if a given string is a palindrome using a stack.
     * @param str the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindromeStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    /**
     * UC6: Checks if a given string is a palindrome using a queue and a stack.
     * @param str the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindromeQueueStack(String str) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }
        while (!queue.isEmpty()) {
            if (queue.poll() != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    /**
     * UC7: Checks if a given string is a palindrome using a deque.
     * @param str the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindromeDeque(String str) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}
