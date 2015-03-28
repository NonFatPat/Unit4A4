
public class technicaljournals extends material{
	String topic;
	String scientist;
	public technicaljournals(String topicArgs, String scientistArgs){
		super(null, null, null, 0);
		topic = topicArgs;
		scientist = scientistArgs;
	}
	/**
	 * @return the topic
	 */
	public String getTopic() {
		return topic;
	}
	/**
	 * @param topic the topic to set
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}
	/**
	 * @return the scientist
	 */
	public String getScientist() {
		return scientist;
	}
	/**
	 * @param scientist the scientist to set
	 */
	public void setScientist(String scientist) {
		this.scientist = scientist;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+"technicaljournals [topic=" + topic + ", scientist=" + scientist
				+ "]";
	}
	
}
