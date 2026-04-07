package P;

import java.util.Scanner;

public class Fibonacci {
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter a number");
	    	int num=sc.nextInt();
	    	int a=0;
	    	int b=1;
	    	System.out.print(a+" "+b+ " ");
	    	for(int i=2;i<=num;i++) {
	    		int c=a+b;
	    		System.out.print(c+" ");
	    		a=b;
	    		b=c;
	    		sc.close();
	    	}   
	    	}
	    }

	