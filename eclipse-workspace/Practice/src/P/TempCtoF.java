package P;

import java.util.Scanner;

public class TempCtoF {

	public static void main(String[] args) {
		int tempInF;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Temperature");
		int tempInC=s.nextInt();
		tempInF=(tempInC*9/5)+32;		
		System.out.println("Temp from "+tempInC+" Celcius to "+tempInF+" Fahrenheit");
	
	}

}
