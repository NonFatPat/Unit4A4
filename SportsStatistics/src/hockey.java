
public class hockey extends person{
	public int fights = 0;
	public int pIM = 0;
	public int games = 0;
	
	
	public hockey(int fightsArgs, int pIMArgs, int gamesArgs){
		super(null,0,0,0);
		fights = fightsArgs;
		pIM = pIMArgs;
		games = gamesArgs;
	}
	/**
	 * @return the fights
	 */
	public int getFights() {
		return fights;
	}
	/**
	 * @param fights the fights to set
	 */
	public void setFights(int fights) {
		this.fights = fights;
	}
	/**
	 * @return the pIM
	 */
	public int getpIM() {
		return pIM;
	}
	/**
	 * @param pIM the pIM to set
	 */
	public void setpIM(int pIM) {
		this.pIM = pIM;
	}
	/**
	 * @return the games
	 */
	public int getGames() {
		return games;
	}
	/**
	 * @param games the games to set
	 */
	public void setGames(int games) {
		this.games = games;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+"hockey [fights=" + fights + ", pIM=" + pIM + ", games=" + games
				+ "]";
	}
	
	

	

}
