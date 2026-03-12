public class UC9
{
    /**
     * Application entry point for UC9.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "racecar";
        
        // Initial call: start at 0, end at the last index
        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Input String: " + input);
        if (result) {
            System.out.println("Result: Success! Recursion confirmed a palindrome.");
        } else {
            System.out.println("Result: Failure! Recursion detected a mismatch.");
        }
    }

    /**
     * Recursively checks whether a string is a palindrome.
     * * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Step 1: Base Condition
        // If pointers meet or cross, every character matched so far
        if (start >= end) {
            return true;
        }

        // Step 2: Compare outer characters
        if (s.charAt(start) != s.charAt(end)) {
            return false; // Mismatch found
        }

        // Step 3: Recursive Call
        // Move start forward and end backward to check the inner string
        return check(s, start + 1, end - 1);
    }
}