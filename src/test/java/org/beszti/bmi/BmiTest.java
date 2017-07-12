package org.beszti.bmi;

import static junit.framework.Assert.assertEquals;

public class BmiTest{
	private BmiApp bmi;
	
	public void setUp() throws Exception{
		bmi = new BmiApp();
	}
    
    public void testBmiWhenInteger()
    {
    	double res = bmi.bmiErtek(60, 180);
        assertEquals(3, res);
    }
    public void testBmiWhenDouble()
    {
    	double res = bmi.bmiErtek(50, 160);
        assertEquals(3.2, res);
    }
}
