package P;

import java.util.Scanner;

public class EvenNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int count =0;
		for(int i=1;i<=num;i++) {

			if (i%2==0) {
				System.out.println(i);
				count++;
			}
			
		}System.out.println("Even Numbers are "+count);
		}
	}