import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Reverse using StringBuilder and check for palindrome
        String reversed = new StringBuilder(input).reverse().toString();
        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        // Variables to store even/odd digits and their counts
        StringBuilder evenDigits = new StringBuilder();
        StringBuilder oddDigits = new StringBuilder();
        int evenCount = 0, oddCount = 0;

        // Single loop for all digit processing
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = c - '0';
                if (digit % 2 == 0) {
                    evenDigits.append(digit).append(" ");
                    evenCount++;
                } else {
                    oddDigits.append(digit).append(" ");
                    oddCount++;
                }
            }
        }

        // Output
        System.out.println("Even digits: " + evenDigits);
        System.out.println("Odd digits: " + oddDigits);
        System.out.println("Count of even digits: " + evenCount);
        System.out.println("Count of odd digits: " + oddCount);

        sc.close();
    }
}