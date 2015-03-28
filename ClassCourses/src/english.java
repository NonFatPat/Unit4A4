
public class english extends courses {
	int papers;
	int books2read;
	public english( int papersArgs, int books2readArgs){
		super(null, 0, null, null);
		papers = papersArgs;
		books2read = books2readArgs;
	}
	
	/**
	 * @return the papers
	 */
	public int getPapers() {
		return papers;
	}
	/**
	 * @param papers the papers to set
	 */
	public void setPapers(int papers) {
		this.papers = papers;
	}
	/**
	 * @return the books2read
	 */
	public int getBooks2read() {
		return books2read;
	}
	/**
	 * @param books2read the books2read to set
	 */
	public void setBooks2read(int books2read) {
		this.books2read = books2read;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "English [papers=" + papers + ", books2read=" + books2read + "]";
	}
	

}
