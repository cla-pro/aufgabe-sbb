package ch.sbb.tms.model;

import java.util.Random;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GleisTest {
	private Gleis obj;
	private String hgbpHauptgleisIndentifier;
	
	@Before
	public void setup() {
		obj = new Gleis();		
		hgbpHauptgleisIndentifier = "test_id";
	}
	
	@Test
	public void gleis_shouldSetHgbpHauptgleisIndentifier() {
		obj.setHgbpHauptgliesIndentifier(hgbpHauptgleisIndentifier);
		Assert.assertEquals(hgbpHauptgleisIndentifier, obj.getHgbpHauptgliesIndentifier());
	}
}
