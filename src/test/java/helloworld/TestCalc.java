package helloworld;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class TestCalc {
	@Test
	public void testAdd() {
		Calc c = new Calc();
		assertEquals(c.add(11, 5), 16);
	}

}
