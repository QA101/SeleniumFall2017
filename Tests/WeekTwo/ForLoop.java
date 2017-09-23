package Tests.WeekTwo;

import org.junit.Test;

import Main.WeekOne;
import Main.weekTwo;

public class ForLoop {
	
	@Test
	public void ForLoop_Simple(){
		String result = "";
		
		result = weekTwo.ForLoop(1, "hi");
		assert result.equals("hi") : "Expected: hi, Got: "+ result;
		
		result = weekTwo.ForLoop(2, "hi");
		assert result.equals("hihi"): "Expected: hihi, Got: "+ result;
		
		result = weekTwo.ForLoop(5, "HelloWorld");
		assert result.equals("HelloWorldHelloWorldHelloWorldHelloWorldHelloWorld"): "Expected: HelloWorldHelloWorldHelloWorldHelloWorldHelloWorld, Got: "+ result;

	}
}
