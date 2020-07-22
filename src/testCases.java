import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testCases {
	
	postFixCalculator expTerm= new postFixCalculator();
	
	@Test
	public void testInitializtion()
	{
		String expression="2+3";
		expTerm.setExpression(expression);
	    assertEquals(expression, expTerm.getExpression());
	}

}
