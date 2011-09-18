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
	public void testAllOnes() throws Exception {	
		tirarVarios(20, 1);
		assertEquals(20, g.getScore());
	}
	
	
	@Test
	public void testGutterGame() throws Exception {	
		tirarVarios(20, 0);
		assertEquals(0, g.getScore());
	}
	private void tirarVarios(int tiradas, int bolosTirados) {
		for (int i = 0; i<tiradas;i++)
			g.tirada(bolosTirados);
	}
	
	
}
