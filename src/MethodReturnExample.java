package src;

public class MethodReturnExample {

	public static void main(String[] args) {
		HelloWorld();
	}
	
	public static void HelloWorld(){
		System.out.println(ReturnHello() + " "+ ReturnWorld()+ "!");
	}
	
	public static String ReturnHello(){
		return "Hello";
	}
	
	public static String ReturnWorld(){
		return "World";
	}

}
