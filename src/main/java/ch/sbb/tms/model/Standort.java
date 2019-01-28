package ch.sbb.tms.model;

/**
 * The location of a train on a platform at a particular time or {@link Darstellzeit} 
 *
 */
public class Standort {

	/**
	 * The phsyical location 
	 */
	private Betriebspunkt betriebspunkt;

	/**
	 * The time window 
	 */
	private Darstellzeit darstellzeit;

	/**
	 * The platform
	 */
	private Gleis gleis;

	/**
	 * 
	 * @return may not be <code>null</code>
	 */
	public Betriebspunkt getBetriebspunkt() {
		return betriebspunkt;
	}

	/**
	 * 
	 * @param betriebspunkt may not be <code>null</code>
	 */
	public void setBetriebspunkt(Betriebspunkt betriebspunkt) {
		this.betriebspunkt = betriebspunkt;
	}

	/**
	 * 
	 * @return may not be <code>null</code>
	 */
	public Darstellzeit getDarstellzeit() {
		return darstellzeit;
	}

	/**
	 * 
	 * @param darstellzeit may not be <code>null</code>
	 */
	public void setDarstellzeit(Darstellzeit darstellzeit) {
		this.darstellzeit = darstellzeit;
	}

	/**
	 * 
	 * @return may be <code>null</code>
	 */
	public Gleis getGleis() {
		return gleis;
	}

	/**
	 * 
	 * @param gleis may be <code>null</code>
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
		Standort other = (Standort) obj;
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
