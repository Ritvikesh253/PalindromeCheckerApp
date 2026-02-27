import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

/**
 * UC13 - Performance Comparison of Palindrome Algorithms.
 * Version: 1.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("  Palindrome Checker App - Use Case 13  ");
        System.out.println("========================================");
        System.out.print("Input: ");

        String input = scanner.nextLine();
        int iterations = 10000;

        long iterativeTime = benchmarkIterative(input, iterations);
        long stackTime = benchmarkStack(input, iterations);
        long dequeTime = benchmarkDeque(input, iterations);

        System.out.println("\nAlgorithm Performance (nanoseconds):");
        System.out.println("Iterative Two-Pointer : " + iterativeTime);
        System.out.println("Stack-Based           : " + stackTime);
        System.out.println("Deque-Based           : " + dequeTime);

        scanner.close();
    }

    public static long benchmarkIterative(String text, int iterations) {
        long start = System.nanoTime();
        for (int index = 0; index < iterations; index++) {
            isPalindromeIterative(text);
        }
        return System.nanoTime() - start;
    }

    public static long benchmarkStack(String text, int iterations) {
        long start = System.nanoTime();
        for (int index = 0; index < iterations; index++) {
            isPalindromeStack(text);
        }
        return System.nanoTime() - start;
    }

    public static long benchmarkDeque(String text, int iterations) {
        long start = System.nanoTime();
        for (int index = 0; index < iterations; index++) {
            isPalindromeDeque(text);
        }
        return System.nanoTime() - start;
    }

    public static boolean isPalindromeIterative(String text) {
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

    public static boolean isPalindromeStack(String text) {
        Stack<Character> stack = new Stack<>();
        for (char character : text.toCharArray()) {
            stack.push(character);
        }
        for (char character : text.toCharArray()) {
            if (character != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeDeque(String text) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char character : text.toCharArray()) {
            deque.addLast(character);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}
