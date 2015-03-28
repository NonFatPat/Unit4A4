
public class soccer extends person{
public String team;
public int goals;
public int blocks;
public int steals;

public soccer(String teamArgs, int goalsArgs, int blocksArgs, int stealsArgs){
	super(null, 0, 0, 0);
	team = teamArgs;
	goals = goalsArgs;
	blocks = blocksArgs;
	steals = stealsArgs;
}
/**
 * @return the team
 */
public String getTeam() {
	return team;
}
/**
 * @param team the team to set
 */
public void setTeam(String team) {
	this.team = team;
}
/**
 * @return the goals
 */
public int getGoals() {
	return goals;
}
/**
 * @param goals the goals to set
 */
public void setGoals(int goals) {
	this.goals = goals;
}
/**
 * @return the blocks
 */
public int getBlocks() {
	return blocks;
}
/**
 * @param blocks the blocks to set
 */
public void setBlocks(int blocks) {
	this.blocks = blocks;
}
/**
 * @return the steals
 */
public int getSteals() {
	return steals;
}
/**
 * @param steals the steals to set
 */
public void setSteals(int steals) {
	this.steals = steals;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return super.toString() + "soccer [team=" + team + ", goals=" + goals + ", blocks=" + blocks
			+ ", steals=" + steals + "]";
}


}
