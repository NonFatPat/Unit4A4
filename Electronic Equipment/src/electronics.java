
public class electronics {
int cost;
int weight;
int powerusage;
String manufacture;

public electronics (int c, int w , int p, String m){
	cost = c;
	weight = w;
	powerusage = p;
	manufacture = m;
}
/**
 * @return the cost
 */
public int getCost() {
	return cost;
}
/**
 * @param cost the cost to set
 */
public void setCost(int cost) {
	this.cost = cost;
}
/**
 * @return the weight
 */
public int getWeight() {
	return weight;
}
/**
 * @param weight the weight to set
 */
public void setWeight(int weight) {
	this.weight = weight;
}
/**
 * @return the powerusage
 */
public int getPowerusage() {
	return powerusage;
}
/**
 * @param powerusage the powerusage to set
 */
public void setPowerusage(int powerusage) {
	this.powerusage = powerusage;
}
/**
 * @return the manufacture
 */
public String getManufacture() {
	return manufacture;
}
/**
 * @param manufacture the manufacture to set
 */
public void setManufacture(String manufacture) {
	this.manufacture = manufacture;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "electronics [cost=" + cost + ", weight=" + weight + ", powerusage="
			+ powerusage + ", manufacture=" + manufacture + "]";
}



}
