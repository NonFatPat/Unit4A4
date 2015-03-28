
public class computers extends electronics {
	String size;
	String processor;
	int harddrive;
	
	public computers (String sizeArgs, String processorArgs, int harddriveArgs){
		super(0, 0, 0, null);
		size = sizeArgs;
		processor = processorArgs;
		harddrive = harddriveArgs;
	}
	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	/**
	 * @return the processor
	 */
	public String getProcessor() {
		return processor;
	}
	/**
	 * @param processor the processor to set
	 */
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	/**
	 * @return the harddrive
	 */
	public int getHarddrive() {
		return harddrive;
	}
	/**
	 * @param harddrive the harddrive to set
	 */
	public void setHarddrive(int harddrive) {
		this.harddrive = harddrive;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "computers [size=" + size + ", processor=" + processor
				+ ", harddrive=" + harddrive + "]";
	}

	
}
