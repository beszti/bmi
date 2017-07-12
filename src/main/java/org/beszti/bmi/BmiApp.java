package org.beszti.bmi;

import java.util.Scanner;

public class BmiApp {
	public int m, s;
	public BmiApp(){
		System.out.println("Kérem adja meg a magasságát:");
        Scanner magassag = new Scanner(System.in);
        m = Integer.parseInt(magassag.next());
        magassag.close();
        
        System.out.println("Kérem adja meg a súlyát:");
        Scanner suly = new Scanner(System.in);
        s = Integer.parseInt(suly.next());
        suly.close();
	}
	
	public double bmiErtek(int suly, int magassag){
		return magassag/suly;
	}
}
