public class UC2
{

    /**
     * Application entry point for UC2.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Step 1: Predefined hardcoded string
        String input = "madam";
        boolean isPalindrome = true;

        // Step 2: Compare characters from both ends
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break; // Exit loop early if a mismatch is found
            }
            left++;
            right--;
        }

        // Step 3: Display the result on the console
        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
        
        System.out.println("Program execution completed.");
    }
}