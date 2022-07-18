package cfs.np;

public class NumberPalindrome {
    public static void main(String[] args) {
        boolean isP = isPalindrome(1230321);
        System.out.println("The number is a palindrome: " + isP);

    }

    public static boolean isPalindrome(int number) {
        int rawNumber = number;
        if (number < 0) {
            number = number*-1;
            rawNumber = rawNumber*-1;
        }
        String reverse = "";
        while (number>0) {
            int digit = number % 10;
            reverse += digit;
            number /= 10;
        }
        
        int reverseNumber = Integer.parseInt(reverse);
        if (reverseNumber != rawNumber) {
             return false;
        }
        return true;

    }
}
