public class PrimeNumber {
    public static void main(String[] args) {

        int count = 0;
        for(int i = 10; i < 50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println(i);
                if(count == 3) {
                    System.out.println("Exiting for-loop");
                    break;
                }
            } 
        }
    }
    
    public static boolean isPrime(int number) {
        if(number == 1) {
            return false;
        }
        for(int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                 return false;
            } 
        }
        return true;
    }
}
