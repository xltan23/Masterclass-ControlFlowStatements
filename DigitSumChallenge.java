public class DigitSumChallenge {
    public static void main(String[] args) {
        int sumAll = sumDigits2(86912345);
        System.out.println(sumAll);
    }

    public static int sumDigits(int number) {
        int ones = 0;
        int tens = 0;
        int hundreds = 0;
        int sum = 0;

        if (number <= 9) {
            return -1;
        }
        if (number >= 100) {
            ones = number % 10;
            tens = (number/10) % 10;
            hundreds = number/100;
        } else {
            ones = number % 10;
            tens = number/10;
        }
        sum = hundreds + tens + ones;
        return sum;
    }

    public static int sumDigits2(int number) {
        if (number<10) {
            return -1;
        }

        int sum = 0;

        while (number>0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }
}
