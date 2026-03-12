public class UC3
{

    /**
     * Application entry point for UC3.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Original string to check
        String input = "radar";
        String reversed = "";

        // Step 1: Iterate from the last character to the first
        // As per the hint: for (int i = input.length() - 1; i >= 0; i--)
        for (int i = input.length() - 1; i >= 0; i--) {
            // Step 2: Build the reversed version using String Concatenation (+)
            reversed = reversed + input.charAt(i);
        }

        // Step 3: Compare original and reversed using equals()
        // Note: We use .equals() to compare content, not ==
        boolean isPalindrome = input.equals(reversed);

        // Step 4: Display the validation result
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);

        if (isPalindrome) {
            System.out.println("Result: Success! The string is a palindrome.");
        } else {
            System.out.println("Result: Failure! The string is NOT a palindrome.");
        }
    }
}