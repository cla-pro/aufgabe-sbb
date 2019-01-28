package ch.sbb.tms.model;

/**
 * Defines the a point in the SBB Network Topology, often called a BP
 */
public class Betriebspunkt {

	private String abkuerzung;

	/**
	 * 
	 * @return the abbreviation of the BP may be <code>null</code>
	 */
	public String getAbkuerzung() {
		return abkuerzung;
	}

	/** Set the abbreviation, null may be set although it doesn't make sense
	 * 
	 * @param abkuerzung
	 *            the abbreviation to set
	 */
	public void setAbkuerzung(String abkuerzung) {
		this.abkuerzung = abkuerzung;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abkuerzung == null) ? 0 : abkuerzung.hashCode());
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
		Betriebspunkt other = (Betriebspunkt) obj;
		if (abkuerzung == null) {
			if (other.abkuerzung != null)
				return false;
		} else if (!abkuerzung.equals(other.abkuerzung))
			return false;
		return true;
	}

}
