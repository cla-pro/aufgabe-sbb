package ch.sbb.tms.model;

/**
 * 
 * @author fsnets20
 *
 */
public class Betriebspunkt {

	private String abkuerzung;

	/**
	 * 
	 * @return
	 */
	public String getAbkuerzung() {
		return abkuerzung;
	}

	/**
	 * 
	 * @param abkuerzung
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
