package ch.sbb.tms.model;

/**
 * 
 * @author fsnets20
 *
 */
public class Standtord {

	/**
	 * 
	 */
	private Betriebspunkt betriebspunkt;

	/**
	 * 
	 */
	private Darstellzeit darstellzeit;

	/**
	 * 
	 */
	private Gleis gleis;

	/**
	 * 
	 * @return
	 */
	public Betriebspunkt getBetriebspunkt() {
		return betriebspunkt;
	}

	/**
	 * 
	 * @param betriebspunkt
	 */
	public void setBetriebspunkt(Betriebspunkt betriebspunkt) {
		this.betriebspunkt = betriebspunkt;
	}

	/**
	 * 
	 * @return
	 */
	public Darstellzeit getDarstellzeit() {
		return darstellzeit;
	}

	/**
	 * 
	 * @param darstellzeit
	 */
	public void setDarstellzeit(Darstellzeit darstellzeit) {
		this.darstellzeit = darstellzeit;
	}

	/**
	 * 
	 * @return
	 */
	public Gleis getGleis() {
		return gleis;
	}

	/**
	 * 
	 * @param gleis
	 */
	public void setGleis(Gleis gleis) {
		this.gleis = gleis;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((betriebspunkt == null) ? 0 : betriebspunkt.hashCode());
		result = prime * result + ((darstellzeit == null) ? 0 : darstellzeit.hashCode());
		result = prime * result + ((gleis == null) ? 0 : gleis.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Standtord other = (Standtord) obj;
		if (betriebspunkt == null) {
			if (other.betriebspunkt != null)
				return false;
		} else if (!betriebspunkt.equals(other.betriebspunkt))
			return false;
		if (darstellzeit == null) {
			if (other.darstellzeit != null)
				return false;
		} else if (!darstellzeit.equals(other.darstellzeit))
			return false;
		if (gleis == null) {
			if (other.gleis != null)
				return false;
		} else if (!gleis.equals(other.gleis))
			return false;
		return true;
	}

}
