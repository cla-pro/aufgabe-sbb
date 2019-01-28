package ch.sbb.tms.model;

import java.util.Random;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BetriebstagTest {
	private Betriebstag obj;
	private Long day;
	
	@Before
	public void setup() {
		obj = new Betriebstag();		
		day = new Long(new Random().nextLong()); 
	}
	
	@Test
	public void betriebspunkt_shouldSetAbkuerzung() {
		obj.setDay(day);
		Assert.assertEquals(day, obj.getDay());
	}
}
