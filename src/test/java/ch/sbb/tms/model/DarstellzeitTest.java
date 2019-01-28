package ch.sbb.tms.model;

import java.time.Instant;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DarstellzeitTest {

	private Darstellzeit obj;
	private Betriebspunkt betriebspunkt;
	private Instant von;
	private Instant bis;
	
	@Before
	public void setup() {
		obj = new Darstellzeit();		
		betriebspunkt = new Betriebspunkt();
		von = Instant.now();
		bis = Instant.now().plusSeconds(3000);
	}
	
	@Test
	public void darstellzeit_shouldSetVon() {
		obj.setVon(von);
		Assert.assertEquals(von, obj.getVon());
	}
	
	@Test
	public void darstellzeit_shouldSetBis() {
		obj.setBis(bis);
		Assert.assertEquals(bis, obj.getBis());
	}
	
	@Test
	public void darstellzeit_shouldSetBetriebspunkt() {
		obj.setBetriebspunkt(betriebspunkt);
		Assert.assertEquals(betriebspunkt, obj.getBetriebspunkt());
	}

}
