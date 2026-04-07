package P;
public class MethodReturnExample {
	int add() {
		int a = 10;
		int b = 20;
		return a * b;
	}
	String name() {
//		String name="RAYA";
		String name="--------------12+++++++++++++*****22";
		return name;
	}
	String nav() {
		return "Priya";
	}
	public static void main(String[] args) {
		MethodReturnExample obj = new MethodReturnExample();
		System.out.println(obj.add());
		System.out.println(obj.name());
		System.out.println(obj.nav());
	}
}