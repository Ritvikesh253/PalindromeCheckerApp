import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

/**
 * UC12 - Strategy Pattern for Palindrome Algorithms.
 * Version: 1.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("  Palindrome Checker App - Use Case 12  ");
        System.out.println("========================================");
        System.out.println("Choose strategy: 1) Stack  2) Deque");
        System.out.print("Choice: ");
        int choice = Integer.parseInt(scanner.nextLine());

        System.out.print("Input: ");
        String input = scanner.nextLine();

        PalindromeStrategy strategy;
        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        PalindromeService service = new PalindromeService(strategy);
        boolean result = service.check(input);

        if (result) {
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Result: It is not a Palindrome");
        }

        scanner.close();
    }

    /** Strategy interface. */
    interface PalindromeStrategy {
        boolean isPalindrome(String text);
    }

    /** Stack-based strategy implementation. */
    static class StackStrategy implements PalindromeStrategy {
        @Override
        public boolean isPalindrome(String text) {
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
    }

    /** Deque-based strategy implementation. */
    static class DequeStrategy implements PalindromeStrategy {
        @Override
        public boolean isPalindrome(String text) {
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

    /** Runtime strategy injection via constructor. */
    static class PalindromeService {
        private final PalindromeStrategy strategy;

        PalindromeService(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        boolean check(String text) {
            return strategy.isPalindrome(text);
        }
    }
}
