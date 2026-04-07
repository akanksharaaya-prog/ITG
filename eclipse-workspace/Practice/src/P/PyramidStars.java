package P;

import java.util.Scanner;

public class PyramidStars {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);

		System.out.println("Enter a number");
		int num=s.nextInt();

		for(int i=1;i<=num;i++) {

			for(int j=i;j<num;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}