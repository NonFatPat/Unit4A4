
public class material {
String cover;
String title;
String author;
int pagenumber;


public material(String coverArgs, String titleArgs, String authorArgs, int pagenumberArgs){
	cover = coverArgs;
	title = titleArgs;
	author = authorArgs;
	pagenumber = pagenumberArgs;
	
}
/**
 * @return the cover
 */
public String getCover() {
	return cover;
}
/**
 * @param cover the cover to set
 */
public void setCover(String cover) {
	this.cover = cover;
}
/**
 * @return the title
 */
public String getTitle() {
	return title;
}
/**
 * @param title the title to set
 */
public void setTitle(String title) {
	this.title = title;
}
/**
 * @return the author
 */
public String getAuthor() {
	return author;
}
/**
 * @param author the author to set
 */
public void setAuthor(String author) {
	this.author = author;
}
/**
 * @return the pagenumber
 */
public int getPagenumber() {
	return pagenumber;
}
/**
 * @param pagenumber the pagenumber to set
 */
public void setPagenumber(int pagenumber) {
	this.pagenumber = pagenumber;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "material [cover=" + cover + ", title=" + title + ", author="
			+ author + ", pagenumber=" + pagenumber + "]";
}


}
