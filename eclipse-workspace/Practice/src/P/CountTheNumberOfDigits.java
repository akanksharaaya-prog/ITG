package P;

import java.util.Scanner;

public class CountTheNumberOfDigits {

	public static void main(String[] args) {
		int count=0;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter the number");
		int number=s.nextInt();

		while(number!=0) {
			number=number/10;
			count++;
		}
		System.out.println("Number of digits: " + count);
}
}
