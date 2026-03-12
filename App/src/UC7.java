import java.util.ArrayDeque;
import java.util.Deque;

public class UC7
{

    /**
     * Application entry point for UC7.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Step 1: Define the input string
        String input = "refer";

        // Step 2: Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Step 3: Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c); // Adds to the back of the deque
        }

        // Step 4: Flag to track palindrome result
        boolean isPalindrome = true;

        // Step 5: Continue comparison while more than one element exists
        // If there is only 1 element left (the middle char), it's automatically a match
        while (deque.size() > 1) {
            char first = deque.removeFirst(); // Get and remove from front
            char last = deque.removeLast();   // Get and remove from back

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Step 6: Display result
        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: Success! Deque validation confirms a palindrome.");
        } else {
            System.out.println("Result: Failure! Characters at both ends did not match.");
        }
    }
}