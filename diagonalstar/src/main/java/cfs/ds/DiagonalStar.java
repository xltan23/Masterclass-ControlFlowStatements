package cfs.ds;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(2);
    }
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 0; i < number; i++) {
                System.out.println();
                for (int j = 0; j < number; j++) {
                    if (i == 0 || i == (number-1)) {
                        System.out.print('*');
                    } else {
                        if (j == 0 || j == (number-1) || i == j || j == (number-i-1)) {
                            System.out.print('*');
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
            }
        }
    }
}
