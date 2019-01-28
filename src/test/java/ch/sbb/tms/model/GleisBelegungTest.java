package ch.sbb.tms.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GleisBelegungTest {
	private GleisBelegung obj;
	private List<Standort> standtords;
	private String trassenId;
	
	@Before
	public void setup() {
		obj = new GleisBelegung();		
		trassenId = "test_id";
		Standort  s1 = new Standort();
		Standort  s2 = new Standort();
		standtords = new ArrayList<>();
		standtords.add(s1);
		standtords.add(s2);
		}
	
	@Test
	public void gleisBelegung_shouldSetStandorts() {
		obj.setStandtord(standtords);
		Assert.assertEquals(standtords, obj.getStandtord());
	} 
	
	@Test
	public void gleisBelegung_shouldSetTrassenId() {
		obj.setTrassenId(trassenId);
		Assert.assertEquals(trassenId, obj.getTrassenId());
	}
}
