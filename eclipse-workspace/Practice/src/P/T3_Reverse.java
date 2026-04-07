package P;

import java.util.Scanner;

public class T3_Reverse {

	public static void main(String[] args) {
		String rev="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String str=s.nextLine();
		for (int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
			System.out.println(rev);
//			rev+=str.charAt(i);
		}
		System.out.println(rev);
	}

}
