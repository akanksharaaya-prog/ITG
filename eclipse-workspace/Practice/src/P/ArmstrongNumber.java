package P;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int number, originalNumber, remainder, result = 0;
        int digits = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = sc.nextInt();

        originalNumber = number;

        // Step 1: Count digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            digits++;
        }

        originalNumber = number;

        // Step 2: Calculate Armstrong sum
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }

        // Step 3: Check result
        if (result == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}
