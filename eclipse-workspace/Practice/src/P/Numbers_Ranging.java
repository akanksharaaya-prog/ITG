package P;

import java.util.Scanner;

public class Numbers_Ranging {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Starting Number");
		int Starting_Number=s.nextInt();
		
		System.out.println("Enter Ending Number");
		int Ending_Number=s.nextInt();
		
		for(int i=Starting_Number;i<=Ending_Number;i++) {
			System.out.println(i);
		}
	}
}
