package cfs.sd;

public class SharedDigit {
    public static void main(String[] args) {
        boolean hasSame = hasSharedDigit(12, 43);
        System.out.println(hasSame);
    }

    public static boolean hasSharedDigit(int first, int second) {
        if ((first < 10 || first > 99) || (second < 10 || second > 99)) {
            return false;
        }

        int firstDigit1 = first % 10;
        int secondDigit1 = first/10;

        int firstDigit2 = second % 10;
        int secondDigit2 = second/10;

        if (firstDigit1 == firstDigit2) {
            return true;
        } else if (firstDigit1 == secondDigit2) {
            return true;
        }

        if (secondDigit1 == firstDigit2) {
            return true;
        } else if (secondDigit1 == secondDigit2) {
            return true;
        }

        return false;
        
    }
    
}
