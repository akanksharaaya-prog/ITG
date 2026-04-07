package P;

public class MethodParameterExample {
	
	    void printName(String name) {
	        System.out.println(name);
	    }
	    void number(int num) {
	    	System.out.println(num);
	    }
	    public static void main(String[] args) {
	        MethodParameterExample obj = new MethodParameterExample();
	        obj.printName("Radha555");
	        obj.number(10);
	    }
	}