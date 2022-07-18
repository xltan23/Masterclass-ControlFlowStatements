package cfs.gcd;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int commonFactor = getGreatestCommonDivisor(186, 81);
        System.out.println(commonFactor);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int factor = 0;
        if (first > second) {
            factor = second;
        }
        if (second > first) {
            factor = first;
        }

        while (factor > 0) {
            if (first % factor == 0) {
                if (second % factor == 0) {
                    break;
                }
            }
            factor--;
        }
        return factor;
    }
}
