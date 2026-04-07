package P;

import java.util.Scanner;

public class T2_Factorial {

	public static void main(String[] args) {
		int factorial = 1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=s.nextInt();
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
			System.out.println(factorial);
		}
		System.out.println("factorial of " + num +" is "+ factorial);
	} 
}
