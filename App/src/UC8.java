import java.util.LinkedList;

public class UC8
{

    /**
     * Application entry point for UC8.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Step 1: Define the input string
        String input = "level";

        // Step 2: Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Step 3: Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Step 4: Flag to track palindrome state
        boolean isPalindrome = true;

        // Step 5: Compare until only one or zero elements remain
        while (list.size() > 1) {
            // Remove from the very start and the very end
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Step 6: Display the result
        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: Success! The LinkedList confirms a palindrome.");
        } else {
            System.out.println("Result: Failure! The string is not a palindrome.");
        }
    }
}