package Tests.WeekOne;

import Main.WeekOne;

public class Swap {
	
	public void SwapHappy(int x, int y) {
		int result = 0;
		int expected = 0;
		
		result = WeekOne.Swap(1,2);
		expected= 2;
		assert result == expected : "Expected: " +expected+" Got: " + result;
		
		result = WeekOne.Swap(2, 1);
		expected= 1;
		assert result == expected : "Expected: " +expected+" Got: " + result;
	}

}
