package P;
import java.util.Scanner;
public class Armstrong_Number2 {
	public static void main(String[] args) {

		int number, sum = 0, digit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3-digit number:");
		number = sc.nextInt();

		int temp = number;

		while (temp > 0) {
			digit = temp % 10;          // get last digit
			sum = sum + (digit * digit * digit); // cube of digit
			temp = temp / 10;           // remove last digit
		}
		if (sum == number)
			System.out.println("Armstrong number");
		else
			System.out.println("Not an Armstrong number");
}}