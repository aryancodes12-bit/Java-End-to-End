package MustDoProb;

public class prime {
    public static void main(String[] args) {
        int n = 13;
        boolean isPrime = true; // Assume it's prime until proven otherwise

        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 up to the square root of n
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false; // Found a factor, so it's NOT prime
                    break;           // Exit the loop early—no need to keep checking
                }
            }
        }

        // Print the final result
        if (isPrime) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }
}