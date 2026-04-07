package P;

public class Reverse_String {
	
	public static void main(String args[]) {

		String str="    AKAN     KSHA";
		String reverse="";

		for (int i=str.length()-1;i>=0;i--){
			reverse += str.charAt(i);
//			System.out.println(reverse);
		
		}
		System.out.println(reverse);
		System.out.println(str.length());
		System.out.println(str.toLowerCase());
		System.out.println(str.trim());
		System.out.println(str.replaceAll("\\s", "*******"));
		System.out.println(str.replace("A", "#"));
		System.out.println(str.endsWith("A"));
		System.out.println(str.startsWith("B"));
		System.out.println(str.startsWith(""));
	}
	
}
