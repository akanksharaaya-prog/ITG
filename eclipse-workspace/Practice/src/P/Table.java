package P;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		int table;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		for(int i=1;i<=10;i++) {
			table=num*i;
			System.out.println(num + "*" + i + "=" + table);
		}
	}

}
