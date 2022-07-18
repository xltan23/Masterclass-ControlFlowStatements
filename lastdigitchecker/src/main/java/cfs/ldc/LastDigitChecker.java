package cfs.ldc;

public class LastDigitChecker {
    public static void main(String[] args) {
        boolean sameLast = hasSameLastDigit(12, 23, 332);
        System.out.println(sameLast);
    }

    public static boolean hasSameLastDigit(int first, int second, int third) {
        if (!isValid(first) || !isValid(second) || !isValid(third)) {
            return false;
        }

        int firstLast = first % 10;
        int secondLast = second % 10;
        int thirdLast = third % 10;
        int count = 0;

        if (firstLast == secondLast) {
            count++;
        }

        if (firstLast == thirdLast) {
            count++;
        }

        if (secondLast == thirdLast) {
            count++;
        }

        if (count < 1) {
            return false;
        }
        return true;
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }
}
