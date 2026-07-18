package MustDoProb;

public class palindrome {

    public static int reverse(int n) {
        int rev = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            // Shift the existing reversed number to the left (multiply by 10)
            // and add the new last digit
            rev = (rev * 10) + lastDigit;
            n=n/10;

        }

        return rev;
    }

    // Changed return type from int to void
    public static void main(String[] args) {

int num = 22022022;
        // Call the static method directly
       if(num==reverse(num)){
           System.out.println(" is palindrome");
       }
else {
           System.out.println("not palindrome");
       }
    }
}