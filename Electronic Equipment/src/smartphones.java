
public class smartphones extends electronics{
	String frame;
	String feature;
	
	public smartphones (String frameArgs, String featureArgs){
		super(0, 0, 0, null);
		frame = frameArgs;
		feature = featureArgs;
	
	}
	/**
	 * @return the frame
	 */
	public String getFrame() {
		return frame;
	}
	/**
	 * @param frame the frame to set
	 */
	public void setFrame(String frame) {
		this.frame = frame;
	}
	/**
	 * @return the feature
	 */
	public String getFeature() {
		return feature;
	}
	/**
	 * @param feature the feature to set
	 */
	public void setFeature(String feature) {
		this.feature = feature;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+ "smartphones [frame=" + frame + ", feature=" + feature + "]";
	}
	
	
	

}
