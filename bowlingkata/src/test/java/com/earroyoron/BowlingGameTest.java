package com.earroyoron;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

/**
 * Unit test for BowlingGameTest
 */

public class BowlingGameTest 
{
	private JuegoDeBolos g;
	
	@Before
	public void setUp() throws Exception {
		g = new JuegoDeBolos();
	}
	@Test
	public void testGutterGame() throws Exception {	
		for (int i = 0; i<20;i++)
			g.tirada(0);
		assertEquals(0, g.getScore());
	}
	
	@Test
	public void testAllOnes() throws Exception {	
		for (int i = 0; i<20;i++)
			g.tirada(1);
		assertEquals(20, g.getScore());
	}
	
}
