
public class magazines extends material{
	String pictures;
	String articles;
	
	public magazines(String picturesArgs, String articlesArgs){
		super(null, null, null, 0);
		pictures = picturesArgs;
		articles = articlesArgs;
	}
	/**
	 * @return the pictures
	 */
	public String isPictures() {
		return pictures;
	}
	/**
	 * @param pictures the pictures to set
	 */
	public void setPictures(String pictures) {
		this.pictures = pictures;
	}
	/**
	 * @return the articles
	 */
	public String getArticles() {
		return articles;
	}
	/**
	 * @param articles the articles to set
	 */
	public void setArticles(String articles) {
		this.articles = articles;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+"magazines [pictures=" + pictures + ", articles=" + articles
				+ "]";
	}
	
}
