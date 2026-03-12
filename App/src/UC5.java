import java.util.Stack;
public class UC5
{

    /**
     * Application entry point for UC5.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Step 1: Declare and initialize the input string
        String input = "noon";
        
        // Step 2: Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Step 3: Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Step 4: Assume palindrome initially
        boolean isPalindrome = true;

        // Step 5: Iterate again through original string and compare with popped values
        for (char c : input.toCharArray()) {
            // Pop returns the top element (the last one pushed)
            char poppedChar = stack.pop();
            
            if (c != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Step 6: Display the result
        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: Success! The string is a palindrome.");
        } else {
            System.out.println("Result: Failure! The string is NOT a palindrome.");
        }
    }
}