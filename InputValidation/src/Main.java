import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the input validation!");
        Scanner sc = new Scanner(System.in);

        int number ;

        System.out.print("Input a number : ");
        number = sc.nextInt();
        System.out.println(number);

//        try {
//            System.out.print("Input a number : ");
//            number = sc.nextInt();
//        }
//        catch (InputMismatchException ex){
//            System.out.println("Invalid entry");
//            System.out.println(ex);
//
//        }


        // --------------------------1----------------------------------------

//        try {
//                System.out.println("Enter a number: ");
//                number  = sc.nextInt();
//        }
//        catch (Exception ex) {
//                System.out.println("Invalid Entry");
//        }

        // ---------------------------2-------------------------------------------
//        do {
//            System.out.println("Enter a number: ");
//            while (!sc.hasNextInt()){
//                System.out.println("Enter a positive integer number.");
//                sc.next();
//            }
//            number = sc.nextInt();
//        } while (number <0);
//        System.out.println(number);
        // --------------------------3--------------------------------------------

//        do {
//            number = 0;
//            try {
//                System.out.println("Enter a number: ");
//                number  = sc.nextInt();
//                //break;
//            }
//            catch (Exception ex) {
//                System.out.println("Invalid Entry");
//                sc.next();
//                number =-1;
//            }
//        } while (number <0);
//        System.out.println(number);

        // --------------------------4---------------------------------------------
//        double stMark;
//        do {
//            System.out.println("Enter a student's mark: ");
//            while (!sc.hasNextDouble()){
//                System.out.println("Enter a positive integer number.");
//                sc.next();
//            }
//            stMark = sc.nextDouble();
//        } while (stMark <0 || stMark>100);
//        System.out.println(stMark + " is a valid entry");
    }
}