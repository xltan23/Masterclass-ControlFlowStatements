import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        while(i<10) {
            System.out.println("Enter number #" + (i+1));
            boolean hasNextInt = scanner.hasNextInt();
            
            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                i++;
            } else {
                System.out.println("Invalid Value");   
            }
            scanner.nextLine();
            
        }
        System.out.println("Sum of all valid numbers: " + sum);

        scanner.close();
    }


}
