package cfs.ic;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        while(true) {

            System.out.println("#" + (count+1) + " number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
            scanner.nextLine();
            
        }
        double average = (double)sum/(double)count;
        long avg = Math.round(average);
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
