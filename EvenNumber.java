public class EvenNumber {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 25;
        int count = 0;
        while (number <= finishNumber) {
            if (isEvenNumber(number)) {
                count++;
                System.out.println(number);
                if (count == 5) {
                    break;
                }
            }
            number++;
        }
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
             return false;
        }
        
    }
}
