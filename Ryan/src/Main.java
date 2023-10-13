import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Part A, 2");
// enter a number and it will print all powers of 2 that is less then the number you inputted
//example: if you input 100 you will get 1,2,4,8,16,32,64
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        int count = 0;
        double result = Math.pow(count,2);
        while ( result < n) {
            System.out.println(count*count);
            count++;
            result = Math.pow(count,2);
        }
    }
}