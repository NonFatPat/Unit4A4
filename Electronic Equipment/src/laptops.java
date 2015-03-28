
public class laptops extends electronics{
String keyboard;
String webcam;
int batterylife;

	public laptops (String keyboardArgs, String webcamArgs, int batterylifeArgs){
	super(0, 0, 0, null);
	keyboard = keyboardArgs;
	webcam = webcamArgs;
	batterylife = batterylifeArgs;
	
	
}
/**
 * @return the keybored
 */
public String getKeybored() {
	return keyboard;
}
/**
 * @param keybored the keybored to set
 */
public void setKeybored(String keybored) {
	this.keyboard = keybored;
}
/**
 * @return the webcam
 */
public String getWebcam() {
	return webcam;
}
/**
 * @param webcam the webcam to set
 */
public void setWebcam(String webcam) {
	this.webcam = webcam;
}
/**
 * @return the batterylife
 */
public int getBatterylife() {
	return batterylife;
}
/**
 * @param batterylife the batterylife to set
 */
public void setBatterylife(int batterylife) {
	this.batterylife = batterylife;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return super.toString() + "laptops [keybored=" + keyboard + ", webcam=" + webcam
			+ ", batterylife=" + batterylife + "]";
}


}
