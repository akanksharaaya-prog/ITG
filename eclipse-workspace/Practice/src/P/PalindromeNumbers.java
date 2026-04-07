package P;

import java.util.Scanner;



public class PalindromeNumbers {

	public static void main(String[] args) {
		String reverse=""; 
		Scanner s=new Scanner(System.in);

		System.out.println("Enter a number");
		String str=s.nextLine();

		for(int i=str.length()-1;i>=0;i--) {
			reverse += str.charAt(i);
		}
		System.out.println("Reverse is  : " + reverse);

		if(str == reverse) {

			System.out.println("It is palindrome");
		}
			else {
			System.out.println("It is not palindrome");

		}
	}
}


