package com.earroyoron;

/**
 * Hello world!
 *
 */
public class JuegoDeBolos 
{
	private int puntosTotales = 0;
	
   public void tirada(int bolosTirados) {
	   puntosTotales +=bolosTirados;
   }
   
   public int getScore() {
	   return puntosTotales;
   }
}
