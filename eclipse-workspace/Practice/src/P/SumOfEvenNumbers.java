package P;

import java.util.Scanner;


public class SumOfEvenNumbers {

	public static void main(String[] args) {
		int sum=0;
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter First number");
		int num1=s.nextInt();
		System.out.println("Enter Second number");
		int num2=s.nextInt();
		for(int i=num1;i<=num2; i++) {
			if(i%2==0) {
			System.out.println(i + " is even number ");
			sum=sum+i;
			}
//		System.out.println(sum);
		}
		System.out.println("Sum of "+num1+ " to "+ num2 + "=" + sum);
		}
		
}
