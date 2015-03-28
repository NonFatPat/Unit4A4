
public class Autobiogorphy extends material{
	String nonFiction;
	String person;
	
	public Autobiogorphy (String nonFictionArgs, String personArgs){
		super(null, null, null, 0);
		nonFiction = nonFictionArgs;
		person = personArgs;
	}
	/**
	 * @return the nonFiction
	 */
	public String getNonFiction() {
		return nonFiction;
	}
	/**
	 * @param nonFiction the nonFiction to set
	 */
	public void setNonFiction(String nonFiction) {
		this.nonFiction = nonFiction;
	}
	/**
	 * @return the person
	 */
	public String getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(String person) {
		this.person = person;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+"Autobiogorphy [nonFiction=" + nonFiction + ", person=" + person
				+ "]";
	}
	
	
}
