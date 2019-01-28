package ch.sbb.tms.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BetriebspunktTest {

	private Betriebspunkt obj;
	private String abkuerzung;
	
	@Before
	public void setup() {
		obj = new Betriebspunkt();		
		abkuerzung = "BN";
	}
	
	@Test
	public void betriebspunkt_shouldSetAbkuerzung() {
		obj.setAbkuerzung(abkuerzung);
		Assert.assertEquals(abkuerzung, obj.getAbkuerzung());
	}
	
}
