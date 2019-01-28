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
	private List<Standort> standtord;

	/**
	 * 
	 */
	private String trassenId;

	/**
	 * 
	 * @return
	 */
	public List<Standort> getStandtord() {
		return standtord;
	}

	/**
	 * 
	 * @param standtord
	 */
	public void setStandtord(List<Standort> standtord) {
		this.standtord = standtord;
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
		result = prime * result + ((standtord == null) ? 0 : standtord.hashCode());
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
		if (standtord == null) {
			if (other.standtord != null)
				return false;
		} else if (!standtord.equals(other.standtord))
			return false;
		if (trassenId == null) {
			if (other.trassenId != null)
				return false;
		} else if (!trassenId.equals(other.trassenId))
			return false;
		return true;
	}

}
