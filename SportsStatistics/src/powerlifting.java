
public class powerlifting extends person{
public int bench;
public int squat;
public int deadlift;


public powerlifting(int benchArg, int squatArg, int deadliftArg){
	super(null, 0, 0, 0);
	bench = benchArg;
	squat = squatArg;
	deadlift = deadliftArg;
}
/**
 * @return the bench
 */
public int getBench() {
	return bench;
}
/**
 * @param bench the bench to set
 */
public void setBench(int bench) {
	this.bench = bench;
}
/**
 * @return the squat
 */
public int getSquat() {
	return squat;
}
/**
 * @param squat the squat to set
 */
public void setSquat(int squat) {
	this.squat = squat;
}
/**
 * @return the deadlift
 */
public int getDeadlift() {
	return deadlift;
}
/**
 * @param deadlift the deadlift to set
 */
public void setDeadlift(int deadlift) {
	this.deadlift = deadlift;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return super.toString()+ "powerlifting [bench=" + bench + ", squat=" + squat + ", deadlift="
			+ deadlift + "]";
}

}
