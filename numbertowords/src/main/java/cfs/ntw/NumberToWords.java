package cfs.ntw;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(0);  
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0) {
            System.out.println("Zero");
        }

        int numCount = getDigitCount(number);
        int reverseNum = reverse(number);
        int reverseCount = getDigitCount(reverseNum);
        String stringNum = "";

        while (reverseNum > 0) {
            int lastDigit = reverseNum % 10;
            switch(lastDigit) {
                case 0:
                    stringNum += "Zero ";
                    break;
                case 1:
                    stringNum += "One ";
                    break;
                case 2:
                    stringNum += "Two ";
                    break;
                case 3:
                    stringNum += "Three ";
                    break;
                case 4:
                    stringNum += "Four ";
                    break;
                case 5:
                    stringNum += "Five ";
                    break;
                case 6:
                    stringNum += "Six ";
                    break;
                case 7:
                    stringNum += "Seven ";
                    break;
                case 8:
                    stringNum += "Eight ";
                    break;
                case 9:
                    stringNum += "Nine ";
                    break;
                default: 
                    break;
            } 
            reverseNum /= 10;
        }

        if (reverseCount < numCount) {
            int numZero = numCount - reverseCount;
            for (int i = 0; i < numZero; i++) {
                stringNum += "Zero ";
            }
        }

        System.out.println(stringNum);

    }

    public static int reverse(int number) {
        int rawNumber = number;
        if (number < 0) {
            number = number * -1;
        }
        if (number == 0) {
            return 0;
        }
        String numString = "";
        while (number > 0) {
            int lastDigit = number % 10;
            numString += lastDigit;
            number /= 10;
        }
        int numInt = Integer.parseInt(numString);
        if (rawNumber<0) {
            numInt = numInt * -1;
        }
        return numInt;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;
        while(number>0) {
            number /= 10;
            count++;
        }

        return count;
    }
}
