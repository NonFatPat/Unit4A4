
public class novels extends material{

	String fiction;
	String mCharacter;
	
	public novels(String fictionArgs, String mCharacterArgs){
		super(null, null, null, 0);
		fiction = fictionArgs;
		mCharacter = mCharacterArgs;
		
	}
	/**
	 * @return the fiction
	 */
	public String getFiction() {
		return fiction;
	}
	/**
	 * @param fiction the fiction to set
	 */
	public void setFiction(String fiction) {
		this.fiction = fiction;
	}
	/**
	 * @return the mCharacter
	 */
	public String getmCharacter() {
		return mCharacter;
	}
	/**
	 * @param mCharacter the mCharacter to set
	 */
	public void setmCharacter(String mCharacter) {
		this.mCharacter = mCharacter;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "novels [fiction=" + fiction + ", mCharacter=" + mCharacter
				+ "]";
	}
	
	
	

}
