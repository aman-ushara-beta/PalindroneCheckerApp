import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UC6
{

    /**
     * Application entry point for UC6.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Step 1: Define the input string to validate
        String input = "civic";

        // Step 2: Create a Queue (FIFO) and a Stack (LIFO)
        // In Java, Queue is an interface, so we use LinkedList to implement it
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Step 3: Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);  // Enqueue (adds to the back)
            stack.push(c); // Push (adds to the top)
        }

        // Step 4: Flag to track palindrome status
        boolean isPalindrome = true;

        // Step 5: Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove(); // Dequeue (gets First In)
            char fromStack = stack.pop();    // Pop (gets Last In)

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Step 6: Display the result
        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: Success! FIFO and LIFO match. It is a palindrome.");
        } else {
            System.out.println("Result: Failure! FIFO and LIFO do not match. Not a palindrome.");
        }
    }
}