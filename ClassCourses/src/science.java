
public class science extends courses{
	int labs;
	int fieldtrips;
	
	public science(int labsArgs, int fieldtripsArgs){
		super(null,0, null, null);
		labs = labsArgs;
		fieldtrips = fieldtripsArgs;
		
	}
	
	/**
	 * @return the labs
	 */
	public int getLabs() {
		return labs;
	}
	/**
	 * @param labs the labs to set
	 */
	public void setLabs(int labs) {
		this.labs = labs;
	}
	/**
	 * @return the fieldtrips
	 */
	public int getFieldtrips() {
		return fieldtrips;
	}
	/**
	 * @param fieldtrips the fieldtrips to set
	 */
	public void setFieldtrips(int fieldtrips) {
		this.fieldtrips = fieldtrips;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+ "science [labs=" + labs + ", fieldtrips=" + fieldtrips + "]";
	}

	
}
