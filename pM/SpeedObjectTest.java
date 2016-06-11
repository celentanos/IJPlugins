import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class SpeedObjectTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testSpeedObjectAAAAA() {
		SpeedObject<Integer> test= new SpeedObject<>(10,100,10,0,60);
		Assert.assertEquals(60,(int)test.getSpeed());
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testSpeedObject() {
		SpeedObject<Integer> test= new SpeedObject<>();
		
		Assert.assertTrue(test.isCenterEmpty());
		
	}


}
