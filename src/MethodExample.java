package src;

public class MethodExample {

	public static void main(String[] args) {
		MyMethod(); //Call MyMethod;
	}
	
	public static void MyMethod(){
		System.out.println("Called my method");
		//MyOtherMethod();
	}
	
	public static void MyOtherMethod(){
		System.out.println("Called my other method");
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
