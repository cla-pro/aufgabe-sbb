package ch.sbb.tms.model;

/**
 * 
 */
import java.util.List;

/**
 * Position of the train
 * 
 * @author fsnets20
 *
 */
public class GleisBelegung {

	/**
	 * 
	 */
	private List<Standort> standtords;

	/**
	 * 
	 */
	private String trassenId;

	/**
	 * 
	 * @return
	 */
	public List<Standort> getStandtord() {
		return standtords;
	}

	/**
	 * 
	 * @param standtord
	 */
	public void setStandtord(List<Standort> standtord) {
		this.standtords = standtord;
	}

	/**
	 * 
	 * @return
	 */
	public String getTrassenId() {
		return trassenId;
	}

	/**
	 * 
	 * @param trassenId
	 */
	public void setTrassenId(String trassenId) {
		this.trassenId = trassenId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((standtords == null) ? 0 : standtords.hashCode());
		result = prime * result + ((trassenId == null) ? 0 : trassenId.hashCode());
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
		GleisBelegung other = (GleisBelegung) obj;
		if (standtords == null) {
			if (other.standtords != null)
				return false;
		} else if (!standtords.equals(other.standtords))
			return false;
		if (trassenId == null) {
			if (other.trassenId != null)
				return false;
		} else if (!trassenId.equals(other.trassenId))
			return false;
		return true;
	}

}
