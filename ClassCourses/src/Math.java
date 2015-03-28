
public class Math extends courses{
 int formulas;
 int test;
 
 public Math (int formulasArgs, int testArgs){
	 super(null, 0, null, null);
	 formulas = formulasArgs;
	 test = testArgs;
	 
 }
/**
 * @return the formulas
 */
public int getFormulas() {
	return formulas;
}
/**
 * @param formulas the formulas to set
 */
public void setFormulas(int formulas) {
	this.formulas = formulas;
}
/**
 * @return the test
 */
public int getTest() {
	return test;
}
/**
 * @param test the test to set
 */
public void setTest(int test) {
	this.test = test;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return super.toString() + "Math [formulas=" + formulas + ", test=" + test + "]";
}



}
