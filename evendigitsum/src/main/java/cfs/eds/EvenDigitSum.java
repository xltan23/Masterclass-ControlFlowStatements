package cfs.eds;

public class EvenDigitSum {
    public static void main(String[] args) {
        int sumEven = getEvenDigitSum(2234809);
        System.out.println(sumEven);
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                int evenDigit = number % 10;
                sum += evenDigit;
            }
            number /= 10;
        }
        return sum;
    }
    
}
