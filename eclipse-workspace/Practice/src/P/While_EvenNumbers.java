package P;

import java.util.Scanner;

public class While_EvenNumbers {

	public static void main(String[] args) {
		int i=1;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Starting number");
		int starting_number=s.nextInt();
		
		System.out.println("Enter Ending number");
		int ending_number=s.nextInt();
		
		while(i<=ending_number) {
			if(i%2==0) {
				System.out.println("Even Number is : "+i);
				}		
			i++;
	}}}


