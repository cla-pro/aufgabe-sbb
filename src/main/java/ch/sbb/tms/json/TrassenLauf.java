package ch.sbb.tms.json;

public class TrassenLauf {
	Long betrieblichAb;
	Long betrieblichAn;
	Long hgbpHauptgleis;
	String betriebspunktId;

	public Long getBetrieblichAb() {
		return betrieblichAb;
	}

	public void setBetrieblichAb(Long betrieblichAb) {
		this.betrieblichAb = betrieblichAb;
	}

	public Long getBetrieblichAn() {
		return betrieblichAn;
	}

	public void setBetrieblichAn(Long betrieblichAn) {
		this.betrieblichAn = betrieblichAn;
	}

	public Long getHgbpHauptgleis() {
		return hgbpHauptgleis;
	}

	public void setHgbpHauptgleis(Long hgbpHauptgleis) {
		this.hgbpHauptgleis = hgbpHauptgleis;
	}

	public String getBetriebspunktId() {
		return betriebspunktId;
	}

	public void setBetriebspunktId(String betriebspunktId) {
		this.betriebspunktId = betriebspunktId;
	}
}
