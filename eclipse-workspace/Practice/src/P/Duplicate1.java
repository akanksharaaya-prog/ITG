package P;

public class Duplicate1 {
	    public static void main(String[] args) {
	        String str = "KrishnaRadha".toLowerCase();  // convert to lowercase

	        int[] freq = new int[256];  // for all ASCII characters

	        // Count characters
	        for (char ch : str.toCharArray()) {
	            freq[ch]++;
	        }

	        // Print duplicates
	        System.out.println("Duplicate characters:");
	        for (int i = 0; i < 256; i++) {
	            if (freq[i] > 2) {
	                System.out.println((char)i + " = " + freq[i] + " times");
	            }
	        }
	    }
}
