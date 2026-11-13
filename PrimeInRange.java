
public class PrimeInRange {

    // Method 1: Check whether a number is prime
    static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Method 2: Print prime numbers in a range
    static void printPrimeInRange(int start, int end) {

        for (int i = start; i <= end; i++) {

            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        // Only prime check
        System.out.println(isPrime(17));  // true
        System.out.println(isPrime(20));  // false

        // Prime numbers in range
        printPrimeInRange(1, 100);
    }
}
