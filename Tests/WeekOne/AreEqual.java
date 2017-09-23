package Tests.WeekOne;

import org.testng.annotations.Test;

import Main.WeekOne;

public class AreEqual {
	
	@Test
	public void AreEqualWhenNotEqual(){
		assert WeekOne.AreEqual(1, 2) == false;
	}
	
	@Test
	public void AreEqualWhenEqual(){
		assert WeekOne.AreEqual(1, 1) == true;
	}	
}
