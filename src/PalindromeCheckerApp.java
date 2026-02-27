import java.util.Scanner;

/**
 * UC8 - Linked List Based Palindrome Checker.
 * Version: 1.0
 * This use case checks palindrome using a singly linked list.
 */
public class PalindromeCheckerApp {

    /**
     * Singly linked list node definition.
     */
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
        }
    }

    /**
     * Main method for UC8.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("  Palindrome Checker App - Use Case 8  ");
        System.out.println("=======================================");
        System.out.print("Input: ");

        String input = scanner.nextLine();
        boolean result = isPalindromeLinkedList(input);

        if (result) {
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Result: It is not a Palindrome");
        }

        scanner.close();
    }

    /**
     * Checks if the input string is a palindrome using singly linked list.
     * Steps:
     * 1) Convert string to linked list
     * 2) Find middle using fast and slow pointers
     * 3) Reverse second half in-place
     * 4) Compare first half and reversed second half
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n) for linked list node storage
     *
     * @param text input text
     * @return true if palindrome, otherwise false
     */
    public static boolean isPalindromeLinkedList(String text) {
        if (text == null || text.length() <= 1) {
            return true;
        }

        Node head = buildLinkedList(text);

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalfHead = (fast != null) ? slow.next : slow;
        Node reversedSecondHalf = reverseList(secondHalfHead);

        Node firstPointer = head;
        Node secondPointer = reversedSecondHalf;

        while (secondPointer != null) {
            if (firstPointer.data != secondPointer.data) {
                return false;
            }
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }

        return true;
    }

    /**
     * Builds a singly linked list from characters of input text.
     * @param text input text
     * @return head node
     */
    public static Node buildLinkedList(String text) {
        Node head = null;
        Node tail = null;

        for (char character : text.toCharArray()) {
            Node newNode = new Node(character);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    /**
     * Reverses a singly linked list in-place.
     * @param head head of list
     * @return new head after reversal
     */
    public static Node reverseList(Node head) {
        Node previous = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }

        return previous;
    }
}
