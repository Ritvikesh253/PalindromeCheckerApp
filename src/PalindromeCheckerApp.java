
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("   Palindrome Checker App - Use Case 5 ");
        System.out.println("=======================================");
        System.out.print("Input:");
        String input = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }
        if (input.equals(reversed)) {
            System.out.println("Is it palindrome?:True");
        } else {
            System.out.println("Is it Palindrome?:False");
        }
        System.out.println("---------------------------------------");
        System.out.println("Program exited successfully.");
        scanner.close();
    }
}