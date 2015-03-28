
public class courses {
	String title;
	int number;
	String descrption;
	String department;
	
	
	public courses(String titleArgs, int numberArgs, String descrptionArgs, String departmentArgs){
		title = titleArgs;
		number = numberArgs;
		descrption = descrptionArgs;
		department= departmentArgs;
		
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
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	/**
	 * @return the descrption
	 */
	public String getDescrption() {
		return descrption;
	}
	/**
	 * @param descrption the descrption to set
	 */
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "courses [title=" + title + ", number=" + number
				+ ", descrption=" + descrption + ", department=" + department
				+ "]";
	}
	
	
}
