package calhm;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sqrtest {
	CalculatorhmModal m=new CalculatorhmModal();	
	CalculatorhmViwe v=new CalculatorhmViwe();
	CalculatorhmController c=new CalculatorhmController(m,v);
	@Test
	public void testsquare() {
		//fail("Not yet implemented");
		int x=c.m.squer(-5);
		assertEquals(0,x);
	}

}