package ch.sbb.tms.json;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.gson.Gson;

public class EinzelTrassen {

	@SuppressWarnings("unused")
	// can be ignored gson neeeds it
	private Betriebstage betriebstage;
	// can be ignored gson neeeds it
	private List<TrassenLauf> trassenlauf;

	public void setBetriebstage(Betriebstage betriebstage) {
		this.betriebstage = betriebstage;
	}

	public void setTrassenlauf(List<TrassenLauf> trassenlauf) {
		this.trassenlauf = trassenlauf;
	}

	@Override
	public String toString() {

		if (trassenlauf == null) {
			return super.toString();
		}

		Map<String, List<TrassenLauf>> postsPerType = trassenlauf.stream()
				.collect(Collectors.groupingBy(TrassenLauf::getBetriebspunktId));

		Gson gson = new Gson();
		String json = gson.toJson(postsPerType);
		return json;
	}

}
