package P;
import java.util.Scanner;

public class While {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter starting number: ");
	        int start = sc.nextInt();

	        System.out.print("Enter ending number: ");
	        int end = sc.nextInt();

	        while (start <= end) {

	            int count = 0;
	            int i = 1;

	            while (i <= start) {
	                if (start % i == 0) {
	                    count++;
	                }
	                i++;
	            }

	            if (count == 2) {
	                System.out.println(start);
	            }

	            start++;
	        }
	    }
	}
