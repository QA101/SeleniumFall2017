package Tests.WeekOne;

import org.junit.Test;

import Main.WeekOne;

public class Subtraction {
	
	@Test
	public void SubtractionSimple() {
		int returnItem = 0;
		returnItem = WeekOne.Subtraction(2,1);
		assert returnItem == (2-1) : "Expected: "+(2-1)+", Got: "+ returnItem;
		
		returnItem = WeekOne.Subtraction(10,9);
		assert returnItem == (10-9) : "Expected: "+(10-9)+", Got: "+ returnItem;
		
		returnItem = WeekOne.Subtraction(20,10);
		assert returnItem == (20-10) : "Expected: "+(20-10)+", Got: "+ returnItem;
	}
	
	public void SubtractionNegativeResults() {
		int returnItem = 0;
		returnItem = WeekOne.Subtraction(1,2);
		assert returnItem == (1-2) : "Expected: "+(1-2)+", Got: "+ returnItem;
		
		returnItem = WeekOne.Subtraction(9,10);
		assert returnItem == (9-10) : "Expected: "+(9-10)+", Got: "+ returnItem;
		
		returnItem = WeekOne.Subtraction(10,20);
		assert returnItem == (10-20) : "Expected: "+(10-20)+", Got: "+ returnItem;
	}
	
	public void SubtractionNegativeInput() {
		int returnItem = 0;
		returnItem = WeekOne.Subtraction(-1,2);
		assert returnItem == (-1-2) : "Expected: "+(-1-2)+", Got: "+ returnItem;
		
		returnItem = WeekOne.Subtraction(-9,10);
		assert returnItem == (-9-10) : "Expected: "+(-9-10)+", Got: "+ returnItem;
		
		returnItem = WeekOne.Subtraction(-10,-20);
		assert returnItem == (-10-(-20)) : "Expected: "+(-10-(-20))+", Got: "+ returnItem;
	}
	

}
