package ch.sbb.tms.model;

public class Betriebstag {

	/**
	 * 
	 */
	private Long day;

	/**
	 * 
	 * @return
	 */
	public Long getDay() {
		return day;
	}

	/**
	 * 
	 * @param day
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
