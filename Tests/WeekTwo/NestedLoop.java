package Tests.WeekTwo;

import org.junit.Test;

import Main.WeekOne;
import Main.weekTwo;

public class NestedLoop {

	@Test
	public void NestedLoopHappy(){
		int result = 0;
		int expected = 0;
		
		result = weekTwo.NestedLoop(1,2,3);
		expected= 1*2*3;
		assert result == expected : "Expected: " +expected+" Got: " + result;
		
		result = weekTwo.NestedLoop(5,2,1);
		expected= 5*2*1;
		assert result == expected : "Expected: " +expected+" Got: " + result;
		
		result = weekTwo.NestedLoop(10,2,1);
		expected= 10*2*1;
		assert result == expected : "Expected: " +expected+" Got: " + result;
	}
	
	@Test
	public void NestedLoopNegatives(){
		int result = 0;
		int expected = 0;
		
		result = weekTwo.NestedLoop(1,2,-1);
		expected= 0;
		assert result == expected : "Expected: " +expected+" Got: " + result;
		
		result = weekTwo.NestedLoop(5,-1,1);
		expected= 0;
		assert result == expected : "Expected: " +expected+" Got: " + result;
		
		result = weekTwo.NestedLoop(10,2,-2);
		expected= 0;
		assert result == expected : "Expected: " +expected+" Got: " + result;
	}
	
	@Test
	public void NestedLoopZeros(){
		int result = 0;
		int expected = 0;
		
		result = weekTwo.NestedLoop(1,2,0);
		expected= 0;
		assert result == expected : "Expected: " +expected+" Got: " + result;
		
		result = weekTwo.NestedLoop(0,10,1);
		expected= 0;
		assert result == expected : "Expected: " +expected+" Got: " + result;
		
		result = weekTwo.NestedLoop(0,2,1);
		expected= 0;
		assert result == expected : "Expected: " +expected+" Got: " + result;
	}

}
