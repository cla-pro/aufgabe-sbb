package ch.sbb.tms.model;

/**
 * 
 * @author fsnets20
 *
 */
public class Gleis {

	/**
	 * 
	 */
	private Long gleisIdentifier;

	/**
	 * 
	 * @return
	 */
	public Long getGleisIdentifier() {
		return gleisIdentifier;
	}

	/**
	 * 
	 * @param gleisIdentifier
	 */
	public void setGleisIdentifier(Long gleisIdentifier) {
		this.gleisIdentifier = gleisIdentifier;
	}

	/**
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gleisIdentifier == null) ? 0 : gleisIdentifier.hashCode());
		return result;
	}

	/**
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gleis other = (Gleis) obj;
		if (gleisIdentifier == null) {
			if (other.gleisIdentifier != null)
				return false;
		} else if (!gleisIdentifier.equals(other.gleisIdentifier))
			return false;
		return true;
	}

}
