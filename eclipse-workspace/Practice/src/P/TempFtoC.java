package P;

import java.util.Scanner;

public class TempFtoC {

	public static void main(String[] args) {
		int tempInC;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Temperature");
		int tempInF=s.nextInt();
		tempInC=(tempInF-32)*5/9;
		System.out.println("Temp from "+tempInF+" Fahrenheit to "+tempInC+" Celcius");
		
		
		
	}

}
