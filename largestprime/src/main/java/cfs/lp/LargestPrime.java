package cfs.lp;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(7));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        int i = 2;
        int j = 2;
        int storePrime = 0;
        while (i <= number) {
            // Checking for factors of number
            if (number % i == 0) {
                // Check if factor i is prime
                while (j <= i/2) {
                    // If i has factor == not prime immediately exit while-loop and move on to next i
                    if (i % j == 0) {
                        break;
                    } 
                    j++;
                }
                if (j == (i/2+1)) {
                    storePrime = i;
                }

            }   
            i++;     
        }
        return storePrime;

    }

    public static boolean isPrime(int number) {
        if (number < 0) {
            return false;
        }
        int i = 2;
        while (i < number/2) {
            if (number % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
    
}
