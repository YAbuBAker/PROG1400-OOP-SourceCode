import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Validation for positive integer Using Do-While Loop");
        System.out.println("========================================================");
        //Repeat validation until user enters a valid POSITIVE number
        int number;
        do {
            System.out.println("Enter a positive number");
            while (!sc.hasNextInt()) {  //Check that the value if it is an integer
                System.out.println("Enter a positive integer number.");
                sc.next(); // to handle the newline character
            }
            number = sc.nextInt();
        } while (number < 0);    //Checks that the value is zero or higher.
        System.out.println("Press newLine to continue");
        sc.nextLine();sc.nextLine();

        System.out.println("Input Validation for numbers satisfying condition");
        System.out.println("================================================");
        System.out.println("Enter a valid Student mark between 0 and 100");

        double  newInput;
        do {
            System.out.println("Enter a valid Mark");
            newInput = sc.nextDouble();

        } while ((newInput<0.0) || (newInput>100.0));
    }
}