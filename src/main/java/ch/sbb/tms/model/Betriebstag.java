package ch.sbb.tms.model;

/**
 * A time construct based on the Fahrplan starting date
 */
public class Betriebstag {

	/**
	 * a numeric representation, for example #00000001..... the
	 * {@link GleisBelegung} is valid on the first day of the Fahrplan
	 */
	private Long day;

	/**
	 * 
	 * @return may be <code>null</code>
	 */
	public Long getDay() {
		return day;
	}

	/**
	 * 
	 * @param day
	 *            may be <code>null</code>
	 */
	public void setDay(Long day) {
		this.day = day;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
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
		Betriebstag other = (Betriebstag) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		return true;
	}

}
