import java.util.Scanner;

public class Fibonacci {
    // Recursive method to find Fibonacci number at a given position
    static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position (n): ");
        int n = sc.nextInt();

        // Print Fibonacci sequence up to position n
        System.out.print("Fibonacci sequence up to " + n + ": ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Print nth Fibonacci number
        System.out.println("\nFibonacci number at position " + n + " is: " + fibonacci(n));
        sc.close();
    }
}
