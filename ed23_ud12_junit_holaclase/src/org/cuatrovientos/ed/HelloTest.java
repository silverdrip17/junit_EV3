package org.cuatrovientos.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloTest {

	@Test
	void testSayHello() {
		//fail("Not yet implemented");
		Hello target = new Hello();
		String expected = "hello";
		String actual = target.SayHello();
		
		assertEquals(expected, actual);
	}

}
