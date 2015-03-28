
public class textbook extends material{
String schoolCorse;
String schoolLevel;

public textbook(String schoolCourseArgs, String schoolLevelArgs ){
	super(null, null, null, 0);
	schoolCorse = schoolCourseArgs;
	schoolLevel = schoolLevelArgs;
}

/**
 * @return the schoolCorse
 */
public String getSchoolCorse() {
	return schoolCorse;
}
/**
 * @param schoolCorse the schoolCorse to set
 */
public void setSchoolCorse(String schoolCorse) {
	this.schoolCorse = schoolCorse;
}
/**
 * @return the schoolLevel
 */
public String getSchoolLevel() {
	return schoolLevel;
}
/**
 * @param schoolLevel the schoolLevel to set
 */
public void setSchoolLevel(String schoolLevel) {
	this.schoolLevel = schoolLevel;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return super.toString()+ "textbook [schoolCorse=" + schoolCorse + ", schoolLevel="
			+ schoolLevel + "]";
}

}
