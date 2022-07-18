package cfs.flds;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        int sum = sumFirstAndLastDigit(0);
        System.out.println(sum);
    }

    public static int sumFirstAndLastDigit(int number) {
        int rawNumber = number;
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 0;
        }

        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        double power = count-1;
        int powerTen = (int)Math.pow(10, power);
        int lastDigit = rawNumber % 10;
        int firstDigit = rawNumber/powerTen;
        int sumDigits = firstDigit + lastDigit;
        return sumDigits; 
    }
}
