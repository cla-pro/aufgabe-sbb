package ch.sbb.tms.json;

import java.util.List;

public class EinzelTrassen {
	private Betriebstage betriebstage;
	private List<TrassenLauf> trassenlauf;
	
	public void setBetriebstage(Betriebstage betriebstage) {
		this.betriebstage = betriebstage;
	}
	public void setTrassenlauf(List<TrassenLauf> trassenlauf) {
		this.trassenlauf = trassenlauf;
	}
	
	
	
}
