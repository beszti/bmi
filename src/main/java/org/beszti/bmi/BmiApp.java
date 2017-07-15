package org.beszti.bmi;

public class BmiApp {
	public BmiApp(){
	}
	
	public double bmiValue(int suly, int magassag){
		return Math.floor((suly/Math.sqrt(magassag))*10000);
	}
	public boolean isValid(int bmi){
		return bmi > 10 && bmi < 80 ? true : false;
	}
	
	public String bmiResult(int bmi){
		return bmi < 20 ? "Malnourished" : bmi > 28 ? "Overweight" : "Normal";
	}
}
