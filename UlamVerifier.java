public class UlamVerifier {
    public static void main(String[] args) {
        int limit = 1000000; 
        for (int i = 1; i < limit; i++) { // The loop runs for each number starting from 1 to 999999.
            if (ulamfunction(i) == false) {
                System.out.println("Error at " + i); 
                return; //But no number gives an error, because the Collatz operation reaches 1 for all numbers up to 1 million.
            }
        } 
        System.out.println("All numbers between 1 < n < 1M terminates"); 
    }

    public static boolean ulamfunction(long n) {
        while (n != 1) { // if n=1 then while loop stops
            if (n % 2 == 0) //if n is even number then
                n /= 2;
            else //if n is odd number then
                n = 3 * n + 1;
        }
        return true;
    }
}
