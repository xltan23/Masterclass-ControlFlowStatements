public class Switch {
    public static void main(String[] args) {
        char character = 'B';

        switch(character) {
            case 'A':
                System.out.println("It's an A");
                break;
                
            case 'B':
                System.out.println("It's a B");
                break;

            case 'C':
                System.out.println("It's a C");
                break;

            default:
                System.out.println("None of the above");
                break;
        }
    }
}