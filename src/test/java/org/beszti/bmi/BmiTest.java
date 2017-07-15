package org.beszti.bmi;

import static junit.framework.Assert.assertEquals;

public class BmiTest{
	private BmiApp bmi;
	
	public void setUp() throws Exception{
		bmi = new BmiApp();
	}    
    public void testBmiMalnourished()    {
        assertEquals("Malnourished", bmi.bmiValue(50, 180));
    }    
    public void testBmiOverweight(){
    	assertEquals("Overweight", bmi.bmiValue(120, 180));
    }
    public void testBmiNormal(){
    	assertEquals("Normal", bmi.bmiValue(80, 180));
    }
    public void testIsValid(){
    	assertEquals(true, bmi.bmiValue(80, 180));
    }
    public void testIsNotValid(){
    	assertEquals(false, bmi.bmiValue(300, 180));
    }
}
