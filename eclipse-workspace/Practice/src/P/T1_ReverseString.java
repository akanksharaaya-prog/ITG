package P;

import java.util.Scanner;

public class T1_ReverseString {
	public static void main(String[] args) {
		String Reverse ="";
		Scanner sc=new Scanner(System.in);
		System.out.println("+++++++++++++++++  Enter String   ++++++++++++++");
		String str=sc.nextLine();
		
		for (int i=str.length()-1;i>=0;i--) {
			
			Reverse=Reverse+str.charAt(i);
			
			}
			System.out.println(Reverse);
			System.out.println("Reverse String of "+ str +" : " + Reverse);
		}
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			Reverse=Reverse+str.charAt(i);
//			System.out.println(Reverse);
//		}
//		System.out.println("Reverse String of "+ str +" is " + Reverse);
//			}
