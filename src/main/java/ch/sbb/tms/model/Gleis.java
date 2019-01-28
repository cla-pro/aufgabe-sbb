package ch.sbb.tms.model;

/**
 * Contains an id for the HGBPHauptgleis
 */
public class Gleis {

	private String hgbpHauptgleisIndentifier;

	/**
	 * @return may be <code>null</code>
	 */
	public String getHgbpHauptgliesIndentifier() {
		return hgbpHauptgleisIndentifier;
	}

	/**
	 * @param hgbpHauptgliesIndentifier
	 *            may not <code>null</code>
	 */
	public void setHgbpHauptgliesIndentifier(String hgbpHauptgleisIndentifier) {
		this.hgbpHauptgleisIndentifier = hgbpHauptgleisIndentifier;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hgbpHauptgleisIndentifier == null) ? 0 : hgbpHauptgleisIndentifier.hashCode());
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
		Gleis other = (Gleis) obj;
		if (hgbpHauptgleisIndentifier == null) {
			if (other.hgbpHauptgleisIndentifier != null)
				return false;
		} else if (!hgbpHauptgleisIndentifier.equals(other.hgbpHauptgleisIndentifier))
			return false;
		return true;
	}

}
