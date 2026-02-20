
import java.util.Scanner;

    public class PalindromeCheckerApp {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("=======================================");
            System.out.println("   Palindrome Checker App - Use Case 3 ");
            System.out.println("=======================================");
            System.out.print("Enter a word to check: ");


            String original = scanner.nextLine();


            String reversed = "";
            for (int i = original.length() - 1; i >= 0; i--) {
                reversed = reversed + original.charAt(i); // String concatenation
            }


            if (original.equals(reversed)) {
                System.out.println("Result: \"" + original + "\" is a palindrome.");
            } else {
                System.out.println("Result: \"" + original + "\" is NOT a palindrome.");
            }

            System.out.println("---------------------------------------");
            System.out.println("Program exited successfully.");

            scanner.close();
        }
    }