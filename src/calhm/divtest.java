package calhm;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divtest {
	CalculatorhmModal m=new CalculatorhmModal();	
	CalculatorhmViwe v=new CalculatorhmViwe();
	CalculatorhmController c=new CalculatorhmController(m,v);
	@Test
	public void testdiv() {
		//fail("Not yet implemented");
		int x=c.m.div(5, 0);
		assertEquals(0,x);
	}

}