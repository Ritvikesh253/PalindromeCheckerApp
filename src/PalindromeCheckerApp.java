import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Input: ");
        String input = scanner.nextLine();

        // Queue (FIFO) and Stack (LIFO) initialization
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue characters into Queue and push into Stack
        for (char c : input.toCharArray()) {
            queue.add(c);   // Enqueue
            stack.push(c);  // Push
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove(); // Dequeue
            char fromStack = stack.pop();    // Pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        if (isPalindrome) {
            System.out.println("Is palindrome?:true");
        } else {
            System.out.println("Is palindrome?:false");
        }

        scanner.close();
    }
}