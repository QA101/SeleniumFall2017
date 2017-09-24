package Main;

public class AccessModifiersExample {

	static int myGlobal = 10;
	static int mySecondGlobal = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiersExample myObject = new AccessModifiersExample();

		//MyPrivateMethod();
		//myObject.MyPrivateMethod();
		
		//MyPublicMethod();
		//myObject.MyPublicMethod();
		
		//MyPublicStaticMethod();
		
		//local variable example
		int x = 1;
		System.out.println("Main x:" +x+", Method x:"+ myObject.ModifyLocal(x));
		System.out.println(myGlobal);
		myObject.ModifyGlobal(20);
		System.out.println("New Global:" +myGlobal);		
	}

	private void MyPrivateMethod(){
		System.out.print("private and non-static");
	}
	
	public void MyPublicMethod(){
		System.out.print("public and non-static");
	}
	
	public static void MyPublicStaticMethod(){
		System.out.print("public and static");
	}
	
	public int ModifyLocal(int x){
		x = 20;
		return x;
	}
	
	public void ModifyGlobal(int x){
		myGlobal = x;
		x+=1;
	}
	
	/*
	 * Write a function which takes an int x
	 * This function should multiple x and mySecondGlobal variable together
	 * 
	 */
	public void MultipleMyGlobal(int x){
		
	}
	
	public int getmySecondGlobal(){
		return mySecondGlobal;
	}
	
}
