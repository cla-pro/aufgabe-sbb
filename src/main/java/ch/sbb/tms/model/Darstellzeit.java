package ch.sbb.tms.model;

import java.time.Instant;

public class Darstellzeit {

	/**
	 * The geographical location
	 */
	private Betriebstag betriebstag;

	/**
	 * The arrival train of a train
	 */
	private Instant an;

	/**
	 * The departure time of a time
	 */
	private Instant ab;

	/**
	 * 
	 * @return
	 */
	public Betriebstag getBetriebstag() {
		return betriebstag;
	}

	/**
	 * 
	 * @param betriebstag
	 *            may not <code>null</code>
	 */
	public void setBetriebstag(Betriebstag betriebstag) {
		this.betriebstag = betriebstag;
	}

	/**
	 * 
	 * @return may be <code>null</code>
	 */
	public Instant getAn() {
		return an;
	}

	/**
	 * 
	 * @param an
	 *            may be <code>null</code>
	 */
	public void setAn(Instant an) {
		this.an = an;
	}

	/**
	 * @return may be <code>null</code>
	 * 
	 */
	public Instant getAb() {
		return ab;
	}

	/**
	 * 
	 * @param ab
	 *            may be <code>null</code>
	 */
	public void setAb(Instant ab) {
		this.ab = ab;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((betriebstag == null) ? 0 : betriebstag.hashCode());
		result = prime * result + ((ab == null) ? 0 : ab.hashCode());
		result = prime * result + ((an == null) ? 0 : an.hashCode());
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
		Darstellzeit other = (Darstellzeit) obj;
		if (betriebstag == null) {
			if (other.betriebstag != null)
				return false;
		} else if (!betriebstag.equals(other.betriebstag))
			return false;
		if (ab == null) {
			if (other.ab != null)
				return false;
		} else if (!ab.equals(other.ab))
			return false;
		if (an == null) {
			if (other.an != null)
				return false;
		} else if (!an.equals(other.an))
			return false;
		return true;
	}

}
