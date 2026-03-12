public class UC4
{

    /**
     * Application entry point for UC4.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "deified";
        
        // Step 1: Convert String to char array
        char[] charArray = input.toCharArray();
        
        // Step 2: Initialize Two Pointers
        int start = 0;                  // Beginning of the array
        int end = charArray.length - 1; // End of the array
        boolean isPalindrome = true;

        // Step 3: Compare characters using the pointers
        // The loop runs until the pointers meet in the middle
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break; // Mismatch found, not a palindrome
            }
            // Move pointers toward the center
            start++;
            end--;
        }

        // Step 4: Display the result
        System.out.println("Input String: " + input);
        System.out.println("Converted Array: " + java.util.Arrays.toString(charArray));
        
        if (isPalindrome) {
            System.out.println("Result: Success! It's a palindrome.");
        } else {
            System.out.println("Result: Failure! It's not a palindrome.");
        }
    }
}