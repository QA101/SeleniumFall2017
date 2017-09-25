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

}
