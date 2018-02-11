package calhm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class modtest {
	CalculatorhmModal m=new CalculatorhmModal();	
	CalculatorhmViwe v=new CalculatorhmViwe();
	CalculatorhmController c=new CalculatorhmController(m,v);
	@Test
	public void testmod() {
		//fail("Not yet implemented");
		int x=c.m.mod(4,5);
		assertEquals(4,x);
	}

}
