package calhm;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cal {
	CalculatorhmModal m=new CalculatorhmModal();	
	CalculatorhmViwe v=new CalculatorhmViwe();
	CalculatorhmController c=new CalculatorhmController(m,v);
	@Test
	public void testadd() {
		//fail("Not yet implemented");
		int x=c.m.add(4,5);
		assertEquals(9,x);
	}

}
