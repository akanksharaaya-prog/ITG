package P;

public class Palindrome {
	
	    public static void main(String[] args) {
	        String str = "madam2";
	        String reverse = "";

	        for (int i = str.length() - 1; i >= 0; i--) {
	            reverse += str.charAt(i);
	        }

	        if (str.equals(reverse)) {
	            System.out.println(str + " is a Palindrome");
	        } else {
	            System.out.println(str + " is NOT a Palindrome");
	        }
	    }
}
