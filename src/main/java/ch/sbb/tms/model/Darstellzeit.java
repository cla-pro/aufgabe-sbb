package ch.sbb.tms.model;

import java.time.Instant;

public class Darstellzeit {

	/**
	 * 
	 */
	private Betriebspunkt betriebspunkt;

	/**
	 * 
	 */
	private Instant von;

	/**
	 * 
	 */
	private Instant bis;

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
	public Instant getVon() {
		return von;
	}

	/**
	 * 
	 * @param von
	 */
	public void setVon(Instant von) {
		this.von = von;
	}

	/**
	 */
	public Instant getBis() {
		return bis;
	}

	/**
	 * 
	 * @param bis
	 */
	public void setBis(Instant bis) {
		this.bis = bis;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((betriebspunkt == null) ? 0 : betriebspunkt.hashCode());
		result = prime * result + ((bis == null) ? 0 : bis.hashCode());
		result = prime * result + ((von == null) ? 0 : von.hashCode());
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
		if (betriebspunkt == null) {
			if (other.betriebspunkt != null)
				return false;
		} else if (!betriebspunkt.equals(other.betriebspunkt))
			return false;
		if (bis == null) {
			if (other.bis != null)
				return false;
		} else if (!bis.equals(other.bis))
			return false;
		if (von == null) {
			if (other.von != null)
				return false;
		} else if (!von.equals(other.von))
			return false;
		return true;
	}

}
