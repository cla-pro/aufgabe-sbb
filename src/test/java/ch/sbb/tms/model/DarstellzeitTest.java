package ch.sbb.tms.model;

import java.time.Instant;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DarstellzeitTest {

	private Darstellzeit obj;
	private Betriebstag betriebstag;
	private Instant von;
	private Instant bis;
	
	@Before
	public void setup() {
		obj = new Darstellzeit();		
		betriebstag = new Betriebstag();
		von = Instant.now();
		bis = Instant.now().plusSeconds(3000);
	}
	
	@Test
	public void darstellzeit_shouldSetVon() {
		obj.setAb(von);
		Assert.assertEquals(von, obj.getAb());
	}
	
	@Test
	public void darstellzeit_shouldSetBis() {
		obj.setAn(bis);
		Assert.assertEquals(bis, obj.getAn());
	}
	
	@Test
	public void darstellzeit_shouldSetBetriebstag() {
		obj.setBetriebstag(betriebstag);
		Assert.assertEquals(betriebstag, obj.getBetriebstag());
	}

}
