package ch.sbb.tms.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StandortTest {
	private Standort obj;
	private Betriebspunkt betriebspunkt;
	private Darstellzeit darstellzeit;
	private Gleis gleis;	
	
	@Before
	public void setup() {
		obj = new Standort();		
		betriebspunkt = new Betriebspunkt();
		darstellzeit = new Darstellzeit();
		gleis = new Gleis();		
		}
	
	@Test
	public void standort_shouldSetBetriebspzunkt() {
		obj.setBetriebspunkt(betriebspunkt);
		Assert.assertEquals(betriebspunkt, obj.getBetriebspunkt());
	} 
	
	@Test
	public void standort_shouldSetDarstellzeit() {
		obj.setDarstellzeit(darstellzeit);
		Assert.assertEquals(darstellzeit, obj.getDarstellzeit());
	}
	
	@Test
	public void standort_shouldSetGleis() {
		obj.setGleis(gleis);
		Assert.assertEquals(gleis, obj.getGleis());
	}
}
