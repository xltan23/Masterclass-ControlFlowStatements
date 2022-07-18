package cfs.pn;

public class PerfectNumber {
    public static void main(String[] args) {
        boolean perfect = isPerfectNumber(28);
        System.out.println(perfect);

    }

    public static boolean isPerfectNumber1(int number) {
        if (number < 1) {
            return false;
        }
        int i = 1;
        int sum = 0;
        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                sum += i;
            }
            i++;
        }
        if (sum != number) {
            return false;
        }
        return true;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

}
