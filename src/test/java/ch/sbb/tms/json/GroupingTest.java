package ch.sbb.tms.json;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;

public class GroupingTest {

	@Before
	public void setup() {
	}

	@Test
	public void trassenLauf_shouldBeGrouped() {
		Trassen trassen = new Trassen();

		EinzelTrassen einzelTrassen = new EinzelTrassen();

		List<EinzelTrassen> asList = Arrays.asList(einzelTrassen);
		trassen.setEinzeltrassen(asList);

		TrassenLauf trassenLauf1 = new TrassenLauf();
		trassenLauf1.setBetriebspunktId("2");

		TrassenLauf trassenLauf2 = new TrassenLauf();
		trassenLauf2.setBetriebspunktId("1");

		TrassenLauf trassenLauf3 = new TrassenLauf();
		trassenLauf3.setBetriebspunktId("1");

		TrassenLauf trassenLauf4 = new TrassenLauf();
		trassenLauf4.setBetriebspunktId("2");
		

		List<TrassenLauf> trassenLaufAsList = Arrays.asList(trassenLauf1, trassenLauf2, trassenLauf3, trassenLauf4);
		einzelTrassen.setTrassenlauf(trassenLaufAsList);

		Map<String, List<TrassenLauf>> postsPerType = trassenLaufAsList.stream()
				.collect(Collectors.groupingBy(TrassenLauf::getBetriebspunktId));
		
		Gson gson = new Gson();
		String json = gson.toJson(postsPerType);
		Assert.assertNotNull(json);
	}
}
